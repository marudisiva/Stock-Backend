package com.cts.project.dao;
import org.springframework.data.repository.CrudRepository;
import com.cts.project.pojos.StockExchange;
public interface StockExchangeRepository extends CrudRepository<StockExchange,Integer> {
	
		Iterable<StockExchange> findAll();
}
