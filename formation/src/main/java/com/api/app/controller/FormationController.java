package com.api.app.controller;

import com.api.app.dto.FormationDto;
import com.api.app.entity.FormationEntity;
import com.api.app.impl.FormationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(path = "/formation/api")
@RestController
public class FormationController {

    public static final Logger logger = LoggerFactory.getLogger(FormationController.class);

    @Autowired
    private FormationService formationService;

    /**
     * find all formations
     *
     * @return List<FormationEntity>
     */
    @GetMapping(value = "v0")
    public List<FormationEntity> getAllFormations(){

        logger.info("gat all formation from database - Formation Controller ");

        return formationService.getAllFormation();
    }

    /**
     * create formation in database
     *
     * @param formationEntity
     * @return FormationEntity
     */
    @PostMapping(value = "v0")
    public FormationDto createFormation(@RequestBody FormationDto formationDto){

        logger.info("create formation in database - Formation Controller ");
        FormationEntity formationEntity = formationService.createFormation(formationDto.DtoToEntity(formationDto));
        return new FormationDto().EntityToDto(formationEntity);
    }

    @PutMapping(value = "v0")
    public FormationEntity updateFormation(@RequestBody FormationEntity formationEntity){

        logger.info("update formation in database - Formation Controller ");

        return formationService.updateFormation(formationEntity);
    }

    @DeleteMapping(value = "v0/{idFormation}")
    public void deleteFormation(@PathVariable(name = "idFormation") Long id){

        logger.info("delete formation from database - Formation Controller ");

        formationService.deleteFormation(id);
    }

    @GetMapping(value = "v1/{idFormation}")
    public FormationDto getById(@PathVariable(name = "idFormation") Long id){

        logger.info("gat by id formation from database - Formation Controller ");
        FormationDto formationDto = new FormationDto();
        return formationDto.EntityToDto(formationService.getById(id));
    }

    @GetMapping(value = "v0/{titreFormation}")
    public FormationEntity getFormationByTitre(@PathVariable(name = "titreFormation") String titre){

        logger.info("gat by titre formation from database - Formation Controller ");

        return formationService.getFormationByTitre(titre);
    }

}
