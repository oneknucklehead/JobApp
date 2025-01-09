package com.knucklehead.jobApplication.company;

import com.knucklehead.jobApplication.job.Job;

import java.util.List;

public interface CompanyService {
    List<Company> getAllCompanies();
    boolean updateCompany(Company company, Long id);

    Company getCompanyById(Long id);

    void createCompany(Company company);
    boolean deleteCompanyById(Long id);
}
