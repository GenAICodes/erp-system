
    package com.erp.system.service;
    import com.erp.system.model.Production;
    import com.erp.system.repository.ProductionRepository;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.stereotype.Service;
    import java.util.Date;
    import java.util.List;
    @Service
    public class ProductionService {
        @Autowired
        private ProductionRepository productionRepository;
        public Production createProduction(Long employeeId, Date date, Integer quantity) {
            Production production = new Production(employeeId, date, quantity);
            return productionRepository.save(production);
        }
        public List<Production> getProductionByEmployeeId(Long employeeId) {
            return productionRepository.findAllByEmployeeId(employeeId);
        }
        public List<Production> getProductionByDate(Date date) {
            return productionRepository.findAllByDate(date);
        }
    }
