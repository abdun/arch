package com.techno.model;

import org.springframework.data.cassandra.core.mapping.PrimaryKeyClass;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

import static org.springframework.data.cassandra.core.cql.Ordering.DESCENDING;
import static org.springframework.data.cassandra.core.cql.PrimaryKeyType.PARTITIONED;

@PrimaryKeyClass
public class PersonKey implements Serializable {

    @PrimaryKeyColumn(name = "first_name", type = PARTITIONED)
    private String firstName;

    @PrimaryKeyColumn(name = "last_name", type = PARTITIONED)
    private String lastName;

    @PrimaryKeyColumn(name = "date_of_birth", ordinal = 0)
    private LocalDateTime dateOfBirth;

    @PrimaryKeyColumn(name = "person_id", ordinal = 1, ordering = DESCENDING)
    private UUID id;

    public PersonKey(final String firstName, final String lastName, final LocalDateTime dateOfBirth, final UUID id) {
        this.firstName = firstName;
        this.id = id;
        this.dateOfBirth = dateOfBirth;
        this.lastName = lastName;
    }

    // getters and setters

    // equals and hashcode
}