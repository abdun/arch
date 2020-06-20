package com.techno.model;

//import org.springframework.data.annotation.Id;
//import org.springframework.data.mongodb.core.mapping.Document;
//import org.springframework.data.mongodb.core.mapping.Field;
//import javax.persistence.Column;
//import java.time.LocalDate;
//import java.util.HashMap;
//import java.util.Map;
//
//@Document(collection = "employee")
//public class Employee {
//    @Id
//    @Column(name = "_id")
//    private Double id;
//    @Column(name = "first_name")
//    private String first_name;
//    @Column(name = "last_name")
//    private String last_name;
//    @Column(name = "date_of_birth")
//    private String date_of_birth;
//    @Column(name = "email")
//    private String email;
//    @Column(name = "phone")
//    private String phone;
//
//    private Map<String, String> userSettings = new HashMap<>();
//    public Double getId() {
//        return id;
//    }
//    public void setId(Double id) {
//        this.id =id;
//    }
//    public String getFirstName() {
//        return first_name;
//    }
//    public void setFirstName(String firstName) {
//        this.first_name = firstName;
//    }
//    public String getLastName() {
//        return last_name;
//    }
//    public void setLastName(String lastName) {
//        this.last_name = lastName;
//    }
//    public String getBirthDate() {
//        return date_of_birth;
//    }
//    public void setBirthDate(String birthDate) {
//        this.date_of_birth = birthDate;
//    }
//    public String getEmail() {
//        return email;
//    }
//    public void setEmail(String email) { this.email = email; }
//    public String getPhone() {
//        return phone;
//    }
//    public void setPhone(String phone) { this.phone = phone; }
//    public Map<String, String> getUserSettings() {
//        return userSettings;
//    }
//    public void setUserSettings(Map<String, String> userSettings) {
//        this.userSettings = userSettings;
//    }
//}
