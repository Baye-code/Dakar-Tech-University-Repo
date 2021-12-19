package com.saraya.app.controller;

import com.saraya.app.model.Instructor;
import com.saraya.app.service.InstructorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/instructors")
public class InstructorController {

    @Autowired
    private InstructorService service;

    @GetMapping
    public ResponseEntity<List<Instructor>> response1(){
        return ResponseEntity.ok().body(service.allInstructors());
    }
    @GetMapping("/{speciality}")
    public ResponseEntity<List<Instructor>> response2(@PathVariable String speciality){
        return ResponseEntity.ok().body(service.InstructorsOfSpeciality(speciality));
    }
    @PostMapping("/add")
    public ResponseEntity<Instructor> addIntroctor(@RequestBody Instructor instructor){

        URI uri=URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/add").toUriString());
        return ResponseEntity.created(uri).body(service
                .addNewInstructor(instructor));
    }
    @DeleteMapping("/delete/{idInstructor}")
    public ResponseEntity<Void> deleteInstctr(@PathVariable Long idInstructor){
        service.deleteInstructor(idInstructor);
        return ResponseEntity.ok().build();
    }

// TODO PUTMAPPING for updates

}
