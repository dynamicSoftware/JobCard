package com.job.card.management.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.job.card.management.system.dto.OperatorDto;

@Controller
public class UserRegistrationController {

	@RequestMapping("/")
	public String indexPage(){
		return "index";
	}
	
	@RequestMapping(value="/operator-register",method=RequestMethod.GET)
 	public String operatorRegistration(ModelMap modelMap,OperatorDto dto){
 			modelMap.addAttribute("operatorDto", dto);
 		return "operator-registration-form";
	}
	
	@RequestMapping(value="/operator-registered",method=RequestMethod.POST)
 	public String operatorRegistered(ModelMap modelMap,@ModelAttribute("operatorDto") OperatorDto dto,BindingResult result){
		String viewName="show-operator-info";
		System.out.println("\n\n\n This is .............");
		if(result.hasErrors())
		{
			viewName="operator-registration-form";
		}
		modelMap.addAttribute("operatorInfo", dto);
		return viewName;
	}
}
