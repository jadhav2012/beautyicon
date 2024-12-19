package com.beautysalon.salon.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.beautysalon.salon.model.AdminLogin;
import com.beautysalon.salon.service.AdminLoginService;

@RestController
public class AdminLoginController {
@Autowired
	
	private AdminLoginService ad;
	
	@GetMapping("/adminlogins")
	public List<AdminLogin>handleget()
	{
		return ad.getAll();
	}
	@PostMapping("/addadmin")
	public AdminLogin add(@RequestBody AdminLogin r)
	{
		return ad.insertrecord(r);
	}
	@DeleteMapping("/deladmin/{aid}")
	public void delr(@PathVariable("aid")int r)
	{
		ad.del(r);
	}
	@PutMapping("/upadmin/{aid}")
	public AdminLogin update(@PathVariable("aid")int i,@RequestBody AdminLogin r)
	{
		return ad.updaterecord(i, r);
	}
	
}
