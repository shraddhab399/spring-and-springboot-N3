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
import org.tnsif.placementmanagement.entities.Placement;
import org.tnsif.placementmanagement.services.PlacementService;

@RestController

public class PlacementController {
	@Autowired
	private PlacementService service1;
	
	//RESTful API for crud Operation
	//to retrieve all the records
	@GetMapping("/placement")
	
	public List<Placement> ListAll()
	{
		return service1.retrieveAll();
	}
	@GetMapping("/placement/(id)")
	public ResponseEntity<Placement>get(@PathVariable Integer id)
	{
	try
	{
		Placement placement =service1.retrieve(id);
		return new ResponseEntity<Placement>(placement,HttpStatus.OK);
	}
	catch(NoSuchElementException e)
	{
		return new ResponseEntity<Placement>(HttpStatus.NOT_FOUND);
	}
	}
//	public void get()
//	{
//		service.retrieve(null);
//	}
	@DeleteMapping("/placement/(id)")
	public void remove(@PathVariable Integer id)
	{
		service1.delete(id);
	}
	
	//to insert a data 
	@PostMapping("/placement")
	public void insert(@RequestBody Placement placement)
	{
		service1.add(placement);
	}
	
	//update a data 
	@PutMapping("/placement/{id}")
	public ResponseEntity<?>update(@RequestBody Placement placement, @PathVariable Integer id)
	{
		try
		{
			Placement s1=service1.retrieve(id);
			service1.add(placement);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

	}

}