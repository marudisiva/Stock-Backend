package com.cts.project.dao;
import org.springframework.data.repository.CrudRepository;
import com.cts.project.pojos.StockExchange;
import com.cts.project.pojos.User;
public interface StockExchangeRepository extends CrudRepository<StockExchange,Integer> {
	
		Iterable<StockExchange> findAll();
}
