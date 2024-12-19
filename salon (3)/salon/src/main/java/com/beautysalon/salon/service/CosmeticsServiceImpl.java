package com.beautysalon.salon.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RestController;

import com.beautysalon.salon.model.Cosmetics;
import com.beautysalon.salon.repository.CosmeticsRepository;
@RestController
public class CosmeticsServiceImpl implements CosmeticsService {
	@Autowired
	@Qualifier("cosRepo")
	private CosmeticsRepository cosRepo;
	@Override
	public Cosmetics insertrecord(Cosmetics r) {
		// TODO Auto-generated method stub
		return cosRepo.save(r);
	}

	@Override
	public List<Cosmetics> getAll() {
		// TODO Auto-generated method stub
		return cosRepo.findAll();
	}

	@Override
	public void del(int ri) {
		// TODO Auto-generated method stub
		cosRepo.deleteById(ri);
	}

	@Override
	public Cosmetics updaterecord(int i, Cosmetics r) {
		Optional<Cosmetics> opt=cosRepo.findById(i);
		if(opt.isPresent())
		{
			Cosmetics rold=opt.get();
			rold.setCid(r.getCid());
			rold.setName(r.getName());
			rold.setDescription(r.getDescription());
			rold.setPrice(r.getPrice());
			return cosRepo.save(rold);
		}
		return null;
	}

}
