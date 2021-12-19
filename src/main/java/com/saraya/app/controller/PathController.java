package com.saraya.app.controller;

import com.saraya.app.model.Path;
import com.saraya.app.service.PathService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.Set;


@RestController
@RequestMapping("/api/paths")
public class PathController {
    @Autowired
    PathService pathService;

    @GetMapping
    public ResponseEntity<Set<Path>> response1(){
        return ResponseEntity.ok()
                .body(pathService.allpaths());
    }
    @GetMapping("/find/{pathName}")
    public ResponseEntity<Path> response2 (@PathVariable String pathName){
        return ResponseEntity.ok()
                .body(pathService.getPathByName(pathName));

    }
    @DeleteMapping("/delete/{idPath}")
    public ResponseEntity<Void> response3 (@PathVariable Long idPath){
        pathService.deletePathById(idPath);
        return ResponseEntity.ok().build();
    }
    @PostMapping("/add")
    public ResponseEntity<Path> newPath(@RequestBody Path path){
        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/add").toUriString());
        return ResponseEntity.created(uri).body(pathService.createPath(path));
    }
    // TODO PUTMAPPING for updates

}
