package com.saraya.app.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

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
