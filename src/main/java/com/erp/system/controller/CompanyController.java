
    package com.erp.system.controller;
    import com.erp.system.model.Company;
    import com.erp.system.service.CompanyService;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.http.HttpStatus;
    import org.springframework.http.ResponseEntity;
    import org.springframework.web.bind.annotation.*;
    import java.util.List;
    import java.util.Optional;
    @RestController
    @RequestMapping("/companies")
    public class CompanyController {
        @Autowired
        private CompanyService companyService;
        @PostMapping
        public ResponseEntity<Company> createCompany(@RequestParam String name) {
            Company company = companyService.createCompany(name);
            return new ResponseEntity<>(company, HttpStatus.CREATED);
        }
        @GetMapping
        public ResponseEntity<List<Company>> getAllCompanies() {
            List<Company> companies = companyService.getAllCompanies();
            return new ResponseEntity<>(companies, HttpStatus.OK);
        }
        @PutMapping("/{id}")
        public ResponseEntity<Company> updateCompany(@PathVariable Long id, @RequestParam String name) {
            Company company = companyService.updateCompany(id, name);
            if (company != null) {
                return new ResponseEntity<>(company, HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        }
    }
