package com.example.springdailyquiz.service;

import com.example.springdailyquiz.domain.Menu;
import com.example.springdailyquiz.dto.MenuDto;
import com.example.springdailyquiz.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional(readOnly = true)
public class MenuService {

	private final MenuRepository menuRepository;

	@Autowired
	public MenuService(MenuRepository menuRepository) {
		this.menuRepository = menuRepository;
	}

	@Transactional
	public MenuDto createMenu(MenuDto menuDto) {
		Menu menu = new Menu();
		menu.setName(menuDto.getName());
		menu.setCategory(menuDto.getCategory());
		menu.setPrice(menuDto.getPrice());
		menu.setDescription(menuDto.getDescription());
		menuRepository.save(menu);
		menuDto.setId(menu.getId());
		return menuDto;
	}

	public List<MenuDto> getAllMenus() {
		return menuRepository.findAll().stream().
			map(MenuDto::convertToDto).
			collect(Collectors.toList());
	}

	public Optional<MenuDto> getMenuById(Long id) {
		return menuRepository.findById(id).map(MenuDto::convertToDto);
	}

	@Transactional
	public MenuDto updateMenu(Long id, MenuDto menuDto) {
		Optional<Menu> optionalMenu = menuRepository.findById(id);
		if (optionalMenu.isPresent()) {
			Menu menu = optionalMenu.get();
			menu.setName(menuDto.getName());
			menu.setCategory(menuDto.getCategory());
			menu.setPrice(menuDto.getPrice());
			menu.setDescription(menuDto.getDescription());
			menuRepository.save(menu);
			return menuDto;
		}
		return null;
	}

	@Transactional
	public void deleteMenu(Long id) {
		menuRepository.deleteById(id);
	}

	public List<MenuDto> getMenusByCategory(String category) {
		return menuRepository.findByCategory(category).stream().map(MenuDto::convertToDto)
			.collect(Collectors.toList());
	}
}
