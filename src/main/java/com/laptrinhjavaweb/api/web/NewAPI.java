package com.laptrinhjavaweb.api.web;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.laptrinhjavaweb.dto.NewDTO;

@RestController(value = "NewAPIOfWeb")
public class NewAPI {

	@PostMapping
	public NewDTO createBuilding() {
		return null;
	}
}
