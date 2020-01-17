package com.app.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.app.model.Employee;
import com.app.service.EmpService;



@Controller
@RequestMapping("/")

public class EmployeeController {
	@Autowired
	EmpService serv;

	@RequestMapping(value = { "/home" }, method = RequestMethod.GET)
	public String listEmployees(ModelMap model, HttpServletResponse response) throws IOException {

		//response.setContentType("image/jpeg, image/jpg, image/png, image/gif");
		
		List<Employee> emp = serv.findAllEmp();
	
		System.out.println(emp.get(0).getCourse());
		model.addAttribute("employees", emp);
		ArrayList<String> images=new ArrayList<>();
		/*for(Employee e:emp)
		{
			byte[] image=Base64.encodeBase64(e.getImage());
			images.add(new String(image, "UTF-8"));
		}
		*/
		
		
		model.addAttribute("images",images);
		System.out.println(emp.get(0).getContactList());
		System.out.println(emp);
		return "emplist";
	}

	@RequestMapping(value = { "/delete{id}" }, method = RequestMethod.GET)
	public String deleteEmployee(@PathVariable int id) {
		serv.deleteEmployeeById(id);
		return "redirect:/new";
	}

	@RequestMapping(value = { "/new" }, method = RequestMethod.GET)
	public String newEmp(ModelMap model) {
		Employee e = new Employee();
		model.addAttribute("employee", e);
		model.addAttribute("edit", false);
		return "registration";

	}

	@RequestMapping(value = { "/new" }, method = RequestMethod.POST)
	public String saveEmployee(@Valid Employee employee, BindingResult result, ModelMap model, HttpServletRequest req,
			@RequestParam("image") CommonsMultipartFile file) {

		if (file != null) {
			System.out.println("Saving file: " + file.getOriginalFilename());
          
			employee.setImage(file.getBytes());
			serv.saveEmployee(employee);

			model.addAttribute("success", "Employee " + employee.getName() + " registered successfully");
		}

		return "success";
	}

	@RequestMapping(value = { "/edit{id}" }, method = RequestMethod.GET)
	public String editEmp(@PathVariable int id, ModelMap model) {
		System.out.println("id is " + id);
		Employee employee = serv.findEmployeeById(id);
		System.out.println(employee.getCourse());
		// System.out.println("course.........."+employee.getCourse().get(0));
		model.addAttribute("employee", employee);

		return "edit";

	}

	@RequestMapping(value = { "/edit{id}" }, method = RequestMethod.POST)
	public String updateEmployee(@Valid Employee employee, BindingResult result, ModelMap model, @PathVariable int id) {

		/*
		 * if (result.hasErrors()) { return "registration"; }
		 */

		serv.updateEmployee(employee);

		model.addAttribute("success", "Employee " + employee.getName() + " updated successfully");
		return "success";
	}

}
