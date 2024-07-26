package com.example.springdailyquiz.dto;

import com.example.springdailyquiz.domain.Store;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
public class StoreDto {
    private Long id;
    private String name;
    private String address;
    private String phoneNumber;

    public static StoreDto convertToDto(Store store) {
        StoreDto storeDto = new StoreDto();
        storeDto.setId(store.getId());
        storeDto.setName(store.getName());
        storeDto.setAddress(store.getAddress());
        storeDto.setPhoneNumber(store.getPhoneNumber());
        return storeDto;
    }
}