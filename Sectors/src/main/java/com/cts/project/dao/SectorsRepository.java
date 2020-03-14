package com.cts.project.dao;
import org.springframework.data.repository.CrudRepository;
import com.cts.project.pojos.Sectors;


public interface SectorsRepository extends CrudRepository<Sectors,Integer>{

	Iterable<Sectors> findAll();

}
