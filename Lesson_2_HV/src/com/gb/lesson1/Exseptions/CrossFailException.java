package com.gb.lesson1.Exseptions;

/**
 * Created by Глеб on 05.06.2017.
 */
public class CrossFailException extends FailException {
    public static final String ObstacleName = "Дистанция";

    public CrossFailException(int value, String animalName) {
        super(ObstacleName, value, animalName);
    }

}
