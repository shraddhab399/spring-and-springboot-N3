package org.tnsif.placementmanagement.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tnsif.placementmanagement.entities.Admin;
import org.tnsif.placementmanagement.repository.AdminRespository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class AdminService {
	
	@Autowired
	private AdminRespository repo;
	
	//addition/creation/insertion
	public void add(Admin admin)
	{
		repo.save(admin);
	}
	//Retrieve with specific id
	public Admin retrieve(Integer id)
	{
		return repo.findById(id).get();
	}
	//delete
	public void delete(Integer id)
	{
		repo.deleteById(id);
	}
	//to retrieve all the records
	public List<Admin>retreiveAll()
	{
		return repo.findAll();
	}
}