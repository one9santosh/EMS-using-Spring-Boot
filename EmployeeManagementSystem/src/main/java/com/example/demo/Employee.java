package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.NotFound;

import lombok.Data;
@Data
@Entity
public class Employee {
@Id
@NotNull
private int id;
@NotNull
private String name;
@NotNull
private String fathername;
@NotNull
private String age;
@NotNull
private String dob;
@NotNull
private String address;
@NotNull
private String number;
@NotNull
private String jobpost;

}
