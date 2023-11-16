public class Clock {
    private int hours;
    private int minutes;
    private int seconds;

    public Clock() {

    }

    public Clock(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public Clock(int secondsSinceMidnight) {
        setClock(secondsSinceMidnight);
    }

    void setClock(int secondsSinceMidnight) {
        hours = secondsSinceMidnight / (60 * 60);
        secondsSinceMidnight %= (60 * 60);
        minutes = secondsSinceMidnight / 60;
        seconds = secondsSinceMidnight % 60;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    void tick() {
        seconds++;
        if (seconds == 60) {
            minutes++;
            seconds = 0;
        }
        if (minutes == 60) {
            hours++;
            minutes = 0;
        }
        if (hours == 24)
            hours = 0;
    }

    void tickDown() {
        seconds--;
        if (seconds == -1) {
            minutes--;
            seconds = 59;
        }
        if (minutes == -1) {
            hours--;
            minutes = 59;
        }
        if (hours == -1)
            hours = 23;
    }

    void addClock(Clock clock) {
        int sec1 = (hours * 60 * 60) + (minutes * 60) + seconds;
        int sec2 = (clock.getHours() * 60 * 60) + (clock.getMinutes() * 60) + clock.getSeconds();
        int secondsSinceMidnight = (sec1 + sec2) % (60 * 60 * 24);
        setClock(secondsSinceMidnight);
    }

    void subtractClock(Clock clock) {
        int sec1 = (hours * 60 * 60) + (minutes * 60) + seconds;
        int sec2 = (clock.getHours() * 60 * 60) + (clock.getMinutes() * 60) + clock.getSeconds();
        int secondsSinceMidnight;
        if (sec1 > sec2)
            secondsSinceMidnight = (sec1 - sec2);
        else
            secondsSinceMidnight = (sec2 - sec1);
        setClock(secondsSinceMidnight);
    }

    public String toString() {
        return "(" + (hours < 10 ? "0" : "") + hours + ":" +
                (minutes < 10 ? "0" : "") + minutes + ":" +
                (seconds < 10 ? "0" : "") + seconds + ")";
    }
}
