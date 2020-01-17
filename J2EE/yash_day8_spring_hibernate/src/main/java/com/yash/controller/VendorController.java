package com.yash.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.yash.pojos.Vendor;
import com.yash.service.VendorService;

@Controller
@RequestMapping("/vendor")
public class VendorController {

	@Autowired
	VendorService service;

	@GetMapping("/all")
	public String getAllVendor(Model map) {
		System.out.println(service.findAll());
		map.addAttribute("list", service.findAll());
		return "/vendor/list";
	}

	@GetMapping("/add")
	public String addVendor(Vendor vendor) {
		// map.addAttribute("vendor", vendor);
		System.out.println("in add.jsp page");
		return "/vendor/add";
	}

	@PostMapping("/add")
	public String saveVendor(Vendor v, RedirectAttributes flashMap) {
		System.out.println(v);
		flashMap.addFlashAttribute("status", service.createVendor(v));
		return "redirect:/vendor/all";
	}

	@GetMapping("/update")
	public String updateVendor(Vendor v,@RequestParam int id,Model map) {
		v=service.findById(id);
		map.addAttribute("vendor", v);
		System.out.println(v);
		System.out.println("in  update page");
		return "/vendor/update";
	}

	@PostMapping("/update")
	public String afterUpdatePage(Vendor v, RedirectAttributes flashMap) {
		System.out.println(v);
		flashMap.addFlashAttribute("status", service.updateVendor(v));
		return "redirect:/vendor/all";
	}
	
	@GetMapping("/delete")
	public String deleteVendor(@RequestParam("id") int id,RedirectAttributes flashMap)
	{
		System.out.println("in delete controller");
		flashMap.addFlashAttribute("status", service.deleteById(id));
		return "redirect:/vendor/all";
	}
	

}
