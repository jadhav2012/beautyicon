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

import com.beautysalon.salon.model.Cosmetics;
import com.beautysalon.salon.service.CosmeticsService;
@RestController
public class CosmeticsController {
@Autowired
	
	private CosmeticsService cs;
	
	@GetMapping("/cosmetics")
	public List<Cosmetics>handleget()
	{
		return cs.getAll();
	}
	@PostMapping("/addcos")
	public Cosmetics add(@RequestBody Cosmetics r)
	{
		return cs.insertrecord(r);
	}
	@DeleteMapping("/delcos/{cid}")
	public void delr(@PathVariable("cid")int r)
	{
		cs.del(r);
	}
	@PutMapping("/upcos/{cid}")
	public Cosmetics update(@PathVariable("cid")int i,@RequestBody Cosmetics r)
	{
		return cs.updaterecord(i, r);
	}
	
}
