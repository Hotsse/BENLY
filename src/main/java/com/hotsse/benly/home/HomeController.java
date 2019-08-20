package com.hotsse.benly.home;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ch.qos.logback.classic.Logger;

@Controller
@RequestMapping(value="/")
public class HomeController {
	
	protected final Logger logger = (Logger) LoggerFactory.getLogger(getClass());
	
	@RequestMapping(value="")
	@ResponseBody
	public String home() {
		
		return "hello world";
	}
}

