package com.beautysalon.salon.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.beautysalon.salon.model.AdminLogin;
import com.beautysalon.salon.model.Registration;

@Repository
@Qualifier("adminRepo")
public interface AdminLoginRepository extends JpaRepository<AdminLogin,Integer> {
	
	

}
