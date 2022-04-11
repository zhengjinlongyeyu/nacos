package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.devtools.restart.RestartScope;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.service.LongService;


@RestController
@RefreshScope
public class URLController {
	
	@Autowired
	private LongService longService;
	/**
	 * 普通信息的获取 可以读取配置中心  像一些关键性的信息 还是得从本地读取  如果自己手写加载配置可能可以实现从配置中心加载
	 */
//	@Value("${longname}")
//	private String longname;

/**
 * openFeign 正常写接口  区别在于 调用的时候，要定义一个映射 
 * @description 
 * @author Jeff
 * @date 2022年4月6日
 * @return
 */
	@RequestMapping("/getlong")
	public String  getlong(@RequestParam("aaaa") String aaaa) {
		System.out.println("+++++++++++++>"+aaaa );
		String getlong = longService.getlong(aaaa);
		
		return getlong;
	}
	
//	@RequestMapping("/longname")
//	public String  longname() {
//		
//		
//		return longname;
//	}
	
	
	@RequestMapping("/member")
	public String  member() {
		
		
		return "member";
	}
	
	
}
