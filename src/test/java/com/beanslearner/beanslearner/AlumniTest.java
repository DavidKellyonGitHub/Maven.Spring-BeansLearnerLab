package com.beanslearner.beanslearner;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class AlumniTest {

    @Autowired
    Alumni alumni;


    @Test
    void executeBootCamp() {
    for (Student student : alumni.getStudents().getPersonList()){
        Assert.assertEquals(1200, student.getTotalStudyTime(), 0.0);
    }
    for (Instructor instructor : alumni.getInstructors().getPersonList()){
        Assert.assertEquals(300, (double) instructor.getNumberOfHoursTaught(), 0.0);
    }
    }
}