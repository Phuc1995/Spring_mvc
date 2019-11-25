package com.laptrinhjavaweb.api.admin;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.laptrinhjavaweb.dto.NewDTO;

@RestController(value = "NewAPIOfAdmin")
public class NewAPI {
	@PostMapping("/api/new")	
	public NewDTO createNew(@RequestBody NewDTO newDTO) {	
		return newDTO;	
	}	

	@PutMapping	
	public NewDTO updateNew(@RequestBody NewDTO newDTO) {	
		return newDTO;	
	}	

	@DeleteMapping	
	public void deleteNew(@RequestBody long[] ids) {
}
}