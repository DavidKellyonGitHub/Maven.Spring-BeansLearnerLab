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
class StudentConfigTest {

    @Autowired
    Students students;

    @Autowired
    Students previousStudents;

    @Test
    void currentStudents() {
        Assert.assertEquals(students.findById(13L).getName(), "DaveK");
    }

    @Test
    void previous() {
        Assert.assertEquals(previousStudents.findById(19L).getName(), "JoannaC");
    }
}