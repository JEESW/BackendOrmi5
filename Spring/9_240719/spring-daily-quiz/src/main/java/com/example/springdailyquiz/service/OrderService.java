package com.example.springdailyquiz.service;

import com.example.springdailyquiz.domain.*;
import com.example.springdailyquiz.dto.MenuDto;
import com.example.springdailyquiz.dto.OrderDto;
import com.example.springdailyquiz.dto.OrderItemDto;
import com.example.springdailyquiz.repository.CustomerRepository;
import com.example.springdailyquiz.repository.MenuRepository;
import com.example.springdailyquiz.repository.OrderItemRepository;
import com.example.springdailyquiz.repository.OrderRepository;
import com.example.springdailyquiz.repository.StoreRepository;
import java.util.OptionalInt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional(readOnly = true)
public class OrderService {

	private final OrderRepository orderRepository;
	private final OrderItemRepository orderItemRepository;
	private final CustomerRepository customerRepository;
	private final MenuRepository menuRepository;
	private final StoreRepository storeRepository;

	@Autowired
	public OrderService(OrderRepository orderRepository, OrderItemRepository orderItemRepository,
		CustomerRepository customerRepository, MenuRepository menuRepository,
		StoreRepository storeRepository) {
		this.orderRepository = orderRepository;
		this.orderItemRepository = orderItemRepository;
		this.customerRepository = customerRepository;
		this.menuRepository = menuRepository;
		this.storeRepository = storeRepository;
	}

	@Transactional
	public OrderDto createOrder(OrderDto orderDto) {
		Order order = new Order();
		Optional<Customer> customerOptional = customerRepository.findById(orderDto.getCustomerId());
		Optional<Store> storeOptional = storeRepository.findById(orderDto.getStoreId());

		if (customerOptional.isPresent() && storeOptional.isPresent()) {
			order.setCustomer(customerOptional.get());
			order.setStore(storeOptional.get());
			order.setStatus(OrderStatus.RECEIVED);
			order.setOrderDate(new Date());
			orderRepository.save(order);

			double totalAmount = 0;
			for (OrderItemDto itemDto : orderDto.getOrderItems()) {
				Optional<Menu> menuOptional = menuRepository.findById(itemDto.getMenuId());
				if (menuOptional.isPresent()) {
					OrderItem orderItem = new OrderItem();
					orderItem.setOrder(order);
					orderItem.setMenu(menuOptional.get());
					orderItem.setQuantity(itemDto.getQuantity());
					orderItem.setPrice(menuOptional.get().getPrice() * itemDto.getQuantity());
					orderItemRepository.save(orderItem);
					totalAmount += orderItem.getPrice();
				}
			}
			order.setTotalAmount(totalAmount);
			orderRepository.save(order);
			orderDto.setId(order.getId());
			orderDto.setTotalAmount(totalAmount);
			return orderDto;
		}
		return null;
	}

	public List<OrderDto> getAllOrders() {
		return orderRepository.findAll().stream().map(OrderDto::convertToDto)
			.collect(Collectors.toList());
	}

	public Optional<OrderDto> getOrderById(Long id) {
		return orderRepository.findById(id).map(OrderDto::convertToDto);
	}

	@Transactional
	public OrderDto updateOrder(Long id, OrderDto orderDto) {
		Optional<Order> optionalOrder = orderRepository.findById(id);
		if (optionalOrder.isPresent()) {
			Order order = optionalOrder.get();
			order.setStatus(OrderStatus.valueOf(orderDto.getStatus()));
			orderRepository.save(order);
			return orderDto;
		}
		return null;
	}

	@Transactional
	public void cancelOrder(Long id) {
		Optional<Order> optionalOrder = orderRepository.findById(id);
		if (optionalOrder.isPresent()) {
			Order order = optionalOrder.get();
			order.setStatus(OrderStatus.CANCELED);
			orderRepository.save(order);
		}
	}

	public List<OrderDto> getSalesByStoreAndPeriod(Long storeId, Date startDate, Date endDate) {
		List<Order> orders = orderRepository.findByStoreAndPeriod(storeId, startDate, endDate);
		return orders.stream().map(OrderDto::convertToDto).collect(Collectors.toList());
	}

	public List<MenuDto> getTop3PopularMenus() {
		return orderItemRepository.findTop3Menus().stream().map(MenuDto::convertToDto)
			.collect(Collectors.toList());
	}
}