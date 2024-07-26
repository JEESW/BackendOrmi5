package com.example.springdailyquiz.controller;

import com.example.springdailyquiz.dto.MenuDto;
import com.example.springdailyquiz.dto.OrderDto;
import com.example.springdailyquiz.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

	private final OrderService orderService;

	@Autowired
	public OrderController(OrderService orderService) {
		this.orderService = orderService;
	}

	@PostMapping
	public ResponseEntity<OrderDto> createOrder(@RequestBody OrderDto orderDto) {
		OrderDto createdOrder = orderService.createOrder(orderDto);
		return ResponseEntity.ok(createdOrder);
	}

	@GetMapping
	public ResponseEntity<List<OrderDto>> getAllOrders() {
		List<OrderDto> orders = orderService.getAllOrders();
		return ResponseEntity.ok(orders);
	}

	@GetMapping("/{id}")
	public ResponseEntity<OrderDto> getOrderById(@PathVariable Long id) {
		return orderService.getOrderById(id)
			.map(ResponseEntity::ok)
			.orElse(ResponseEntity.notFound().build());
	}

	@PutMapping("/{id}")
	public ResponseEntity<OrderDto> updateOrder(@PathVariable Long id,
		@RequestBody OrderDto orderDto) {
		OrderDto updatedOrder = orderService.updateOrder(id, orderDto);
		if (updatedOrder != null) {
			return ResponseEntity.ok(updatedOrder);
		}
		return ResponseEntity.notFound().build();
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> cancelOrder(@PathVariable Long id) {
		orderService.cancelOrder(id);
		return ResponseEntity.noContent().build();
	}

	@GetMapping("/sales")
	public ResponseEntity<List<OrderDto>> getSalesByStoreAndPeriod(@RequestParam Long storeId,
		@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date startDate,
		@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date endDate) {
		List<OrderDto> sales = orderService.getSalesByStoreAndPeriod(storeId, startDate, endDate);
		return ResponseEntity.ok(sales);
	}

	@GetMapping("/popular")
	public ResponseEntity<List<MenuDto>> getTop3PopularMenus() {
		List<MenuDto> topMenus = orderService.getTop3PopularMenus();
		return ResponseEntity.ok(topMenus);
	}
}