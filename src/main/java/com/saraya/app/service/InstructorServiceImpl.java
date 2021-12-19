package com.saraya.app.service;

import com.saraya.app.model.Instructor;
import com.saraya.app.repository.InstructorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstructorServiceImpl implements InstructorService{
    @Autowired
    private InstructorRepo repo;

    @Override
    public List<Instructor> allInstructors() {
        return repo.findAll();
    }

    @Override
    public List<Instructor> InstructorsOfSpeciality(String speciality) {
        return repo.findAllInstructorBySpeciality(speciality);
    }

    @Override
    public Instructor findInstructorByEmail(String email) {
        return repo.findInstructorByEmail(email);
    }

    @Override
    public Instructor findInstructorByName(String name) {
        return repo.findInstructorByName(name);
    }

    @Override
    public Instructor addNewInstructor(Instructor instructor) {
        return repo.save(instructor);
    }

    @Override
    public void deleteInstructor(Long idIntructor) {
        Instructor teacher=repo.findInstructorByIdInstructor(idIntructor);
        if (teacher != null) {
            repo.delete(teacher);
        }
    }
}
