package org.yeah;

import org.yeah.facade.FitnessFacade;

public class Main {
    public static void main(String[] args) {
        FitnessFacade app = new FitnessFacade();
        app.startWorkout();
        System.out.println("...user running...");
        app.stopWorkout();
    }
}