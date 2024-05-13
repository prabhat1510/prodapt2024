package com.prodapt.helloworlddemo.utility;

import com.prodapt.helloworlddemo.entities.CompanyDTO;
import com.prodapt.helloworlddemo.model.Company;

public class CompanyUtility {
		
		public static CompanyDTO  convertCompanyToCompanyDTO(Company company) {
			CompanyDTO companyDTO = new CompanyDTO();
			companyDTO.setCompanyId(company.getCompanyId());
			companyDTO.setName(company.getName());
			companyDTO.setCity(company.getCity());
			return companyDTO;
		}
		
		public static Company convertCompanyDTOToCompany(CompanyDTO dto) {
			Company company = new Company();
			company.setCompanyId(dto.getCompanyId());
			company.setName(dto.getName());
			company.setCity(dto.getCity());
			return company;
		}
	}
