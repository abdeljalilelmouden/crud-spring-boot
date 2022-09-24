package com.api.app.repository;

import com.api.app.entity.FormationEntity;
import jdk.jfr.Registered;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

@Registered
public interface IFormationRepository extends JpaRepository<FormationEntity, Long> {

    @Query("SELECT f FROM FormationEntity f WHERE f.titre =:titre")
    FormationEntity getFormationByTitre(String titre);

}
