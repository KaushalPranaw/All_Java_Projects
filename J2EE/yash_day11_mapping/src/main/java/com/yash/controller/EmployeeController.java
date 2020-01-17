package com.yash.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.yash.pojos.Course;
import com.yash.pojos.Employee;
import com.yash.service.EmployeeService;

@Controller
@RequestMapping("/emp")
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	private List<Course> allCourses;

	@GetMapping("/save")
	public String save(Employee e) {
		//System.out.println(e);
		System.out.println("save(Employee e) called");
		return "/employee/create";
	}

	@RequestMapping(value="/save", method=RequestMethod.POST)
	public String processRegister(Employee e, Model model,
			@RequestParam("photo") MultipartFile file) throws IOException {
		System.out.println("processRegister() called");
		System.out.println(e);
		if(file!=null)
		{
			System.out.println("Saving file: " + file.getOriginalFilename());
			e.setPhoto(file.getBytes());
			model.addAttribute("emp", service.register(e));
		}
		
		return "redirect:/emp/list";
	}

	@GetMapping("/list")
	public String getList(RedirectAttributes flashMap, Model model, HttpSession hs) {
		System.out.println("list()");
		hs.setAttribute("course_list", service.viewAllCourse());
		// flashMap.addFlashAttribute("emp_list", service.getAll());
		model.addAttribute("emp_list", service.getAll());
		return "/employee/list";
	}

	@GetMapping("/delete")
	public String deleteEmployee(@RequestParam("id") int id, RedirectAttributes flashMap) {
		System.out.println(" in delete");
		flashMap.addFlashAttribute("status", service.deleteEmployee(id));
		return "redirect:/emp/list";
	}

	@GetMapping("/update")
	public String updateEmployee(@RequestParam("id") int id, Model map, Employee e) {
		System.out.println(" in update");
		e = service.getEmpById(id);
		map.addAttribute("employee", e);
		return "/employee/update";
	}

	@PostMapping("/update")
	public String processUpdate(Employee e, RedirectAttributes flashMap) {

		flashMap.addFlashAttribute("status", service.updateEmployee(e));
		return "redirect:/emp/list";
	}

	@GetMapping("/addCourse")
	public String addCourse(@RequestParam("id") int id, Model map, Course course) {
		
		map.addAttribute("id", id);

		return "/employee/add_course";
	}

	@SuppressWarnings("unchecked")
	@PostMapping("/updateCourse")
	public String updateCourseByEmp(Model map, @ModelAttribute ArrayList<Course> course_list,
			HttpServletRequest request, HttpSession hs) {
		int id = Integer.parseInt(request.getParameter("id"));
		String[] s = request.getParameterValues("selected");
		List<Course> courseList = (List<Course>) hs.getAttribute("course_list");
		List<Course> sortedCourseList = new ArrayList<>();
		int i = 0;
		while (i < s.length) {
			for (Course course : courseList) {
				if (course.getCourseName().equals(s[i])) {
					sortedCourseList.add(course);
				}
			}
			i++;
		}
		service.updateCourseByEmp(sortedCourseList, id);
		return "redirect:/emp/list";
	}
	
	@SuppressWarnings({ "unchecked" })
	@GetMapping("/viewCourse")
	public String viewCourseByEmp(@RequestParam("id") int id,HttpSession hs,Model map)
	{
		System.out.println("viewCourseByEmp()");
		List<Course> courseList=(List<Course>) hs.getAttribute("course_list");
		Employee e=service.getEmpById(id);
		System.out.println(courseList);
		ArrayList<Course> sortedCourse=new ArrayList<>();
		for(Course course:e.getCourseList())
		{
			if(courseList.contains(course))
				sortedCourse.add(course);
		}
		System.out.println(sortedCourse);
		map.addAttribute("emp_course_list", sortedCourse);
			return "/employee/view_course";
	}

	
}
