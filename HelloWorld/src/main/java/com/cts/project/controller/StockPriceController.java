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

import com.cts.project.pojos.StockPrice;
@CrossOrigin(origins="*")
@RestController
@RequestMapping("/StockPrice")
public class StockPriceController {

	@Autowired

	private com.cts.project.dao.StockPriceRepository stockpriceRepository;

	
	@RequestMapping("/getAllStockPrice")
	public Iterable<StockPrice> getAllStockPrice() {

		return stockpriceRepository.findAll();

	}

	@PostMapping("/saveStockPrice")

	public StockPrice saveStockPrice(@RequestBody StockPrice stockprice) {

		System.out.println(stockprice);

		stockpriceRepository.save(stockprice);

		return stockprice;

	}

	@PutMapping("/updateStockPrice/{stockexchange}")

	public StockPrice updateStockPrice(@RequestBody StockPrice stockprice,
			@PathVariable("stockexchange") String stockexchange) {

		stockprice.setStockexchange(stockexchange);

		System.out.println(stockprice);

		stockpriceRepository.save(stockprice);

		return stockprice;

	}

	@DeleteMapping("/deleteStockPrice/{stockexchange}")

	public Boolean deleteStockPrice(@PathVariable("stockexchange") String stockexchange) {

		System.out.println(stockexchange);

		Optional<StockPrice> stockprice = stockpriceRepository.findById(stockexchange);

		stockpriceRepository.delete(stockprice.get());

		return true;

	}

	@GetMapping("/findOneInAll5/{stockexchange}")

	public StockPrice findOneInAll5(@PathVariable("stockexchange") String stockexchange)

	{

		Optional<StockPrice> stockprice = stockpriceRepository.findById(stockexchange);

		return stockprice.get();

	}
	@GetMapping("/getCompanydata/{companyname}")
	public String getCompanydata(@PathVariable("companyname") String companyname)
	{
		return "[{\r\n" + 
				"        name: 'tcs',\r\n" + 
				"        data: [90000, 20000, 10000, 30000, 60000, 10000, 30000]\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      name: 'cts',\r\n" + 
				"      data: [70000, 30000, 30000, 20000, 70000, 90000, 50000]\r\n" + 
				"  }]";
	}

}
