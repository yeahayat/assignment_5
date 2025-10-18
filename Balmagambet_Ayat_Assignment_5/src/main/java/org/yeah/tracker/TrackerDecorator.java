package org.yeah.tracker;

public abstract class TrackerDecorator implements Tracker {
    protected final Tracker tracker;

    public TrackerDecorator(Tracker tracker) {
        this.tracker = tracker;
    }

    @Override
    public void start() {
        tracker.start();
    }

    @Override
    public void stop() {
        tracker.stop();
    }
}
