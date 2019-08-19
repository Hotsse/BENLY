package com.hotsse.benly.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value="/")
public class HomeController {
	
	@RequestMapping(value="")
	@ResponseBody
	public String home() {
		return "hello world";
	}
}

