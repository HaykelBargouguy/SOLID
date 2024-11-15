package com.directi.training.isp.exercise;

public class TimedDoor implements Door, TimedDoorInterface {
    private boolean _locked;
    private boolean _opened;

    public TimedDoor(Timer timer) {
        timer.register(this);
    }

    @Override
    public void lock() {
        _locked = true;
    }

    @Override
    public void unlock() {
        _locked = false;
    }

    @Override
    public void open() {
        if (!_locked) {
            _opened = true;
        }
    }

    @Override
    public void close() {
        _opened = false;
    }

    @Override
    public void timeOutCallback() {
        _locked = true;
    }
}
