package com.saraya.app.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

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

	@Column(name = "profile_photo", nullable = false)
	private String profilePhoto;

}
