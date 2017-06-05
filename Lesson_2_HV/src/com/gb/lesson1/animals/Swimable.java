package com.gb.lesson1.animals;

import com.gb.lesson1.Exseptions.AnimalOutFromDistanceException;

/**
 * Created by Tim on 13.07.2016.
 */
public interface Swimable {
    void swim(int dist) throws AnimalOutFromDistanceException;
}
