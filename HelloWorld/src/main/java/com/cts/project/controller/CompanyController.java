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

import com.cts.project.pojos.Company;

import com.cts.project.pojos.User;
@CrossOrigin(origins="http://localhost:4200")
@RestController


@RequestMapping("/Companies")
public class CompanyController {

	@Autowired

	private CompanyRepository companyRepository;

	@RequestMapping("/getAllCompanies")

	public Iterable<Company> getAllCompanies() {

		return companyRepository.findAll();

	}

	@PostMapping("/saveCompany")

	public Company saveCompany(@RequestBody Company company) {

		System.out.println(company);

		companyRepository.save(company);

		return company;

	}

	@PutMapping("/updateCompany/{companyname}")

	public Company updateCompany(@RequestBody Company company, @PathVariable("companyname") String companyname) {

		company.setCompanyname(companyname);

		System.out.println(company);

		companyRepository.save(company);

		return company;

	}

	@DeleteMapping("/deleteCompany/{companyname}")

	public Boolean deleteCompany(@PathVariable("companyname") String companyname) {

		System.out.println(companyname);

		companyRepository.deleteById(companyname);

		return true;

	}

	@GetMapping("/findOneInAll1/{companyname}")

	public Company findoneinall(@PathVariable("companyname") String companyname) {

		Optional<Company> company = companyRepository.findById(companyname);

		return company.get();

	}

}
