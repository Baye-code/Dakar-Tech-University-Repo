package com.saraya.app.service;

import com.saraya.app.model.Academic;

import java.util.List;

public interface AcademicService {
    public Academic findAcademicLevelById(Long idAcademic);
    public Academic findAcademicLevelByName(String name);

    public Academic createAcademicLevel(Academic academic);
    public void deleteAcademicLevel(Long idAcademic);

    public List<Academic> allAcademics();
    // TODO create update method
}
