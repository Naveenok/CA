/**
 * 
 */
package com.ca.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ca.model.Customer;

/**
 * @author Naveen
 *
 */
@Controller
public class CustomerInformation {
	@RequestMapping(value = "/contact", method = RequestMethod.GET)
	public ModelAndView displayContact() {
		ModelAndView m = new ModelAndView("contact");
		return m;
	}

	@RequestMapping(value = "/submitted", method = RequestMethod.POST)
	public ModelAndView saveContact(@ModelAttribute("cust") Customer customer) {
		ModelAndView m = new ModelAndView("submitted");
		return m;
	}

}
