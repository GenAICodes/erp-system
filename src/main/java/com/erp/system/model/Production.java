
    package com.erp.system.model;
    import javax.persistence.*;
    import java.util.Date;
    @Entity
    @Table(name = "production")
    public class Production {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private Long employeeId;
        private Date date;
        private Integer quantity;
        public Production() {}
        public Production(Long employeeId, Date date, Integer quantity) {
            this.employeeId = employeeId;
            this.date = date;
            this.quantity = quantity;
        }
        public Long getId() {
            return id;
        }
        public void setId(Long id) {
            this.id = id;
        }
        public Long getEmployeeId() {
            return employeeId;
        }
        public void setEmployeeId(Long employeeId) {
            this.employeeId = employeeId;
        }
        public Date getDate() {
            return date;
        }
        public void setDate(Date date) {
            this.date = date;
        }
        public Integer getQuantity() {
            return quantity;
        }
        public void setQuantity(Integer quantity) {
            this.quantity = quantity;
        }
    }
