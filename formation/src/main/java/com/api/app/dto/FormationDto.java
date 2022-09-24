package com.api.app.dto;

import com.api.app.entity.FormationEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FormationDto {

    private Long idFormation;

    private String titre;

    private boolean etat;

    private Date dateFormation;

    public FormationDto EntityToDto(FormationEntity formationEntity){

        FormationDto formationDto = new FormationDto();

        formationDto.setIdFormation(formationEntity.getIdFormation());
        formationDto.setTitre(formationEntity.getTitre());
        formationDto.setDateFormation(formationEntity.getDateFormation());
        formationDto.setEtat(false);

        return formationDto;
    }

    public FormationEntity DtoToEntity(FormationDto formationDto){

        var formationEntity = new FormationEntity();

        formationEntity.setIdFormation(formationDto.getIdFormation());
        formationEntity.setTitre(formationDto.getTitre());
        formationEntity.setDateFormation(formationDto.getDateFormation());
        formationEntity.setEtat(false);

        return formationEntity;
    }
}
