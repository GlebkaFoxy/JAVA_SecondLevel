package com.gb.lesson1.obstacles;

import com.gb.lesson1.Exseptions.AnimalOutFromDistanceException;
import com.gb.lesson1.Exseptions.CrossFailException;
import com.gb.lesson1.Exseptions.WallFailException;
import com.gb.lesson1.animals.Animal;
import com.gb.lesson1.animals.Jumpable;

/**
 * Created by Tim on 12.07.2016.
 */
public class Wall extends Obstacle {

    public Wall(int value) {
        super(value);
    }

    @Override
    public void doIt(Animal animal) throws WallFailException {

       try {
           if (animal instanceof Jumpable) {
               Jumpable jumpableAnimal = (Jumpable) animal;
               jumpableAnimal.jump(getValue());
           } else {

               try {
                   animal.crossFail();
               }catch (AnimalOutFromDistanceException e){
                   throw new WallFailException(getValue(),animal.toString());
               }
           }
       }catch (AnimalOutFromDistanceException e){
            throw new WallFailException(getValue(), animal.toString());
       }
    }

    @Override
    public String toString() {
        return "стена";
    }
}
