package com.beautysalon.salon.service;

import java.util.List;

import com.beautysalon.salon.model.Cosmetics;
public interface CosmeticsService {
	Cosmetics insertrecord(Cosmetics r);
	List<Cosmetics>getAll();
	void del(int ri);
	Cosmetics updaterecord(int i,Cosmetics r);
}
