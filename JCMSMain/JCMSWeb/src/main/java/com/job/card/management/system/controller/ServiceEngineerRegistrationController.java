package com.job.card.management.system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.job.card.management.system.dto.ServiceEngineerDto;
import com.job.card.management.system.service.ServiceEngineerRegistrationService;


@Controller
public class ServiceEngineerRegistrationController {

	@Autowired
	private ServiceEngineerRegistrationService serviceEngineerService;
	
	@RequestMapping(value="/service-engineer-register",method=RequestMethod.GET)
 	public String serviceEngineerRegistration(ModelMap modelMap,ServiceEngineerDto engineerDto){
 			modelMap.addAttribute("engineerDto", engineerDto);
 		return "service-engineer-registration-form";
	}

	@RequestMapping(value="/service-engineer-registered",method=RequestMethod.POST)
 	public String serviceEngineerRegistered(ModelMap modelMap,@ModelAttribute("engineerDto") ServiceEngineerDto engineerDto,BindingResult result){
		String viewName="show-operator-info";

		serviceEngineerService.serviceEngineerRegistration(engineerDto);
		
		/*if(result.hasErrors())
		{
			viewName="operator-registration-form";
		}*/
		modelMap.addAttribute("serviceEngineerInfo", engineerDto);
		return viewName;
	}
}
