package com.service.impl;

import org.springframework.web.bind.annotation.RestController;

import com.service.TestAloneService;
/**
 * 这个@RestController 注解不能少，少了访问不到
 * @description 
 * @author Jeff
 * @date 2022年4月6日
 */
@RestController
public class TestAloneServiceImpl implements TestAloneService{

	@Override
	public String gettest() {
		
		return "我是狼人";
	}

}
