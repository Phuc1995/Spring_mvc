package com.laptrinhjavaweb.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.laptrinhjavaweb.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService {

	@Override
	public List<String> loadMenu() {
		List<String> menu = new ArrayList<String>();
		menu.add("Blog Java");
		menu.add("Hướng dẫn học java");
		menu.add("Liên Hệ");
		menu.add("Thanh Toán");
		return menu;
	}
	
}
