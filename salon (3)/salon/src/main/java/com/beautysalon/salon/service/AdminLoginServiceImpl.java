package com.beautysalon.salon.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RestController;

import com.beautysalon.salon.model.AdminLogin;
import com.beautysalon.salon.repository.AdminLoginRepository;


@RestController
public class AdminLoginServiceImpl implements AdminLoginService {
	@Autowired
	@Qualifier("adminRepo")
	private AdminLoginRepository adminRepo;

	@Override
	public AdminLogin insertrecord(AdminLogin r) {
		// TODO Auto-generated method stub
		return adminRepo.save(r);
	}

	@Override
	public List<AdminLogin> getAll() {
		// TODO Auto-generated method stub
		return adminRepo.findAll();
	}

	@Override
	public void del(int ri) {
		adminRepo.deleteById(ri);
	}

	@Override
	public AdminLogin updaterecord(int i, AdminLogin r) {
		Optional<AdminLogin> opt=adminRepo.findById(i);
		if(opt.isPresent())
		{
			AdminLogin rold=opt.get();
			rold.setAdminid(r.getAdminid());
			rold.setUsername(r.getUsername());
			return adminRepo.save(rold);
		}
		return null;
	}

}
