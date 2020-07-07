package ru.netology.domain;

import static org.junit.Assert.*;

public class Test {
    @org.junit.jupiter.api.Test
    void increaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner(30);
        conditioner.increaseCurrentTemperature();
        int expected = 30;
        int actual = conditioner.getCurrentTemperature();
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void increaseCurrentTemperature2() {
        Conditioner conditioner = new Conditioner(26);
        conditioner.increaseCurrentTemperature();
        int expected = 27;
        int actual = conditioner.getCurrentTemperature();
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void decreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner(17);
        conditioner.decreaseCurrentTemperature();
        int expected = 17;
        int actual = conditioner.getCurrentTemperature();
        assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void decreaseCurrentTemperature2() {
        Conditioner conditioner = new Conditioner(20);
        conditioner.decreaseCurrentTemperature();
        int expected = 19;
        int actual = conditioner.getCurrentTemperature();
        assertEquals(expected, actual);
    }
}