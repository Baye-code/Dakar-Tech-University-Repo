package com.saraya.model;

import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;

@Data
@Entity
public class Subject {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idSubject;
	
	@Column(name = "libelle", nullable = false)
	private String libelle;
	
	@Column(name = "description", nullable = false)
	private String description;
	
	@Column(name = "hours", nullable = false)
	private int hours;
	
	@ManyToMany(fetch = FetchType.LAZY)
	private Set<Path> setOfPaths;
	
	@Column(name = "creationTime", nullable = false)
	private LocalDateTime creationTime;
	

}
