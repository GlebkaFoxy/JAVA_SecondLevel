package com.gb.lesson1.obstacles;

import com.gb.lesson1.Exseptions.AnimalOutFromDistanceException;
import com.gb.lesson1.Exseptions.CrossFailException;
import com.gb.lesson1.Exseptions.WallFailException;
import com.gb.lesson1.Exseptions.WaterFailException;
import com.gb.lesson1.animals.Animal;

/**
 * Created by Tim on 12.07.2016.
 */
public abstract class Obstacle {
    private int value;

    public abstract void doIt(Animal animal) throws  CrossFailException, WallFailException, WaterFailException;

    public Obstacle(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
