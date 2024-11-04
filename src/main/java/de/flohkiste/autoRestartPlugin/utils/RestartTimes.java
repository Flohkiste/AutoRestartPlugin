package de.flohkiste.autoRestartPlugin.utils;

public class RestartTimes {
    private static RestartTimes instance;
    private int timerDays;
    private int timerHours;
    private int timerMinutes;

    private int curDay;
    private int curHour;
    private int curMinute;

    private RestartTimes(){

    }

    public static RestartTimes getInstance(){
        if (instance == null) {
            instance = new RestartTimes();
        }

        return instance;
    }

    public void setTimer(int days, int hours, int minutes) {
        this.timerDays = days;
        this.timerHours = hours;
        this.timerMinutes = minutes;
    }

    public void minutePassed() {
        if (!(++ this.curMinute >= 60)) {
            return;
        }

        if(!(++ this.curHour >= 24)) {
            return;
        }

        curDay ++;
    }

    public void setClock(int hour, int minute) {
        this.curHour = hour;
        this.curMinute = minute;
    }

    public int getTimerDays() {
        return timerDays;
    }

    public void setTimerDays(int timerDays) {
        this.timerDays = timerDays;
    }

    public int getTimerHours() {
        return timerHours;
    }

    public void setTimerHours(int timerHours) {
        this.timerHours = timerHours;
    }

    public int getTimerMinutes() {
        return timerMinutes;
    }

    public void setTimerMinutes(int timerMinutes) {
        this.timerMinutes = timerMinutes;
    }

    public int getCurDay() {
        return curDay;
    }

    public void setCurDay(int curDay) {
        this.curDay = curDay;
    }

    public int getCurHour() {
        return curHour;
    }

    public void setCurHour(int curHour) {
        this.curHour = curHour;
    }

    public int getCurMinute() {
        return curMinute;
    }

    public void setCurMinute(int curMinute) {
        this.curMinute = curMinute;
    }
}
