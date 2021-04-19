package com.cts.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class StudentController {
	
	@RequestMapping("/welcome")
	public String greet() {//we  not prepare model or data
		return "index";	// index - view logical name
	}

	@RequestMapping("/ask")
	public String wish() {
		return "product";// product.jsp
	}

	@RequestMapping("/question")
	public String question() {
		return "question";//question.jsp
	}
	
//	@RequestMapping("/show")
//	public void showData(HttpServletRequest request) {
//		System.out.println(request.getParameter("qType"));
//		System.out.println(request.getParameter("personName"));
//	}
	@RequestMapping("/show")
	public ModelAndView showData(@RequestParam("qType") String queryType,@RequestParam("personName") String customerName) {
		System.out.println(queryType);
		System.out.println(customerName);
		ModelAndView mav=new ModelAndView();
		mav.setViewName("questioninfo");
		mav.addObject("qt",queryType);
		mav.addObject("cn",customerName);
		return mav;
	}
}
