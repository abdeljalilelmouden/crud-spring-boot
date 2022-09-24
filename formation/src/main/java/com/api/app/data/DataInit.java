package com.api.app.data;

import com.api.app.entity.FormationEntity;
import com.api.app.repository.IFormationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class DataInit implements CommandLineRunner {

    @Autowired
    private IFormationRepository formationRepository;
    /**
     * @param args
     * @throws Exception
     */
    @Override
    public void run(String... args) throws Exception {

        formationRepository.save(new FormationEntity(null, "JAVA", false, new Date()));

        formationRepository.save(new FormationEntity(null, "PHP", false, new Date()));

        formationRepository.save(new FormationEntity(null, "PYTHON", false, new Date()));

        formationRepository.save(new FormationEntity(null, "CASSANDRA", false, new Date()));

        formationRepository.save(new FormationEntity(null, "ANGULAR", false, new Date()));
    }
}
