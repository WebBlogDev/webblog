package ru.webblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Index {


	@RequestMapping(method = RequestMethod.GET,value="/")
	public String index(){
		return "index";
	}
	@RequestMapping(method = RequestMethod.GET,value="/login")
	public String loginPage(){
		return "login";
	}
	@RequestMapping(method = RequestMethod.GET,value="/faq")
	public String faqPage(){
		return "faq";
	}
}
