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
    @Qualifier(value = "USAInstructors")
    Instructors USAInstructors;

    @Autowired
    @Qualifier(value = "tcUkInstructors")
    Instructors tcUkInstructors;

    @Autowired
    @Qualifier(value = "instructors")
    Instructors ZCWInstructors;

    @Test
    void tcUsaInstructors() {
        Assert.assertEquals("USADolio", USAInstructors.findById(1L).getName());
    }

    @Test
    void tcUkInstructors() {
        Assert.assertEquals("UKDolio", tcUkInstructors.findById(5L).getName());
    }

    @Test
    void instructors() {
        Assert.assertEquals("ZCWDolio", ZCWInstructors.findById(9L).getName());
    }
}