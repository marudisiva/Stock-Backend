package com.cts.project.dao;
import org.springframework.data.repository.CrudRepository;
import com.cts.project.pojos.Company;
import com.cts.project.pojos.IpoDetails;
public interface IpoDetailsRepository extends CrudRepository<IpoDetails,Integer>{
	
Iterable<IpoDetails> findAll();

	}




