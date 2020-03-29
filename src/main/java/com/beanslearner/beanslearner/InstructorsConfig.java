package com.beanslearner.beanslearner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class InstructorsConfig {
    Instructors techConUK;
    Instructors zcw;

    @Bean(name = "USAInstructors")
    public Instructors tcUsaInstructors(){
        List<Instructor> inst = new ArrayList<>();
        inst.add(new Instructor(1L,"USADolio"));
        inst.add(new Instructor(2L,"USANobles"));
        inst.add(new Instructor(3L,"USAFroilan"));
        inst.add(new Instructor(4L,"USAKris"));
        return new Instructors(inst);
    }

    @Bean(name = "UKInstructors")
    public Instructors tcUkInstuctors(){
        List<Instructor> inst = new ArrayList<>();
        inst.add(new Instructor(5L,"UKDolio"));
        inst.add(new Instructor(6L,"UKNobles"));
        inst.add(new Instructor(7L,"UKFroilan"));
        inst.add(new Instructor(8L,"UKKris"));
        return new Instructors(inst);
    }

    @Primary
    @Bean(name = "instructors")
    public Instructors instructors(){
        List<Instructor> inst = new ArrayList<>();
        inst.add(new Instructor(9L,"ZCWDolio"));
        inst.add(new Instructor(10L,"ZCWNobles"));
        inst.add(new Instructor(11L,"ZCWFroilan"));
        inst.add(new Instructor(12L,"ZCWKris"));
        return new Instructors(inst);
    }


}
