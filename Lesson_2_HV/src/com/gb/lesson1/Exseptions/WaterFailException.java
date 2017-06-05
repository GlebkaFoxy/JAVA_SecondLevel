package com.gb.lesson1.Exseptions;

/**
 * Created by Глеб on 05.06.2017.
 */
public class WaterFailException extends FailException {
    public static final String ObstacleName = "Озеро";

    public WaterFailException(int value, String animalName) {
        super(ObstacleName, value, animalName);
    }

}
