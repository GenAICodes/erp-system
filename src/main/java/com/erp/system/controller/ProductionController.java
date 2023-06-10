
    package com.erp.system.controller;
    import com.erp.system.model.Production;
    import com.erp.system.service.ProductionService;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.http.HttpStatus;
    import org.springframework.http.ResponseEntity;
    import org.springframework.web.bind.annotation.*;
    import java.util.List;
    @RestController
    @RequestMapping("/productions")
    public class ProductionController {
        @Autowired
        private ProductionService productionService;
        @PostMapping
        public ResponseEntity<Production> createProduction(@RequestParam Long employeeId, @RequestParam String date, @RequestParam Integer quantity) {
            Production production = productionService.createProduction(employeeId, date, quantity);
            return new ResponseEntity<>(production, HttpStatus.CREATED);
        }
        @GetMapping("/employee/{employeeId}")
        public ResponseEntity<List<Production>> getProductionsByEmployeeId(@PathVariable Long employeeId) {
            List<Production> productions = productionService.getProductionsByEmployeeId(employeeId);
            return new ResponseEntity<>(productions, HttpStatus.OK);
        }
        @GetMapping("/date/{date}")
        public ResponseEntity<List<Production>> getProductionsByDate(@PathVariable String date) {
            List<Production> productions = productionService.getProductionsByDate(date);
            return new ResponseEntity<>(productions, HttpStatus.OK);
        }
    }
