package com.cts.project.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.PutMapping;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.cts.project.dao.CompanyRepository;
import com.cts.project.dao.IpoDetailsRepository;
import com.cts.project.dao.SectorsRepository;
import com.cts.project.dao.StockExchangeRepository;
import com.cts.project.pojos.Company;
import com.cts.project.pojos.IpoDetails;
import com.cts.project.pojos.User;
import com.cts.project.pojos.Sectors;
import com.cts.project.pojos.StockExchange;
@CrossOrigin(origins="http://localhost:4200")
@RestController

@RequestMapping("/StockExchange")
public class StockExchangeController {

	@Autowired

	private StockExchangeRepository stockexchangeRepository;

	@RequestMapping("/getAllStockExchange")

	public Iterable<StockExchange> getAllStockExchange() {

		return stockexchangeRepository.findAll();

	}

	@PostMapping("/saveStockExchange")

	public StockExchange saveStockExchange(@RequestBody StockExchange stockexchange) {

		System.out.println(stockexchange);

		stockexchangeRepository.save(stockexchange);

		return stockexchange;

	}

	@PutMapping("/updateStockExchange/{stockexid}")

	public StockExchange updateStockExchange(@RequestBody StockExchange stockexchange,
			@PathVariable("stockexid") Integer stockexid) {

		stockexchange.setStockexid(stockexid);

		System.out.println(stockexchange);

		stockexchangeRepository.save(stockexchange);

		return stockexchange;

	}

	@DeleteMapping("/deleteStockExchange/{stockexid}")

	public Boolean deleteStockExchange(@PathVariable("stockexid") Integer stockexid) {

		System.out.println(stockexid);

		Optional<StockExchange> stockexchange = stockexchangeRepository.findById(stockexid);
		stockexchangeRepository.delete(stockexchange.get());

		return true;

	}

	@GetMapping("/findOneInAll4/{stockexid}")

	public StockExchange findOneInAll4(@PathVariable("stockexid") Integer stockexid) {

		Optional<StockExchange> stockexchange = stockexchangeRepository.findById(stockexid);

		return stockexchange.get();

	}

}
