package org.tnsif.placementmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.tnsif.placementmanagement.entities.Admin;


public interface AdminRespository extends JpaRepository<Admin,Integer> {

}