package com.employee.web.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.employee.web.exception.EmployeeException;
import com.employee.web.model.EmployeeModel;
import com.employee.web.service.EmployeeService;
import com.employee.web.util.EmployeeConstant;


@Controller
public class EmployeeController {
	
	@Autowired//(required=false)
	private EmployeeService empService;
	
	@RequestMapping(value={"createEmp","/"}, method=RequestMethod.GET)
	public String createEmployee(ModelMap model){
		String viewName = "createEmployee";
		model.addAttribute("emp", new EmployeeModel());
		
		List<String> cities = new ArrayList<String>();
		cities.add("Indore");
		cities.add("Bhopal");
		cities.add("Gwalior");
		cities.add("Guna");
		cities.add("Pune");
		cities.add("Delhi");
		model.addAttribute("cities", cities);
		return viewName;
	}
	
	@RequestMapping(value={"saveEmployee"}, method=RequestMethod.POST)
	public String saveEmployee(@ModelAttribute("emp") EmployeeModel emp,ModelMap model){
		String viewName = "showEmployee";
		EmployeeModel empModel ;
		try{
			model.addAttribute("emp", emp);
			empModel = empService.saveEmployee(emp);
		}catch(EmployeeException exp){
			model.addAttribute("exp", exp);
			viewName = "createEmployee";
		} catch (SQLException e) {
			List<String> list = new ArrayList<String>();
			list.add(EmployeeConstant.INTER_SERVER_ERROR);
			EmployeeException e1 = new EmployeeException(EmployeeConstant.INTERNAL_SERVER_ERROR, EmployeeConstant.ERROR_MSG,list );
			model.addAttribute("exp", e1);
			viewName = "createEmployee";
		}
		return viewName;
	}
	
	@RequestMapping("/getEmployee")
	public String getEmployee(@RequestParam("id") int id,ModelMap model){
		EmployeeModel emp ;
		String viewName = "showEmployee";
		try{
			emp = empService.getEmployeeById(id);
			model.addAttribute("emp", emp);
		}catch(Exception e){
			List<String> list = new ArrayList<String>();
			list.add(EmployeeConstant.INTER_SERVER_ERROR);
			EmployeeException e1 = new EmployeeException(EmployeeConstant.INTERNAL_SERVER_ERROR, EmployeeConstant.ERROR_MSG,list );
			model.addAttribute("exp", e);
		}
		return viewName;
	}
	
	@RequestMapping("/deleteEmployee")
	public String deleteEmployee(@RequestParam("id") int id, ModelMap model){
		List<EmployeeModel> empList;
		String viewName = "empList";
		try{
			empList = empService.deleteEmployee(id);
			model.addAttribute("empList", empList);
		}catch(EmployeeException ex){
			
		}catch(SQLException se){
			List<String> list = new ArrayList<String>();
			list.add(EmployeeConstant.INTER_SERVER_ERROR);
			EmployeeException e1 = new EmployeeException(EmployeeConstant.INTERNAL_SERVER_ERROR, EmployeeConstant.ERROR_MSG,list );
			model.addAttribute("exp", e1);
		}
		return viewName;
	}
	
	
	@RequestMapping("empList")
	public String  getEmpList(ModelMap model){
		String viewName = "empList";
		List<EmployeeModel> empList = new ArrayList<EmployeeModel>();
		try{
			empList = empService.getEmployeeList();
			model.addAttribute("empList", empList);
		}catch(EmployeeException ex){
			
		} catch (SQLException e) {
			List<String> list = new ArrayList<String>();
			list.add(EmployeeConstant.INTER_SERVER_ERROR);
			EmployeeException e1 = new EmployeeException(EmployeeConstant.INTERNAL_SERVER_ERROR, EmployeeConstant.ERROR_MSG,list );
			model.addAttribute("exp", e1);
		}
		return viewName;
	}
	
	@RequestMapping("/namedQuery")
	public String getNamedQuery(ModelMap model){
		String viewName = "empList";
		List<EmployeeModel> empList = new ArrayList<EmployeeModel>();
		try{
			empList = empService.callNamedQuery();
			model.addAttribute("empList", empList);
		}catch(EmployeeException ex){
			
		} catch (SQLException e) {
			List<String> list = new ArrayList<String>();
			list.add(EmployeeConstant.INTER_SERVER_ERROR);
			EmployeeException e1 = new EmployeeException(EmployeeConstant.INTERNAL_SERVER_ERROR, EmployeeConstant.ERROR_MSG,list );
			model.addAttribute("exp", e1);
		}
		return viewName;
	}
	
	@RequestMapping("/nativeSQL")
	public String getNativeSQL(ModelMap model){
		String viewName = "empList";
		List<EmployeeModel> empList = new ArrayList<EmployeeModel>();
		try{
			empList = empService.callNativeSQL();
			model.addAttribute("empList", empList);
		}catch(EmployeeException ex){
			
		} catch (SQLException e) {
			List<String> list = new ArrayList<String>();
			list.add(EmployeeConstant.INTER_SERVER_ERROR);
			EmployeeException e1 = new EmployeeException(EmployeeConstant.INTERNAL_SERVER_ERROR, EmployeeConstant.ERROR_MSG,list );
			model.addAttribute("exp", e1);
		}
		return viewName;
	}
}
