package com.saraya.app.model;


import lombok.Data;

import javax.persistence.*;
import java.util.Set;


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

	@OneToMany(fetch = FetchType.LAZY)
	private Set<Path> paths;


}
