package com.yash.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.yash.pojos.Student;
import com.yash.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService service;
	
	
	@GetMapping("/list")
	public String getList(Model map)
	{
		System.out.println("in list");
		System.out.println(service.getAllStudent());
		map.addAttribute("stud_list", service.getAllStudent());
		return "/stud/list";
	}
	
	@GetMapping("/create")
	public String getRegisterPage(Student s,Model map)
	{
		map.addAttribute("student", s);
		return "/stud/create";
	}
	
	
	@PostMapping("/create")
	public String processRegisterPage(Student s,RedirectAttributes flashMap)
	{
		service.createStudent(s);
		flashMap.addFlashAttribute("status", "created with id "+s.getId());
		return "redirect:/student/list";
	}
	
	@GetMapping("/update")
	public String getupdatePage(@RequestParam("id") int id,Model map)
	{
		Student s=service.getById(id);
		map.addAttribute("student", s);
		return "/stud/update";
	}
	
	
	@PostMapping("/update")
	public String processUpdatePage(Student s,RedirectAttributes flashMap)
	{
		service.updateStudent(s);
		flashMap.addFlashAttribute("status", "updated id "+s.getId());
		return "redirect:/student/list";
	}
	
	@GetMapping("/delete")
	public String getdeletePage(@RequestParam("id") int id,Model map)
	{
		Student s=service.getById(id);
		service.deleteStudent(s);
		map.addAttribute("status","deleted id "+s.getId());
		return "redirect:/student/list";
	}
}
