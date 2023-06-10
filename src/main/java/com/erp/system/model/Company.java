
    package com.erp.system.model;
    import javax.persistence.*;
    import java.util.List;
    @Entity
    @Table(name = "company")
    public class Company {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String name;
        @OneToMany(mappedBy = "company", cascade = CascadeType.ALL)
        private List<Employee> employees;
        public Company() {}
        public Company(String name) {
            this.name = name;
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
        public List<Employee> getEmployees() {
            return employees;
        }
        public void setEmployees(List<Employee> employees) {
            this.employees = employees;
        }
    }
