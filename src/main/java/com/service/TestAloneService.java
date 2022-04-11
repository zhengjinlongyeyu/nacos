package com.service;

import org.springframework.web.bind.annotation.RequestMapping;

public interface TestAloneService {
	
	/**
	 * 真是开了眼界了，这个接口要定义对外的url,目前是接口
	 * @description 
	 * @author Jeff
	 * @date 2022年4月6日
	 * @return
	 */
	@RequestMapping("/gettest")
	public String gettest();

}
