package com.example.springdailyquiz.dto;

import com.example.springdailyquiz.domain.Order;
import java.util.stream.Collectors;
import lombok.*;

import java.util.List;

@Data
public class OrderDto {

	private Long id;
	private Long customerId;
	private Long storeId;
	private List<OrderItemDto> orderItems;
	private String status;
	private double totalAmount;

	public static OrderDto convertToDto(Order order) {
		OrderDto orderDto = new OrderDto();
		orderDto.setId(order.getId());
		orderDto.setCustomerId(order.getCustomer().getId());
		orderDto.setStoreId(order.getStore().getId());
		orderDto.setStatus(order.getStatus().name());
		orderDto.setTotalAmount(order.getTotalAmount());
		List<OrderItemDto> orderItemDtos = order.getOrderItems().stream().
			map(OrderItemDto::convertToDto).
			collect(Collectors.toList());
		orderDto.setOrderItems(orderItemDtos);
		return orderDto;
	}
}