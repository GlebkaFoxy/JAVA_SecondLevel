package com.gb.lesson1.obstacles;

import com.gb.lesson1.Exseptions.AnimalOutFromDistanceException;
import com.gb.lesson1.Exseptions.CrossFailException;
import com.gb.lesson1.animals.Animal;

/**
 * Created by Tim on 12.07.2016.
 */
public class Cross extends Obstacle {

    public Cross(int value) {
        super(value);
    }

    @Override
    public void doIt(Animal animal) throws  CrossFailException {
       try {
           animal.cross(getValue());
       }catch (AnimalOutFromDistanceException e){
           throw new CrossFailException(getValue(), animal.toString());
       }
    }

    @Override
    public String toString() {
        return "бег на дистанцию";
    }
}
