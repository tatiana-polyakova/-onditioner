package ru.netology.domain;

public class Conditioner {
    private String name = "Toshiba";
    private int maxTemperature = 30;
    private int minTemperature = 17;
    private int currentTemperature = 26;
    private boolean on;

    public Conditioner(int currentTemperature) {
        if (currentTemperature > 30)
            return;
        if (currentTemperature < 17)
            return;

        this.currentTemperature = currentTemperature;
    }

    public int getCurrentTemperature() {
        return currentTemperature;
    }

    public void increaseCurrentTemperature() {
        if (currentTemperature >= maxTemperature)
            return;

        currentTemperature = currentTemperature + 1;
    }

    public void decreaseCurrentTemperature() {
        if (currentTemperature <= minTemperature)
            return;

        currentTemperature = currentTemperature - 1;
    }
}