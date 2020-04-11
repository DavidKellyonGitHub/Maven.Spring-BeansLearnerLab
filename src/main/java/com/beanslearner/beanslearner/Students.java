package com.beanslearner.beanslearner;

import org.springframework.beans.factory.annotation.Qualifier;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

@Qualifier(value = "students")
public class Students extends People<Student> {

    public Students(List personList) {
        super(personList);
    }

    @Override
    public void forEach(Consumer<? super Student> action) {

    }

    @Override
    public Spliterator<Student> spliterator() {
        return null;
    }
}
