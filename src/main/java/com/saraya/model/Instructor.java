package com.saraya.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name = "instructor")
@Entity
public class Instructor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idInstructor;
	
	@Column(name = "name", nullable = false)
	private String name;
	
	@Column(name = "phone_number", nullable = false)
	private long phoneNumber;
	
	@Column(name = "email", nullable = false)
	private String email;
	
	@Column(name = "speciality", nullable = false)
	private String speciality;
	
	@Column(name = "creationTime", nullable = false)
	private LocalDateTime creationTime;

}
