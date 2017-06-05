package com.gb.lesson1.animals;

import com.gb.lesson1.Exseptions.AnimalOutFromDistanceException;

/**
 * Created by Tim on 12.07.2016.
 */
public interface Jumpable {
    void jump(int height) throws AnimalOutFromDistanceException;
}
