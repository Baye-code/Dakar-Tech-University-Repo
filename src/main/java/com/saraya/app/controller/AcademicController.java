package com.saraya.app.controller;

import com.saraya.app.model.Academic;
import com.saraya.app.service.AcademicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/academics")
public class AcademicController {
    @Autowired
    private AcademicService service;

    @GetMapping
    public ResponseEntity<List<Academic>> response1(){
        return ResponseEntity.ok().body(service.allAcademics());
    }
    @GetMapping("/{idAcademic}")
    public ResponseEntity<Academic> response4(@PathVariable Long idAcademic){

        return ResponseEntity.ok().body(service.findAcademicLevelById(idAcademic));
    }

    @PostMapping("/add")
    public ResponseEntity<Academic> response2(@RequestBody Academic academic){
        URI uri=URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/add").toUriString());
        return ResponseEntity.created(uri).body(service.createAcademicLevel(academic));
    }
    @DeleteMapping("/delete/{idAcademic}")
    public ResponseEntity<Void> response3(@PathVariable Long idAcademic){
        service.deleteAcademicLevel(idAcademic);
        return ResponseEntity.ok().build();
    }
}
