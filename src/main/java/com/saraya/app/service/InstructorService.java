package com.saraya.app.service;

import com.saraya.app.model.Instructor;

import java.util.List;

public interface InstructorService {
    public List<Instructor> allInstructors();
    public List<Instructor> InstructorsOfSpeciality(String speciality);
    public Instructor findInstructorByEmail(String email);
    public Instructor findInstructorByName(String name);
    public Instructor addNewInstructor(Instructor instructor);
    public void deleteInstructor(Long idIntructor);
    // TODO implement it later
    default void modifyInstructorInfo() {

    }

}
