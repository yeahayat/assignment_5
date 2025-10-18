package org.yeah.tracker;

public class HeartRateDecorator extends TrackerDecorator {
    public HeartRateDecorator(Tracker tracker) {
        super(tracker);
    }

    @Override
    public void start() {
        super.start();
        System.out.println("Heart rate sensor started");
    }

    @Override
    public void stop() {
        System.out.println("Heart rate sensor stopped");
        super.stop();
    }
}
