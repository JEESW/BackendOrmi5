package com.example.springdailyquiz.dto;

import com.example.springdailyquiz.domain.Menu;
import lombok.*;

@Data
public class MenuDto {
    private Long id;
    private String name;
    private String category;
    private Double price;
    private String description;

    public static MenuDto convertToDto(Menu menu) {
        MenuDto menuDto = new MenuDto();
        menuDto.setId(menu.getId());
        menuDto.setName(menu.getName());
        menuDto.setCategory(menu.getCategory());
        menuDto.setPrice(menu.getPrice());
        menuDto.setDescription(menu.getDescription());
        return menuDto;
    }
}