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

import com.beautysalon.salon.model.Booking;
import com.beautysalon.salon.service.BookingService;

@RestController
public class BookingController {
	@Autowired
	private BookingService bo;

	@GetMapping("/books")
	public List<Booking> handleget()
	{
		return bo.getAll();
	}
	@PostMapping("/addbook")
	public Booking add(@RequestBody Booking r)
	{
		return bo.insertrecord(r);
		
	}
	
	@DeleteMapping("/delbook/{bid}")
	public void delr(@PathVariable("bid")int r)
	{
		bo.del(r);
	}
	@PutMapping("/upbook/{bid}")
	public Booking update(@PathVariable("bid")int i,@RequestBody Booking r)
	{
		return bo.updaterecord(i, r);
	}
}
