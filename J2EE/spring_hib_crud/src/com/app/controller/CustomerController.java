package com.app.controller;

import javax.persistence.NoResultException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.app.pojos.Customer;
import com.app.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService service;
	
	public CustomerController() {
		System.out.println("in controller");
		// TODO Auto-generated constructor stub
	}
	

	
	@GetMapping("/register")
	public String getRegisterForm(Customer c)
	{
		System.out.println("in register form"+c);
		return "/customer/register";
	}
	@PostMapping("/register")
	public String postRegisterForm(Customer c,RedirectAttributes flashMap)
	{
		System.out.println("in post register form"+c);
		String status=service.register(c);
		System.out.println(status);
		flashMap.addFlashAttribute("status", status);
		return "redirect:/customer/login";
	}
	
	
	@GetMapping("/login")
	public String getLoginForm()
	{
		System.out.println("in login form");
		return "/customer/login";
	}
	
	@PostMapping("/login")
	public String processLoginForm(@RequestParam String email, @RequestParam String pass,Model map,HttpSession hs)
	{
		 
		
		System.out.println("in post login form");
		Customer c;
		
		try {
			c=service.login(email, pass);
			
		} catch (NoResultException e) {
			System.out.println("err in customer controller " + e);
			map.addAttribute("status", "Invalid Login , pls retry");
			return "/customer/login";
		}
		
		System.out.println(c);
		hs.setAttribute("user_dtls", c);
		hs.setAttribute("status", "login successfully with id "+c.getId());
		if(c.getRole().equals("admin"))
			return "redirect:/customer/list";
		return "redirect:/customer/details";
	}
	
	@GetMapping("/list")
	public String getListForm(Model map)
	{
		System.out.println("in list form");
		map.addAttribute("customer_dtls", service.getAllCustomer());
		return "/customer/list";
	}
	
	@GetMapping("/details")
	public String getDetailsForm()
	{
		System.out.println("in details form");
		return "/customer/details";
	}
	
	
	@GetMapping("/delete")
	public String getDelete(@RequestParam int cid,RedirectAttributes flashMap)
	{
		System.out.println("in delete");
		System.out.println(cid);
		flashMap.addFlashAttribute("status", service.deleteCust(cid)+" with id "+cid);
		
		return "redirect:/customer/list";
	}
	
	@GetMapping("/update")
	public String getUpdatForm(@RequestParam int cid,Model map)
	{
		System.out.println("in update form");
		Customer c=service.getById(cid);
		System.out.println(c);
		map.addAttribute("customer", c);
		return "/customer/update";
	}
	
	@PostMapping("/update")
	public String processUpdate(Customer c,RedirectAttributes flashMap)
	{
		flashMap.addFlashAttribute("status", service.updateCust(c));
		return "redirect:/customer/list";
	}
	
	@GetMapping("/logout")
	public String logout(Model map,HttpSession hs,HttpServletRequest req,HttpServletResponse res)
	{
		System.out.println("in logout");
		map.addAttribute("user_dtls", hs.getAttribute("user_dtls"));
		hs.invalidate();
		res.setHeader("refresh", "2;url= "+req.getContextPath());
		return "/customer/logout";
	}
}
