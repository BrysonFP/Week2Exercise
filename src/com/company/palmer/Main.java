package com.company.palmer;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        String weekDays[] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int highTemperatures[] = {45, 29, 10, 22, 41, 28, 33};
        int precipitationProbability[] = {95, 60, 25, 5, 0, 75, 90};

        for(int i = 0; i < 7; i++) {

            if (highTemperatures[i] <= 32 && precipitationProbability[i] > 50) {

                System.out.println("It will likely snow on " + weekDays[i] + ".");

            }
        }
    }
}
