package com.mobile.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mobile.model.Mobile;
import com.mobile.service.MobileService;
@RestController
public class MobileController {

	@Autowired
	private MobileService service;
	
	@PostMapping("/save")
	public Mobile save(@RequestBody Mobile pd)
	{
		return service.saveProduct(pd);
	}
	
	@DeleteMapping("/delete/{pid}")
	public void delete(@PathVariable Integer pid)
	{
		service.deleteProduct(pid);
	}
	
	@GetMapping("/get/{pid}")
	public Mobile getOne(@PathVariable Integer pid)
	{
		return service.getProduct(pid);
	}
	
	@GetMapping("/getAll")
	public List<Mobile> getAll()
	{
		return service.getAll();
	}
	
	@PutMapping("/update/{pid}")
	public Mobile update(@RequestBody Mobile pd,@PathVariable Integer pid)
	{
		return service.updateProduct(pd, pid);
	}
}
