package com.job.card.management.system.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.job.card.management.system.dto.OperatorDto;
import com.job.card.management.system.service.OperatorRegistrationService;

@Controller
public class OperatorRegistrationController {

	@Autowired
	private OperatorRegistrationService operatorRegistrationService;

	@InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }
	
	@RequestMapping(value="/operator-register",method=RequestMethod.GET)
 	public String operatorRegistration(ModelMap modelMap,OperatorDto dto){
 			modelMap.addAttribute("operatorDto", dto);
 		return "operator-registration-form";
	}
	
	@RequestMapping(value="/operator-registered",method=RequestMethod.POST)
 	public String operatorRegistered(ModelMap modelMap,@ModelAttribute("operatorDto") OperatorDto operatorDto,BindingResult result){
		String viewName="show-operator-info";
		
		operatorRegistrationService.operatorRegistration(operatorDto);
		
		/*if(result.hasErrors())
		{
			viewName="operator-registration-form";
		}*/
//		modelMap.addAttribute("operatorInfo", operatorDto);
		return viewName;
	}

}
