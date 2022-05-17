package com.sahan.springdatajpa.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {

    @Id
    @SequenceGenerator(
            name = "studentID-sequence",
            sequenceName = "studentID_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "studentID-sequence"
    )
    private String StudentId;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String guardianName;
    private String guardianEmail;
    private String guardianMobile;
}
