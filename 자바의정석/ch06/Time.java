package 자바의정석.ch06;

public class Time {
    private int hour;
    private int minute;
    private float second;

    public void setHour(int h) {
        if (h < 0 || h > 23) return;
        hour = h;
    }

    public void setMinute(int m) {
        if (m < 0 || m > 59) return;
        minute = m;
    }

    public void setSecond(float s) {
        if (s < 0.0f || s > 59.99f) return;
        second = s;
    }
}
