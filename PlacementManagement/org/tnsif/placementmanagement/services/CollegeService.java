package org.tnsif.placementmanagement.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tnsif.placementmanagement.entities.College;
import org.tnsif.placementmanagement.repository.CollegeRepository;

import jakarta.transaction.Transactional;



@Service
@Transactional
public class CollegeService {
	@Autowired
	private CollegeRepository repo;
	//addition/creation/insertion
	public void add(College college)
	{
		repo.save(college);
	}
	//retrieve with specific id
	public College retrieve(Integer id)
	{
		return repo.findById(id).get();
	}
	//delete
	public void delete(Integer id)
	{
		repo.deleteById(id);
	}
	public List<College>retrieveAll()
	{
		return repo.findAll();
	}
	

}

