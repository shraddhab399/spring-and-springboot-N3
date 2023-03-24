package org.tnsif.placementmanagement.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tnsif.placementmanagement.entities.Certificate;
import org.tnsif.placementmanagement.repository.CertificateRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class CertificateService {
	@Autowired
	private CertificateRepository repo;
	
	//addition/creation/insertion
	public void add(Certificate certificate)
	{
		repo.save(certificate);
	}
	//Retrieve with specific id
	public Certificate retrieve(Integer id)
	{
		return repo.findById(id).get();
	}
	//delete
	public void delete(Integer id)
	{
		repo.deleteById(id);
	}
	//to retrieve all the records
	public List<Certificate>retreiveAll()
	{
		return repo.findAll();
	}
}
