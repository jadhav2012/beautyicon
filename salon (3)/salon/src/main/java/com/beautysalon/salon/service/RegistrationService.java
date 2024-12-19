package com.beautysalon.salon.service;

import java.util.List;

import com.beautysalon.salon.model.Registration;

public interface RegistrationService {
	Registration insertrecord(Registration r);
	List<Registration>getAll();
	void del(int ri);
	Registration updaterecord(int i,Registration r);
	List<Registration> login(String emailid, String password);
}
