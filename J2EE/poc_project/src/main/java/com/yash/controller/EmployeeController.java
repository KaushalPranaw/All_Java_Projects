package com.yash.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.yash.pojos.Employee;
import com.yash.service.EmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	@Qualifier("employee_service")
	private EmployeeService employeeService;

	@GetMapping({"/home" })
	public String getHomePage(Model map) {
		System.out.println(employeeService.findAllEmployee());
		map.addAttribute("employee_details", employeeService.findAllEmployee());
		System.out.println("getHomePage() called");
		return "/employee/home";
	}

	@GetMapping("/add")
	public String getAddPage(Model map, Employee employee) {
		map.addAttribute("employee", employee);
		return "/employee/add";
	}

	@PostMapping("/add")
	public String postAddPage(RedirectAttributes flashMap, @Valid Employee employee, BindingResult result) {
		System.out.println("postAddPage() called");
		if (result.hasErrors())
		{
			
			return "/employee/add";
		}
		flashMap.addFlashAttribute("status", employeeService.saveEmployee(employee));

		return "redirect:/employee/home";
	}

	@GetMapping("/edit")
	public String getEditPage(Model map, @RequestParam("id") int id) {
		System.out.println("getEditPage() called");
		map.addAttribute("employee", employeeService.findByEmployeeId(id));
		return "/employee/edit";
	}

	@PostMapping("/edit")
	public String postEditPage(RedirectAttributes flashMap, @Valid Employee employee, BindingResult result) {

		if (result.hasErrors())
			return "/employee/edit";
		flashMap.addFlashAttribute("status", employeeService.editEmployee(employee));
		return "redirect:/employee/home";
	}

	@GetMapping("/delete")
	public String deleteEmployee(RedirectAttributes flashMap, @RequestParam("id") int id) {
		System.out.println("deleteEmployee() called");
		flashMap.addFlashAttribute("employee", employeeService.deleteEmployee(id));
		return "redirect:/employee/home";
	}

	@GetMapping("/aboutus")
	public String getAboutUsPage(Model map) {

		return "/employee/aboutus";
	}

	@GetMapping("/contact")
	public String getContactPage(Model map) {

		return "/employee/contact";
	}

	@GetMapping("/search")
	public String searchById(@RequestParam("id") Integer id, Model map,RedirectAttributes flashMap) {
		if(id==null)
		{
			flashMap.addFlashAttribute("status", "Please Insert Id");
			return "redirect:/employee/home";
		}
		System.out.println(id);
		System.out.println("searchById() called");
		int id1=id;
		System.out.println(employeeService.findByEmployeeId(id1));
		map.addAttribute("emp_list", employeeService.findByEmployeeId(id1));
		boolean check = false;
		if (employeeService.findByEmployeeId(id1) != null)
			check = true;
		System.out.println(check);
		map.addAttribute("check", check);
		return "/employee/search_list";
	}

}
