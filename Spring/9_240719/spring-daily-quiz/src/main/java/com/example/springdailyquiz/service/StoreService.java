package com.example.springdailyquiz.service;

import com.example.springdailyquiz.domain.Store;
import com.example.springdailyquiz.dto.StoreDto;
import com.example.springdailyquiz.repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional(readOnly = true)
public class StoreService {

    private final StoreRepository storeRepository;

    @Autowired
    public StoreService(StoreRepository storeRepository) {
        this.storeRepository = storeRepository;
    }

    @Transactional
    public StoreDto createStore(StoreDto storeDto) {
        Store store = new Store();
        store.setName(storeDto.getName());
        store.setAddress(storeDto.getAddress());
        store.setPhoneNumber(storeDto.getPhoneNumber());
        storeRepository.save(store);
        storeDto.setId(store.getId());
        return storeDto;
    }

    public List<StoreDto> getAllStores() {
        return storeRepository.findAll().stream().map(StoreDto::convertToDto).collect(Collectors.toList());
    }

    public Optional<StoreDto> getStoreById(Long id) {
        return storeRepository.findById(id).map(StoreDto::convertToDto);
    }

    @Transactional
    public StoreDto updateStore(Long id, StoreDto storeDto) {
        Optional<Store> optionalStore = storeRepository.findById(id);
        if (optionalStore.isPresent()) {
            Store store = optionalStore.get();
            store.setName(storeDto.getName());
            store.setAddress(storeDto.getAddress());
            store.setPhoneNumber(storeDto.getPhoneNumber());
            storeRepository.save(store);
            return storeDto;
        }
        return null;
    }

    @Transactional
    public void deleteStore(Long id) {
        storeRepository.deleteById(id);
    }
}