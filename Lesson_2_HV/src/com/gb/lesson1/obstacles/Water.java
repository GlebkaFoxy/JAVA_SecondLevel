package com.gb.lesson1.obstacles;

import com.gb.lesson1.Exseptions.AnimalOutFromDistanceException;
import com.gb.lesson1.Exseptions.WaterFailException;
import com.gb.lesson1.animals.Animal;
import com.gb.lesson1.animals.Swimable;

/**
 * Created by Tim on 13.07.2016.
 */
public class Water extends Obstacle {

    public Water(int value) {
        super(value);
    }

    @Override
    public void doIt(Animal animal) throws  WaterFailException {
        try {


            if (animal instanceof Swimable) {
                Swimable swimableAnimal = (Swimable) animal;
                swimableAnimal.swim(getValue());
            } else {
                try {
                    animal.crossFail();
                }catch (AnimalOutFromDistanceException e){
                    throw new WaterFailException(getValue(),animal.toString());
                }

            }
        }catch (AnimalOutFromDistanceException e){
            throw new WaterFailException(getValue(),animal.toString());
        }
    }

    @Override
    public String toString() {
        return "вода";
    }
}
