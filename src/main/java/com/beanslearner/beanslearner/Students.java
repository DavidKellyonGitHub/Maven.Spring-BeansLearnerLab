package com.beanslearner.beanslearner;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Students extends People<Student> {

    public Students(Student... students) {
        super(Arrays.asList(students));
    }

    @Override
    public Iterator<Student> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super Student> action) {

    }

    @Override
    public Spliterator<Student> spliterator() {
        return null;
    }
}
