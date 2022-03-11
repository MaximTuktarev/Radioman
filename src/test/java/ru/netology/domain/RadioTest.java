package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {


    @Test
    public void increaseVolumeCorrect() {

        Radio rad = new Radio();

        rad.currentVolume = 5;
        rad.increaseVolume();


        int expected = 6;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume_1() {

        Radio rad = new Radio();

        rad.currentVolume = 10;
        rad.increaseVolume();


        int expected = 10;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume_1() {

        Radio rad = new Radio();

        rad.currentVolume = 0;
        rad.decreaseVolume();


        int expected = 0;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeCorrect() {

        Radio rad = new Radio();

        rad.currentVolume = 5;
        rad.decreaseVolume();


        int expected = 4;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void nextStation_1() {

        Radio rad = new Radio();

        rad.currentRadioStation = 9;
        rad.nextStation();


        int expected = 0;
        int actual = rad.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void nextStationCorrect() {

        Radio rad = new Radio();

        rad.currentRadioStation = 8;
        rad.nextStation();


        int expected = 9;
        int actual = rad.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void prevStation_1() {

        Radio rad = new Radio();

        rad.currentRadioStation = 0;
        rad.prevStation();


        int expected = 9;
        int actual = rad.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void prevStationCorrect() {

        Radio rad = new Radio();

        rad.currentRadioStation = 5;
        rad.prevStation();


        int expected = 4;
        int actual = rad.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void currentStation_1() {

        Radio rad = new Radio();

        rad.setCurrentStation(10);


        int expected = 0;
        int actual = rad.getCurrentRadioStation();
        assertEquals(expected, actual);

    }

    @Test
    public void currentStationDenied() {

        Radio rad = new Radio();

        rad.setCurrentStation(-2);


        int expected = 0;
        int actual = rad.getCurrentRadioStation();
        assertEquals(expected, actual);

    }

    @Test
    public void currentStationCorrect() {

        Radio rad = new Radio();

        rad.setCurrentStation(4);


        int expected = 4;
        int actual = rad.getCurrentRadioStation();
        assertEquals(expected, actual);

    }
}