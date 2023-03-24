package org.tnsif.placementmanagement.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.tnsif.placementmanagement.entities.Admin;
import org.tnsif.placementmanagement.services.AdminService;
@RestController
public class AdminController {
	
	@Autowired
	private AdminService service;
	
	//RESTful API For CRUD Operation
	//to retrieve all the records
	@GetMapping("/admin")
	public List<Admin>listAll()
	{
		return service.retreiveAll();
	}
	//retrieve with specific id
	@GetMapping("/admin/{id}")
	public ResponseEntity<Admin>get(@PathVariable Integer id)
	{
		try
		{
			Admin Admin=service.retrieve(id);
			 return new ResponseEntity<Admin>(Admin, HttpStatus.OK);

			
		}
		catch(NoSuchElementException e)
		{
			 return new ResponseEntity<Admin>(HttpStatus.NOT_FOUND);

		}
	}
	@DeleteMapping("/admin/{id}")
	public void remove(@PathVariable Integer id)
	{
		service.delete(id);
	}
	//to insert a data
	@PostMapping("/admin")
	public void insert(@RequestBody Admin admin)
	{
		service.add(admin);
	}
	//update a data
	@PutMapping("/admin/{id}")
	public ResponseEntity<?>update(@RequestBody Admin admin, @PathVariable Integer id)
	{
		try {
			Admin s1=service.retrieve(id);
			service.add(admin);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);

		}
		
	}
}
