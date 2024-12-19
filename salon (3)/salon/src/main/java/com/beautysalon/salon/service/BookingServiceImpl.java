package com.beautysalon.salon.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RestController;

import com.beautysalon.salon.model.Booking;
import com.beautysalon.salon.repository.BookingRepository;

@RestController
public class BookingServiceImpl implements BookingService {
	@Autowired
	@Qualifier("bookRepo")
	private BookingRepository bookRepo;
	@Override
	public Booking insertrecord(Booking r) {
		// TODO Auto-generated method stub
		return bookRepo.save(r);
	}

	@Override
	public List<Booking> getAll() {
		// TODO Auto-generated method stub
		return bookRepo.findAll();
	}

	@Override
	public void del(int ri) {
		// TODO Auto-generated method stub
		bookRepo.deleteById(ri);
	}

	@Override
	public Booking updaterecord(int i, Booking r) {
		Optional<Booking> opt=bookRepo.findById(i);
		if(opt.isPresent())
		{
			Booking rold=opt.get();
			rold.setSrid(r.getSrid());
			rold.setName(r.getName());
			rold.setAddress(r.getAddress());
			rold.setEmail(r.getEmail());
			rold.setDate(r.getDate());
			rold.setTime(r.getTime());
			rold.setPhoneno(r.getPhoneno());
			return bookRepo.save(rold);
		}
		return null;
	}

}
