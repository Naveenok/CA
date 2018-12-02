/**
 * 
 */
package com.ca.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author admin
 *
 */
@Controller
public class CustomerInformation {
	@RequestMapping(value = "/contact", method = RequestMethod.GET)
	public ModelAndView displayContact() {
		ModelAndView m = new ModelAndView("contact");
		return m;
	}

	@RequestMapping(value = "/submitcontactinfo", method = RequestMethod.POST)
	public ModelAndView saveContact() {
		ModelAndView m = new ModelAndView("submitted");
		m.addObject("print", "your application has beed submitted");
		return m;
	}

}
