package com.saraya.app.service;

import com.saraya.app.model.Path;
import com.saraya.app.repository.PathRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class PathServiceImpl implements PathService {

    @Autowired
    private PathRepo repo;

    @Override
    public Path getPathByName(String name) {
        return repo.findPathByLibelle(name);
    }

    @Override
    public Path getPathById(Long id) {
        return repo.findPathByIdPath(id);
    }

    @Override
    public Path createPath(Path path) {
        return repo.save(path);
    }

    @Override
    public void deletePathById(Long idPath) {
        Path path =getPathById(idPath);
        if (path != null) {
            repo.delete(path);
        }
    }

    @Override
    public Set<Path> allpaths() {
        return repo.findAll().stream().distinct().collect(Collectors.toSet());
    }

}
