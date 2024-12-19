package com.beautysalon.salon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.beautysalon.salon.model.Feedback;
import com.beautysalon.salon.model.Registration;
import com.beautysalon.salon.service.FeedbackService;
import com.beautysalon.salon.service.RegistrationService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/feedback/")
public class FeedbackController {

	@Autowired
	private FeedbackService fs;

	@GetMapping("/feedbacks")
	public List<Feedback> handleget()
	{
		return fs.getAll();
	}
	@PostMapping("/addfeed")
	public Feedback add(@RequestBody Feedback r)
	{
		return fs.insertrecord(r);
		
	}
	
	@DeleteMapping("/delfeed/{rid}")
	public void delr(@PathVariable("rid")int r)
	{
		fs.del(r);
	}
	@PutMapping("/upfeed/{rid}")
	public Feedback update(@PathVariable("rid")int i,@RequestBody Feedback r)
	{
		return fs.updaterecord(i, r);
	}
}
