package com.beautysalon.salon.service;

import java.util.List;

import com.beautysalon.salon.model.BuyNow;


public interface BuyNowService {
	BuyNow insertrecord(BuyNow r);
	List<BuyNow>getAll();
	void del(int ri);
	BuyNow updaterecord(int i,BuyNow r);
}
