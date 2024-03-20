package com.example.jwtspring3.model;

import jakarta.persistence.*;


import java.time.LocalDate;

@Entity
public class RecruitmentPost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String title;
    private Long salary;
    private String position;
    private String exp;
    private String workingForm;
    private LocalDate expiryDate;
    private String description;
    private String recruitmentQuota;
    private String sex;
    private String status;

    @ManyToOne
    private Enterprise enterprise;

    public RecruitmentPost(Long id, String title, Long salary, String position, String exp, String workingForm, LocalDate expiryDate, String description, String recruitmentQuota, String sex, String status, Enterprise enterprise) {
        this.id = id;
        this.title = title;
        this.salary = salary;
        this.position = position;
        this.exp = exp;
        this.workingForm = workingForm;
        this.expiryDate = expiryDate;
        this.description = description;
        this.recruitmentQuota = recruitmentQuota;
        this.sex = sex;
        this.status = status;
        this.enterprise = enterprise;
    }

    public RecruitmentPost() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }

    public String getWorkingForm() {
        return workingForm;
    }

    public void setWorkingForm(String workingForm) {
        this.workingForm = workingForm;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRecruitmentQuota() {
        return recruitmentQuota;
    }

    public void setRecruitmentQuota(String recruitmentQuota) {
        this.recruitmentQuota = recruitmentQuota;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }
}
