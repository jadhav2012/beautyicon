package com.beautysalon.salon.service;

import java.util.List;

import com.beautysalon.salon.model.Booking;

public interface BookingService {
	Booking insertrecord(Booking r);
	List<Booking>getAll();
	void del(int ri);
	Booking updaterecord(int i,Booking r);
}
