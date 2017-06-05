package com.gb.lesson1.Exseptions;

/**
 * Created by Глеб on 05.06.2017.
 */
public class FailException extends AppException {
    String obstacleName;
    String animalName;
    int value;


    FailException(String obstacleName, int value, String animalName ){
        this.animalName=animalName;
        this.value=value;
        this.obstacleName=obstacleName;

    }

   public String getFailInfo(){
        return animalName + " выбыл на препятствии \"" + obstacleName + "\" величиной = " + value; }
}
