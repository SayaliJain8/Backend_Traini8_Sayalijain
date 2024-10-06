package com.example.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;  // Make sure this is the only import for validation constraints
import java.time.Instant;
import java.util.List;

@Entity // Marking the class as an entity
public class TrainingCenter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 40, nullable = false)
    @Size(max = 40)
    @NotBlank
    private String centerName;

    @Column(length = 12, nullable = false, unique = true)
    @Pattern(regexp = "^[a-zA-Z0-9]{12}$")
    @NotBlank
    private String centerCode;

    @Embedded
    private Address address;

    private Integer studentCapacity;

    @ElementCollection
    private List<String> coursesOffered;

    private Long createdOn;

    @Email
    private String contactEmail;

    @Column(nullable = false)
    @Pattern(regexp = "^[0-9]{10}$")
    @NotBlank
    private String contactPhone;

    // Getters and Setters

    @PrePersist
    public void prePersist() {
        this.createdOn = Instant.now().getEpochSecond();
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCenterName() {
        return centerName;
    }

    public void setCenterName(String centerName) {
        this.centerName = centerName;
    }

    public String getCenterCode() {
        return centerCode;
    }

    public void setCenterCode(String centerCode) {
        this.centerCode = centerCode;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Integer getStudentCapacity() {
        return studentCapacity;
    }

    public void setStudentCapacity(Integer studentCapacity) {
        this.studentCapacity = studentCapacity;
    }

    public List<String> getCoursesOffered() {
        return coursesOffered;
    }

    public void setCoursesOffered(List<String> coursesOffered) {
        this.coursesOffered = coursesOffered;
    }

    public Long getCreatedOn() {
        return createdOn;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }
}