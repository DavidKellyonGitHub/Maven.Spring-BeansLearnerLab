package com.beanslearner.beanslearner;

import org.springframework.context.annotation.Bean;

public class StudentConfig {
    Students students;
    Students previousStudents;

    @Bean(name = "students")
    public Students currentStudents(){
        return students;
    }

    @Bean(name = "previousStudents")
    public Students previous(){
        return previousStudents;
    }

}
