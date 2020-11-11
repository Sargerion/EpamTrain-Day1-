package edu.epam.task.six.service;

public class ClockService {

    public int getMinutes(int seconds) {
        return seconds / 60;
    }

    public int getHours(int seconds) {
        return seconds / 3600;
    }
}
