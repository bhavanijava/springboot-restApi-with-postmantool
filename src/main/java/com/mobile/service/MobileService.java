package com.mobile.service;

import java.util.List;

import com.mobile.model.Mobile;

public interface MobileService {

	public Mobile saveProduct(Mobile p);
	public Mobile updateProduct(Mobile p,Integer pid);
	public void deleteProduct(Integer pid);
	public Mobile getProduct(Integer pid);
	public List<Mobile> getAll();
	

}
