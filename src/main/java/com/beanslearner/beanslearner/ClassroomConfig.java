package com.beanslearner.beanslearner;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ClassroomConfig {


    @Bean
    public Classroom currentCohort(@Qualifier("instructors") Instructors instructors, @Qualifier("students") Students students){
        return new Classroom(instructors,students);
    }


}
