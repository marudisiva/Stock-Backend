package com.cts.project.dao;
import java.util.List;


import org.springframework.data.repository.CrudRepository;

import com.cts.project.pojos.StockPrice;


public interface StockPriceRepository extends CrudRepository<StockPrice,String> {
	Iterable<StockPrice> findAll();

	List<StockPrice> findByCompanyname(String companyname);
}
