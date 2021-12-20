package com.saraya.app.service;

import com.saraya.app.model.Academic;
import com.saraya.app.repository.AcademicRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AcademicServiceImpl implements AcademicService{
    @Autowired
    private AcademicRepo repo;

    @Override
    public Academic findAcademicLevelById(Long idAcademic) {
        return repo.findAcademicByIdAcademic(idAcademic);
    }

    @Override
    public Academic findAcademicLevelByName(String name) {
        return repo.findAcademicByLevelName(name);
    }

    @Override
    public Academic createAcademicLevel(Academic academic) {
        return repo.save(academic);
    }

    @Override
    public void deleteAcademicLevel(Long idAcademic) {
        Academic academie=repo.findAcademicByIdAcademic(idAcademic);
        if (academie != null) {
            repo.delete(academie);
        }
    }

    @Override
    public List<Academic> allAcademics() {
        return repo.findAll();
    }
}
