package com.beautysalon.salon.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RestController;

import com.beautysalon.salon.model.BuyNow;
import com.beautysalon.salon.repository.BuyNowRepository;

@RestController
public class BuyNowSeviceImpl implements BuyNowService {
	@Autowired
	@Qualifier("buyRepo")
	private BuyNowRepository buyRepo;
	@Override
	public BuyNow insertrecord(BuyNow r) {
		// TODO Auto-generated method stub
		return buyRepo.save(r);
	}

	@Override
	public List<BuyNow> getAll() {
		// TODO Auto-generated method stub
		return buyRepo.findAll();
	}

	@Override
	public void del(int ri) {
		buyRepo.deleteById(ri);
		
	}

	@Override
	public BuyNow updaterecord(int i, BuyNow r) {
		Optional<BuyNow> opt=buyRepo.findById(i);
		if(opt.isPresent())
		{
			BuyNow rold=opt.get();
			rold.setId(r.getId());
			rold.setName(r.getName());
			rold.setPrice(r.getPrice());
			return buyRepo.save(rold);
		}
		return null;

	}

}
