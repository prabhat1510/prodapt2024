package com.prodapt.helloworlddemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.prodapt.helloworlddemo.entities.CompanyDTO;
import com.prodapt.helloworlddemo.model.Company;
import com.prodapt.helloworlddemo.service.CompanyService;
import com.prodapt.helloworlddemo.utility.CompanyUtility;

@Controller
@RequestMapping("/company")
public class CompanyController {

	@Autowired
	private CompanyService service;
	
	//URL: http://localhost:8080/company/companyform
	// Load Book Details form
	@RequestMapping(value = "/companyform", method = RequestMethod.GET)
	public ModelAndView loadBookDetailsForm() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("companyform"); // setting view name or jsp name
		return mv;
	}
	
	//URL: http://localhost:8080/company/createcompany
	// Create
	@RequestMapping(value = "/createcompany", method = RequestMethod.POST)
	public ModelAndView addCompany(@ModelAttribute Company company) {
		// converting company model to dto
		CompanyDTO companyDTO = CompanyUtility.convertCompanyToCompanyDTO(company);
		// Sending data to DB
		String companyMessage = service.createCompany(companyDTO);

		ModelAndView mv = new ModelAndView();
		//// converting company dto to model and setting model in ModelAndView
		mv.addObject("companyMessage",companyMessage);
		mv.setViewName("companydetails"); // setting view name or jsp name
		return mv;
	}
}
