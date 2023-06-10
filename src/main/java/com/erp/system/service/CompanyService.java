
    package com.erp.system.service;
    import com.erp.system.model.Company;
    import com.erp.system.repository.CompanyRepository;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.stereotype.Service;
    import java.util.List;
    import java.util.Optional;
    @Service
    public class CompanyService {
        @Autowired
        private CompanyRepository companyRepository;
        public Company createCompany(String name) {
            Company company = new Company(name);
            return companyRepository.save(company);
        }
        public List<Company> getAllCompanies() {
            return companyRepository.findAll();
        }
        public Optional<Company> getCompanyById(Long id) {
            return companyRepository.findById(id);
        }
        public Company updateCompany(Long id, String name) {
            Optional<Company> optionalCompany = companyRepository.findById(id);
            if (optionalCompany.isPresent()) {
                Company company = optionalCompany.get();
                company.setName(name);
                return companyRepository.save(company);
            } else {
                return null;
            }
        }
    }
