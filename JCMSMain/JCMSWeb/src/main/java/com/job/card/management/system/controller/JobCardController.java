package com.job.card.management.system.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.job.card.management.system.dto.ClientJobDto;

@Controller
public class JobCardController {

	@InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }
	
	@RequestMapping(value = "job-card-register")
	public String jobCardRegister(ModelMap modelMap, ClientJobDto clientJobDto) {
		modelMap.addAttribute("clientJobDto", clientJobDto);
		return "job-card-form";
	}

	@RequestMapping(value = "job-card-registered")
	public String jobCardRegistration(ModelMap modelMap, @ModelAttribute("clientJobDto") ClientJobDto clientJobDto,
			BindingResult result) {
		System.out.println("This is Job Card Model : " + clientJobDto);
		return "show-operator-info";
	}

}
