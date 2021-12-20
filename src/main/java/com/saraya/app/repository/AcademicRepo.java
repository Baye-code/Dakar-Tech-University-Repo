package com.saraya.app.repository;

import com.saraya.app.model.Academic;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcademicRepo extends JpaRepository<Academic,Long> {
    public Academic findAcademicByIdAcademic(Long idAcademic);
    public Academic findAcademicByLevelName(String levelName);
}
