package ru.webblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Index {


	@RequestMapping(method = RequestMethod.GET,value="/")
	public ModelAndView index(){
		ModelAndView mw = new ModelAndView();
		mw.setViewName("index");
		mw.addObject("layout","index");
		return mw;
	}
	@RequestMapping(method = RequestMethod.GET,value="/login")
	public ModelAndView loginPage(){
		ModelAndView mw = new ModelAndView();
		mw.setViewName("index");
		mw.addObject("layout","login");
		return mw;
	}
	@RequestMapping(method = RequestMethod.GET,value="/faq")
	public ModelAndView faqPage(){
		ModelAndView mw = new ModelAndView();
		mw.setViewName("index");
		mw.addObject("layout","faq");
		return mw;
	}
}
