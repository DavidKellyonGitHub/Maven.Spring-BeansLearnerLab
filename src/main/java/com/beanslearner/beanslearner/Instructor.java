
package com.beanslearner.beanslearner;

import org.springframework.beans.factory.annotation.Qualifier;

@Qualifier(value = "instructor")
public class Instructor extends Person implements Teacher {
    Double numberOfHoursTaught = 0D;

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
        this.numberOfHoursTaught += numberOfHours;
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
        this.numberOfHoursTaught += numberOfHours;
    }

    public Double getNumberOfHoursTaught() {
        return numberOfHoursTaught;
    }

    public void setNumberOfHoursTaught(Double numberOfHoursTaught) {
        this.numberOfHoursTaught = numberOfHoursTaught;
    }
}
