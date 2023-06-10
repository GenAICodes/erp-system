
package com.erp.system.service;
import com.erp.system.model.Company;
import com.erp.system.model.CompanyAdmin;
import com.erp.system.repository.CompanyAdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
public class CompanyAdminService {
    @Autowired
    private CompanyAdminRepository companyAdminRepository;
    public CompanyAdmin createCompanyAdmin(String name, String email, String password, Company company) {
        CompanyAdmin companyAdmin = new CompanyAdmin(name, email, password, company);
        return companyAdminRepository.save(companyAdmin);
    }
    public List<CompanyAdmin> getAllCompanyAdmins() {
        return companyAdminRepository.findAll();
    }
    public Optional<CompanyAdmin> getCompanyAdminById(Long id) {
        return companyAdminRepository.findById(id);
    }
    public CompanyAdmin updateCompanyAdmin(Long id, String name, String email, String password, Company company) {
        Optional<CompanyAdmin> optionalCompanyAdmin = companyAdminRepository.findById(id);
        if (optionalCompanyAdmin.isPresent()) {
            CompanyAdmin companyAdmin = optionalCompanyAdmin.get();
            companyAdmin.setName(name);
            companyAdmin.setEmail(email);
            companyAdmin.setPassword(password);
            companyAdmin.setCompany(company);
            return companyAdminRepository.save(companyAdmin);
        } else {
            return null;
        }
    }
}
