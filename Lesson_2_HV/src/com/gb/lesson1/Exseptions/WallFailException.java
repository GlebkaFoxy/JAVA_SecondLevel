package com.gb.lesson1.Exseptions;

/**
 * Created by Глеб on 05.06.2017.
 */
public class WallFailException extends FailException {
public static final String ObstacleName = "Стена";

    public WallFailException(int value, String animalName) {
        super(ObstacleName, value, animalName);
    }
}

