package com.saraya.app.repository;

import com.saraya.app.model.Path;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PathRepo extends JpaRepository<Path,Long> {
	public Path findPathByLibelle(String libelle);
	public Path findPathByIdPath(Long idPath);
	
}
