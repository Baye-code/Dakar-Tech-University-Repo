package com.saraya.app.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

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
