package com.cts.project.dao;
import org.springframework.data.repository.CrudRepository;
import com.cts.project.pojos.Sectors;
import com.cts.project.pojos.User;

public interface SectorsRepository extends CrudRepository<Sectors,Integer>{

	Iterable<Sectors> findAll();

}
