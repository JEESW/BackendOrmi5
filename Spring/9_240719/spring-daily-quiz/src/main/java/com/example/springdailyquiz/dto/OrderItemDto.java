package com.example.springdailyquiz.dto;

import com.example.springdailyquiz.domain.OrderItem;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
public class OrderItemDto {
    private Long id;
    private Long menuId;
    private int quantity;
    private double price;

    public static OrderItemDto convertToDto(OrderItem orderItem) {
        OrderItemDto orderItemDto = new OrderItemDto();
        orderItemDto.setId(orderItem.getId());
        orderItemDto.setMenuId(orderItem.getMenu().getId());
        orderItemDto.setQuantity(orderItem.getQuantity());
        orderItemDto.setPrice(orderItem.getPrice());
        return orderItemDto;
    }
}