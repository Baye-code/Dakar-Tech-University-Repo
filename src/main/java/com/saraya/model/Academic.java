package com.saraya.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;


@Data
@Table(name = "academics")
@Entity
public class Academic {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAcademic;
	
	@Column(name = "level_name", nullable = false)
	private String levelName;
	
	@Column(name = "duration", nullable = false)
	private int duration;
	
	//*************************************************//
	@OneToMany(fetch = FetchType.LAZY)
	private Path path;


}
