package com.techno.model;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.time.LocalDateTime;

//import javax.persistence.Column;
//import javax.persistence.Table;

@Table("person")
public class Person {

    @PrimaryKey
    private PersonKey key;

    @Column("last_name")
    private String lastName;

    @Column("first_name")
    private String firstName;

    @Column("date_of_birth")
    private LocalDateTime dateOfBirth;

    @Column("salary")
    private double salary;


    public Person(final PersonKey key, final String lastName, final double salary) {
        this.key = key;
        this.lastName = lastName;
        this.salary = salary;
    }

    public Person(final PersonKey key, final String lastName, final String firstName, final double salary) {
        this(key,lastName, salary);
        this.key = key;
        this.lastName = lastName;
        this.firstName = firstName;
        this.salary = salary;

    }

    public PersonKey getKey() {
        return key;
    }

    public void setKey(PersonKey key) {
        this.key = key;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public LocalDateTime getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDateTime dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // getters and setters
}