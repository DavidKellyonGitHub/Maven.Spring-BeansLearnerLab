package com.beanslearner.beanslearner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ClassroomConfig {


    @Bean
    public Classroom currentCohort(Instructors instructors, Students students){
        return new Classroom(instructors,students);
    }


}
