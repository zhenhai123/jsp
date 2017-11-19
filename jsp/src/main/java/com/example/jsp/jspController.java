package com.example.jsp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class jspController {
	
	@RequestMapping(value="/")
	public String index(ModelMap map){
		
		map.addAttribute("hello", "你好");
		return "index";
	}

}
