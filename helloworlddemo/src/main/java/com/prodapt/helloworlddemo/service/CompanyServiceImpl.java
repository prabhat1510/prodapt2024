package com.prodapt.helloworlddemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prodapt.helloworlddemo.entities.Company;
import com.prodapt.helloworlddemo.exceptions.CompanyNotFoundException;
import com.prodapt.helloworlddemo.exceptions.NoRecordFoundException;
import com.prodapt.helloworlddemo.repositories.CompanyRepository;

@Service
public class CompanyServiceImpl implements CompanyService {

	@Autowired
	private CompanyRepository repo;

	@Override
	public String createCompany(Company company) {
		Company comp = repo.save(company);
		if (comp != null) {
			return "Company added successfully";
		} else {
			return "Unable to add company";
		}
	}

	@Override
	public Company getCompanyById(Integer companyId) throws CompanyNotFoundException {
		Optional<Company> company = repo.findById(companyId);
		if (company.isPresent()) {
			return company.get();
		}
		return null;
	}

	@Override
	public List<Company> companies() throws NoRecordFoundException {
		List<Company> listOfCompany = (List<Company>) repo.findAll();
		if (listOfCompany != null) {
			return listOfCompany;
		}
		return null;
	}

	@Override
	public String deleteCompanyById(Integer companyId) throws CompanyNotFoundException {
		Optional<Company> comp = repo.findById(companyId);
		if (comp.isPresent()) {
			repo.deleteById(companyId);
			return "Company with companyId " + companyId + " deleted successfully";
		} else {
			return "Company with companyId " + companyId + " doesn't exists";
		}
	}

	@Override
	public Company updateCompany(Company company) throws CompanyNotFoundException {
		Optional<Company> comp = repo.findById(company.getCompanyId());
		if (comp.isPresent()) {
			return repo.save(company);
		} else {
			throw new CompanyNotFoundException("Company with companyId " + company.getCompanyId() + " doesn't exists");
		}
	}

	@Override
	public List<Company> getCompanyByName(String name) throws CompanyNotFoundException {
		
		return repo.findByName(name);
	}

	@Override
	public List<Company> getCompanyByCity(String city) throws NoRecordFoundException {
		return repo.findByCity(city);
	}

}
