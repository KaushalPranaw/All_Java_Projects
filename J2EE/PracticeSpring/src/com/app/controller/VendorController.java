package com.app.controller;

import java.util.List;

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

import com.app.pojos.Vendor;
import com.app.service.VendorService;

@Controller
@RequestMapping("/vendor")
public class VendorController {

	@Autowired
	private VendorService service;
	
	@GetMapping("/login")
	public String showLoginform()
	{
		System.out.println("in show login form");
		return "/vendor/login";
	}
	
	@PostMapping("/login")
	public String postlogin(@RequestParam String email,@RequestParam String  password,Model map, HttpSession hs)
	{
		System.out.println("In process login form");
		
		Vendor v;
		try
		{
			v=service.validateUser(email, password);
		}
		catch(NoResultException e)
		{
			System.out.println("err in vendor controller "+e);
			map.addAttribute("status","invalid login please try again");
			return "/vendor/login";
		}
		hs.setAttribute("user_dtls", v);
		hs.setAttribute("status", "Successful login for "+v.getRole());
		
		if(v.getRole().equals("admin"))
			return "redirect:/vendor/list";
		return "redirect:/vendor/details";
		 
	}
	
	@GetMapping("/list")
	public String showListform(Model map)
	{
		System.out.println("in show list form");
		List<Vendor> l=service.getAllVendors();
		map.addAttribute("vendor_list", l);
		
		return "/vendor/list";
	}
	
	@GetMapping("/details")
	public String showDetailsform()
	{
		System.out.println("in show details form");
		return "/vendor/details";
	}
	
	@GetMapping("/add")
	public String showRegistePage(Vendor v)
	{
		
		System.out.println("In register page"+v);
		return "/vendor/add";
	}
	
	@PostMapping("/add")
	public String processRegisterForm(Vendor v,RedirectAttributes flashMap)
	{
		System.out.println("in process"+ v);
		flashMap.addFlashAttribute("status",service.registerVendor(v));
		return "redirect:/vendor/list";
	}
	
	@GetMapping("/update")
	public String showUpdateForm(@RequestParam int vid,Model map)
	{
		Vendor v=service.getVendorDetails(vid);
		map.addAttribute("vendor", v);
		System.out.println("in show update"+v);
		return "/vendor/update";
	}

	@PostMapping("/update")
	public String processUpdateForm(Vendor v,RedirectAttributes flashMap)
	{
		System.out.println("in process update"+v);
		flashMap.addFlashAttribute("status",service.updateVendor(v));
		return "redirect:/vendor/list";
	}
	
	@GetMapping("/delete")
	public String processDelete(@RequestParam int vid,RedirectAttributes flashMap)
	{
		System.out.println("in process delete");
		service.deleteVendor(service.getVendorDetails(vid));
		return "redirect:/vendor/list";
	}
	
	@GetMapping("/logout")
	public String showLogoutPage(HttpSession hs, Model map, HttpServletRequest req,HttpServletResponse res)
	{
		System.out.println("in logout page");
		map.addAttribute("user_dtls",hs.getAttribute("user_dtls"));
		hs.invalidate();
		res.setHeader("refresh", "3;url="+req.getContextPath());
		return "/vendor/logout";
	}
}
