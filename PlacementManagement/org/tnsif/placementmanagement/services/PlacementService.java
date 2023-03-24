package org.tnsif.placementmanagement.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tnsif.placementmanagement.entities.Placement;
import org.tnsif.placementmanagement.repository.PlacementRepository;
import jakarta.transaction.Transactional;

@Service
@Transactional 
public class PlacementService {
	
	@Autowired
	private PlacementRepository repo1;
	public void add(Placement placement)
	{
		repo1.save(placement);
	}
	
	//retrieve with specific id
	public Placement retrieve(Integer id)
	{
		return repo1.findById(id).get();
	}
	//delete
	public void delete(Integer id)
	{
		repo1.deleteById(id);
	}
	public List<Placement>retrieveAll()
	{
		return repo1.findAll();
	}


}