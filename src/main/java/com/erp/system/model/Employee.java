
    package com.erp.system.model;
    import javax.persistence.*;
    @Entity
    @Table(name = "employee")
    public class Employee {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String name;
        private Integer pin;
        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "company_id")
        private Company company;
        public Employee() {}
        public Employee(String name, Integer pin, Company company) {
            this.name = name;
            this.pin = pin;
            this.company = company;
        }
        public Long getId() {
            return id;
        }
        public void setId(Long id) {
            this.id = id;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public Integer getPin() {
            return pin;
        }
        public void setPin(Integer pin) {
            this.pin = pin;
        }
        public Company getCompany() {
            return company;
        }
        public void setCompany(Company company) {
            this.company = company;
        }
    }
