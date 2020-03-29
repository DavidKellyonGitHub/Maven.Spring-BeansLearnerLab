package com.beanslearner.beanslearner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public abstract class People<PersonType extends Person> implements Iterable<PersonType> {
    List<PersonType> personList;

    public People(List<PersonType> personList){
        this.personList = personList;
    }

    public void add(PersonType persontype){
        personList.add(persontype);
    }

    public void remove(PersonType personType){
        personList.remove(personType);
    }

    public int size(){return personList.size();}

    public void clear(){personList.clear();}

    public void addAll(Iterable<PersonType> personTypes){
        personList.addAll((Collection<? extends PersonType>) Arrays.asList(personTypes));}
        //alternatively iterate and cast persontypes.getclass to persontype;

    public PersonType findById(Long id){
        for (PersonType pt : personList){
                if (pt.getId().equals(id)){
                    return pt;
                }
        }
        return null;
    }

    public List<PersonType> findAll(){
        return personList;
    }
}
