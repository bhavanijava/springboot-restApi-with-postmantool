package com.mobile.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobile.model.Mobile;
import com.mobile.repo.MobileRepo;

@Service
public class MobileServiceImp implements MobileService {

	@Autowired
	private MobileRepo repo;
	
	// inserting record
	@Override
	public Mobile saveProduct(Mobile p) {
		return repo.save(p);
	}

	// update record
	@Override
	public Mobile updateProduct(Mobile m, Integer pid) {
		Optional<Mobile> optional=repo.findById(pid);
		Mobile p1=optional.get();
		p1.setMobilename(m.getMobilename());
		p1.setPrice(m.getPrice());
		p1.setQuantity(m.getQuantity());
		return repo.save(p1);
	}

	// delete record
	@Override
	public void deleteProduct(Integer pid) {
		repo.deleteById(pid);
	}

	// getOne Record
	@Override
	public Mobile getProduct(Integer pid) {
		return repo.findById(pid).get();
	}

	@Override
	public List<Mobile> getAll() {
		return repo.findAll();
	}

}
