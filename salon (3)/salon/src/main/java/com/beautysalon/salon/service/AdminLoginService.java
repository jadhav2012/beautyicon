package com.beautysalon.salon.service;

import java.util.List;

import com.beautysalon.salon.model.AdminLogin;




public interface AdminLoginService {
	AdminLogin insertrecord(AdminLogin r);
	List<AdminLogin>getAll();
	void del(int ri);
	AdminLogin updaterecord(int i,AdminLogin r);
}
