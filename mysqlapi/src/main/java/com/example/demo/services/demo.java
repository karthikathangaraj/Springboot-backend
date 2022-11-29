package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.prodapt;
import com.example.demo.repo.prod;

@Service
public class demo {
	@Autowired
	private prod p1;
	
	public prodapt saveitem(prodapt p2)
	{
		return p1.save(p2);
		
	}
	public List<prodapt> listitem(List<prodapt> p21)
	{
		return p1.saveAll(p21);
		
	}
	public List<prodapt> getitem()
	{
		return p1.findAll();
		
	}
	public prodapt search(int id)
	{
		return p1.findById(id).orElse(null);
		
	}

}
