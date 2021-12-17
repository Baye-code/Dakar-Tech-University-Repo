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
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name = "path")
@Entity
public class Path {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPath;
	
	@Column(name = "libelle", nullable = false)
	private String libelle;
	
	@Column(name = "numberOfPlace", nullable = false)
	private int numberOfPlace;
	
	@Column(name = "description", nullable = false)
	private String description;
	
	@Column(name = "duration", nullable = false)
	private int duration;
	
	@Column(name = "cost", nullable = false)
	private String cost;
	
	@ManyToMany(fetch = FetchType.LAZY)
	private Set<Subject> setOfSubjects;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Academic level;
	
	@Column(name = "creationTime", nullable = false)
	private LocalDateTime creationTime;
	

}
