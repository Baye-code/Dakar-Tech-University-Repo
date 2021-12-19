package com.saraya.app.repository;

import com.saraya.app.model.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InstructorRepo extends JpaRepository<Instructor,Long> {
    public Instructor findInstructorByEmail(String email);
    public Instructor findInstructorByName(String name);
    public Instructor findInstructorByIdInstructor(Long idInstructor);
    public List<Instructor> findAllInstructorBySpeciality(String speciality);
}
