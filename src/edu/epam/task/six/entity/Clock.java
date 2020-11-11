package edu.epam.task.six.entity;

public class Clock {
    private int seconds;
    private int minutes;
    private int hours;

    public Clock(int seconds) {
        this.seconds = seconds;
    }

    public Clock(int seconds, int minutes, int hours) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }

    public int getSeconds() {
        return seconds;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getHours() {
        return hours;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Clock clock = (Clock) o;
        return seconds == clock.seconds &&
                minutes == clock.minutes &&
                hours == clock.hours;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Clock{");
        sb.append("seconds=").append(seconds).append(", minutes=").append(minutes).append(", hours=").append(hours).append("}");
        return sb.toString();
    }
}
