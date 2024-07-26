package com.example.springdailyquiz.dto;

import com.example.springdailyquiz.domain.Customer;
import lombok.*;

@Data
public class CustomerDto {
    private Long id;
    private String name;
    private String phoneNumber;
    private String address;

    public static CustomerDto convertToDto(Customer customer) {
        CustomerDto customerDto = new CustomerDto();
        customerDto.setId(customer.getId());
        customerDto.setName(customer.getName());
        customerDto.setPhoneNumber(customer.getPhoneNumber());
        customerDto.setAddress(customer.getAddress());
        return customerDto;
    }
}