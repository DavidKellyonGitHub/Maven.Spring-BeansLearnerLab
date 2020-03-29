package com.beanslearner.beanslearner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class StudentConfig {
    Students previousStudents;

    @Bean(name = "students")
    public Students currentStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student(13L,"DaveK"));
        students.add(new Student(14L, "DaveC"));
        students.add(new Student(15L, "KevinR"));
        students.add(new Student(16L,"MattA"));
        return new Students(students);
    }

    @Bean(name = "previousStudents")
    public Students previous(){
        List<Student> previousStudents = new ArrayList<>();
        previousStudents.add(new Student(17L,"JimmyC"));
        previousStudents.add(new Student(18L,"MikeK"));
        previousStudents.add(new Student(19L,"JoannaC"));
        previousStudents.add(new Student(20L,"Josh"));

        return new Students(previousStudents);
    }

}
