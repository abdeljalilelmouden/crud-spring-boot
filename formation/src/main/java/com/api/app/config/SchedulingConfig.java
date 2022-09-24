package com.api.app.config;

import com.api.app.entity.FormationEntity;
import com.api.app.repository.IFormationRepository;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Date;
import java.util.UUID;

@Configuration
@EnableScheduling
public class SchedulingConfig {

    @Autowired
    private IFormationRepository formationRepository;

    /*@Value("${mon-param-cron}")
    private String monvalue;
    public void scheduleTaskUsingCronExpression() {
        System.out.println(monvalue);
        String generatedString = RandomStringUtils.randomAlphabetic(10);
        formationRepository.save(new FormationEntity(null, generatedString, false, new Date()));
        System.out.println(formationRepository.findAll().size());
    }*/
}
