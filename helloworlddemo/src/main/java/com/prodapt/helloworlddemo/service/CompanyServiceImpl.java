package com.prodapt.helloworlddemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prodapt.helloworlddemo.entities.CompanyDTO;
import com.prodapt.helloworlddemo.exceptions.CompanyNotFoundException;
import com.prodapt.helloworlddemo.exceptions.NoRecordFoundException;
import com.prodapt.helloworlddemo.repositories.CompanyRepository;

@Service
public class CompanyServiceImpl implements CompanyService {

	@Autowired
	private CompanyRepository repo;

	@Override
	public String createCompany(CompanyDTO company) {
		CompanyDTO comp = repo.save(company);
		if (comp != null) {
			return "Company added successfully";
		} else {
			return "Unable to add company";
		}
	}

	@Override
	public CompanyDTO getCompanyById(Integer companyId) throws CompanyNotFoundException {
		Optional<CompanyDTO> company = repo.findById(companyId);
		if (company.isPresent()) {
			return company.get();
		}
		return null;
	}

	@Override
	public List<CompanyDTO> companies() throws NoRecordFoundException {
		List<CompanyDTO> listOfCompany = (List<CompanyDTO>) repo.findAll();
		if (listOfCompany != null) {
			return listOfCompany;
		}
		return null;
	}

	@Override
	public String deleteCompanyById(Integer companyId) throws CompanyNotFoundException {
		Optional<CompanyDTO> comp = repo.findById(companyId);
		if (comp.isPresent()) {
			repo.deleteById(companyId);
			return "Company with companyId " + companyId + " deleted successfully";
		} else {
			return "Company with companyId " + companyId + " doesn't exists";
		}
	}

	@Override
	public CompanyDTO updateCompany(CompanyDTO companyDTO) throws CompanyNotFoundException {
		Optional<CompanyDTO> comp = repo.findById(companyDTO.getCompanyId());
		if (comp.isPresent()) {
			return repo.save(companyDTO);
		} else {
			throw new CompanyNotFoundException("Company with companyId " + companyDTO.getCompanyId() + " doesn't exists");
		}
	}

	@Override
	public List<CompanyDTO> getCompanyByName(String name) throws CompanyNotFoundException {
		
		return repo.findByName(name);
	}

	@Override
	public List<CompanyDTO> getCompanyByCity(String city) throws NoRecordFoundException {
		return repo.findByCity(city);
	}

}
