package com.cybercitycode.clinicaltrialssubject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication(scanBasePackages = "com.cybercitycode")
@EnableMongoRepositories("com.cybercitycode.subject.repository")
public class ClinicalTrialsSubjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClinicalTrialsSubjectApplication.class, args);
    }
}
