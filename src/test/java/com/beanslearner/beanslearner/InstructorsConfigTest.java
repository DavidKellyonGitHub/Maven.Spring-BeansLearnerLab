package com.beanslearner.beanslearner;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class InstructorsConfigTest {

    @Autowired
    @Qualifier("USAInstructors")
    Instructors USAInstructors;

    @Autowired
    @Qualifier("UKInstructors")
    Instructors UKInstructors;

    @Autowired
    @Qualifier("instructors")
    Instructors ZCWInstructors;


    @Test
    void tcUsaInstructors() {
        Assert.assertTrue(USAInstructors.findById(1L).getName().equals("USADolio"));
    }

    @Test
    void tcUkInstuctors() {
        Assert.assertTrue(UKInstructors.findById(5L).getName().equals("UKDolio"));
    }

    @Test
    void instructors() {
        Assert.assertTrue(ZCWInstructors.findById(9L).getName().equals("ZCWDolio"));
    }
}