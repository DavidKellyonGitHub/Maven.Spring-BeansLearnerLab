
package com.beanslearner.beanslearner;

import org.springframework.beans.factory.annotation.Qualifier;

@Qualifier(value = "instructor")
public class Instructor extends Person implements Teacher {
    public Instructor(Long id, String name) {
        super(id, name);
    }

    @Override
    public void lecture(Iterable<? extends Learner> learners, double numberOfHours) {
        int learnerCount = 0;
        for(Learner learner : learners){
            learnerCount++;
        }
        for(Learner learner : learners){
            learner.learn(numberOfHours/learnerCount);
        }
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }
}
