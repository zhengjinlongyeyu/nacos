package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.LongService;

@RestController
public class TestNacos {
	
	
	@GetMapping("/getname")
	public String getname() {
		System.out.println("进来了+++++++++++++++>" );
		return "ok";
		
	}
	
	

	
	




}
