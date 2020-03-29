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
    @Qualifier("students")
    Students students;

    @Autowired
    @Qualifier("previousStudents")
    Students previousStudents;

    @Test
    void currentStudents() {
        Assert.assertTrue(students.size()>0);
    }

    @Test
    void previous() {
        Assert.assertTrue(previousStudents.size()>0);
    }
}