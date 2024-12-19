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

import com.beautysalon.salon.model.BuyNow;
import com.beautysalon.salon.service.BuyNowService;
@RestController
public class BuyNowController {
@Autowired
	
	private BuyNowService by;
	
	@GetMapping("/buynows")
	public List<BuyNow>handleget()
	{
		return by.getAll();
	}
	@PostMapping("/addbuy")
	public BuyNow add(@RequestBody BuyNow r)
	{
		return by.insertrecord(r);
	}
	@DeleteMapping("/delbuy/{bid}")
	public void delr(@PathVariable("bid")int r)
	{
		by.del(r);
	}
	@PutMapping("/upbuy/{bid}")
	public BuyNow update(@PathVariable("bid")int i,@RequestBody BuyNow r)
	{
		return by.updaterecord(i, r);
	}
	
}
