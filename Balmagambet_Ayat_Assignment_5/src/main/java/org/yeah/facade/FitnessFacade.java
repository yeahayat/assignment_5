package org.yeah.facade;

import org.yeah.tracker.*;

public class FitnessFacade {
    private Tracker tracker;

    public FitnessFacade() {
        this.tracker = new HeartRateDecorator(new BasicTracker());
    }

    public void startWorkout() {
        tracker.start();
    }

    public void stopWorkout() {
        tracker.stop();
    }
}
