package com.codingdojo.counter.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/your_server")
public class CounterController {
	public static final String countSessionVar = "count";
	
	@RequestMapping("/counter")
	public String visted(HttpSession session, Model model) {		 
		if (session.getAttribute(countSessionVar) == null) {			 
			session.setAttribute(countSessionVar, 0);
		}
		
		Integer currentCount = (Integer) session.getAttribute(countSessionVar);
		model.addAttribute(countSessionVar, currentCount);		
		
		return "counter.jsp";
	}
	
	@RequestMapping("")
	public String vistedPage(HttpSession session, Model model) {
		Integer currentCount = 0;
		if (session.getAttribute(countSessionVar) == null) {			 
			session.setAttribute(countSessionVar, 0);
			currentCount = 0;
		} else {
			currentCount = (Integer) session.getAttribute(countSessionVar);			 
			session.setAttribute(countSessionVar, ++currentCount);
			
		}
				
		model.addAttribute(countSessionVar, currentCount);		
		
		return "counterMsg.jsp";
	}

	@RequestMapping("/counter_two")
	public String vistedPageTwo(HttpSession session, Model model) {
		Integer currentCount = 0;
		if (session.getAttribute(countSessionVar) == null) {			 
			session.setAttribute(countSessionVar, 0);
			currentCount = 0;
		} else {
			currentCount = (Integer) session.getAttribute(countSessionVar);	
			currentCount += 2;
			session.setAttribute(countSessionVar, currentCount);
			
		}
				
		model.addAttribute(countSessionVar, currentCount);		
		
		return "counterMsg.jsp";
	}
	
	@RequestMapping("/reset")
	public String restetToZero(HttpSession session, Model model) {
		if (session.getAttribute(countSessionVar) == null) {			 
			session.setAttribute(countSessionVar, 0);
		} else {
			session.setAttribute(countSessionVar, 0);
		}
				
		model.addAttribute(countSessionVar, 0);		
		
		return "counter.jsp";
	}


}
