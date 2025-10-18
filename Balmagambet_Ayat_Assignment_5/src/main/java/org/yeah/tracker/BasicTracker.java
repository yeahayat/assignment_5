package org.yeah.tracker;

public class BasicTracker implements Tracker {
    @Override
    public void start() {
        System.out.println("Tracking started");
    }

    @Override
    public void stop() {
        System.out.println("Tracking stopped");
    }
}
