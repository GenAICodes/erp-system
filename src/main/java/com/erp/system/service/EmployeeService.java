
    package com.erp.system.service;
    import com.erp.system.model.Company;
    import com.erp.system.model.Employee;
    import com.erp.system.repository.EmployeeRepository;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.stereotype.Service;
    import java.util.List;
    import java.util.Optional;
    @Service
    public class EmployeeService {
        @Autowired
        private EmployeeRepository employeeRepository;
        public Employee createEmployee(String name, Integer pin, Company company) {
            Employee employee = new Employee(name, pin, company);
            return employeeRepository.save(employee);
        }
        public List<Employee> getAllEmployees() {
            return employeeRepository.findAll();
        }
        public Optional<Employee> getEmployeeById(Long id) {
            return employeeRepository.findById(id);
        }
        public List<Employee> getEmployeesByCompanyId(Long companyId) {
            return employeeRepository.findAllByCompanyId(companyId);
        }
        public Employee updateEmployee(Long id, String name, Integer pin, Company company) {
            Optional<Employee> optionalEmployee = employeeRepository.findById(id);
            if (optionalEmployee.isPresent()) {
                Employee employee = optionalEmployee.get();
                employee.setName(name);
                employee.setPin(pin);
                employee.setCompany(company);
                return employeeRepository.save(employee);
            } else {
                return null;
            }
        }
    }
