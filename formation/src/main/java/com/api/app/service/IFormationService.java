package com.api.app.service;

import com.api.app.entity.FormationEntity;

import java.util.Collection;
import java.util.List;

public interface IFormationService {

    /**
     * get all formation from database
     *
     * @return List<FormationEntity>
     */
    public List<FormationEntity> getAllFormation();

    /**
     * create formation
     *
     * @param formationEntity
     * @return FormationEntity
     */
    public FormationEntity createFormation(FormationEntity formationEntity);

    /**
     * update formation
     *
     * @param formationEntity
     * @return FormationEntity
     */
    public FormationEntity updateFormation(FormationEntity formationEntity);

    /**
     * delete formation
     *
     * @param idFormation
     */
    public void deleteFormation(Long idFormation);

    /**
     * get formation by id
     *
     * @param idFormation
     * @return FormationEntity
     */
    public FormationEntity getById(Long idFormation);

    /**
     * get formation by titre
     *
     * @param titre
     * @return FormationEntity
     */
    public FormationEntity getFormationByTitre(String titre);

}
