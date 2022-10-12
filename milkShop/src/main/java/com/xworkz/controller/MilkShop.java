package com.xworkz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.milkShopdto.MilkShopDTO;
import com.xworkz.milkshopService.MilkShopService;

@Controller
@RequestMapping("/")
public class MilkShop
{
	@Autowired
	private MilkShopService milkShopservice;

	public MilkShop() {
		System.out.println("create"+this.getClass().getSimpleName());
	}
	@PostMapping
	public String Onsave(MilkShopDTO dto)
	{
		System.out.println("saved "+dto);
		milkShopservice.validateAndsave(dto);
		
		return "success";
		
		
	}
}