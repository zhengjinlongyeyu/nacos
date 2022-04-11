package com.service.impl;

import org.springframework.stereotype.Service;

import com.service.LongService;
@Service
public class LongServiceImpl implements LongService{

	@Override
	public String getlong(String aaaa) {
	
		return "我是神";
	}

}
