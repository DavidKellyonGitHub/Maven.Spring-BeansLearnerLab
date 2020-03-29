package com.beanslearner.beanslearner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

public class InstructorsConfig {
    Instructors techConUS;
    Instructors techConUK;
    Instructors zcw;

    @Bean
    public Instructors tcUsaInstructors(){
        return techConUS;
    }

    @Bean
    public Instructors tcUkInstuctors(){
        return techConUK;
    }

    @Primary
    @Bean
    public Instructors instructors(){
        return zcw;
    }


}
