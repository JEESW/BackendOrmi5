package com.example.springdailyquiz.service;

import com.example.springdailyquiz.domain.Customer;
import com.example.springdailyquiz.dto.CustomerDto;
import com.example.springdailyquiz.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional(readOnly = true)
public class CustomerService {

	private final CustomerRepository customerRepository;

	@Autowired
	public CustomerService(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	@Transactional
	public CustomerDto createCustomer(CustomerDto customerDto) {
		Customer customer = new Customer();
		customer.setName(customerDto.getName());
		customer.setPhoneNumber(customerDto.getPhoneNumber());
		customer.setAddress(customerDto.getAddress());
		customerRepository.save(customer);
		customerDto.setId(customer.getId());
		return customerDto;
	}

	public List<CustomerDto> getAllCustomers() {
		return customerRepository.findAll().stream().
			map(CustomerDto::convertToDto).
            collect(Collectors.toList());
	}

	public Optional<CustomerDto> getCustomerById(Long id) {
		return customerRepository.findById(id).map(CustomerDto::convertToDto);
	}

	@Transactional
	public CustomerDto updateCustomer(Long id, CustomerDto customerDto) {
		Optional<Customer> optionalCustomer = customerRepository.findById(id);
		if (optionalCustomer.isPresent()) {
			Customer customer = optionalCustomer.get();
			customer.setName(customerDto.getName());
			customer.setPhoneNumber(customerDto.getPhoneNumber());
			customer.setAddress(customerDto.getAddress());
			customerRepository.save(customer);
			return customerDto;
		}
		return null;
	}

	@Transactional
	public void deleteCustomer(Long id) {
		customerRepository.deleteById(id);
	}
}