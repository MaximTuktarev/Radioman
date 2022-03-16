package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    Radio smart_radio = new Radio();

    @Test
    public void increaseVolume() {

        smart_radio.setCurrentVolume(150);
        smart_radio.increaseVolume();
        assertEquals(100, smart_radio.getCurrentVolume());


        smart_radio.setCurrentVolume(50);
        smart_radio.increaseVolume();

        assertEquals(51, smart_radio.getCurrentVolume());


        smart_radio.setCurrentVolume(99);
        smart_radio.increaseVolume();
        assertEquals(100, smart_radio.getCurrentVolume());
    }

    @Test
    public void decreaseVolumeCorrect() {

        smart_radio.setCurrentVolume(30);
        smart_radio.decreaseVolume();


        assertEquals(29, smart_radio.getCurrentVolume());

        smart_radio.setCurrentVolume(0);
        smart_radio.decreaseVolume();


        assertEquals(0, smart_radio.getCurrentVolume());

        smart_radio.setCurrentVolume(1);
        smart_radio.decreaseVolume();


        assertEquals(0, smart_radio.getCurrentVolume());
    }


    @Test
    public void nextStation() {

        smart_radio.setCurrentStation(5);
        smart_radio.nextStation();


        assertEquals(6, smart_radio.getCurrentRadioStation());

        smart_radio.setCurrentStation(9);
        smart_radio.nextStation();


        assertEquals(0, smart_radio.getCurrentRadioStation());

        smart_radio.setCurrentStation(8);
        smart_radio.nextStation();


        assertEquals(9, smart_radio.getCurrentRadioStation());
    }

    @Test
    public void prevStation() {

        smart_radio.setCurrentStation(5);
        smart_radio.prevStation();


        assertEquals(4, smart_radio.getCurrentRadioStation());

        smart_radio.setCurrentStation(0);
        smart_radio.prevStation();


        assertEquals(9, smart_radio.getCurrentRadioStation());

        smart_radio.setCurrentStation(1);
        smart_radio.prevStation();


        assertEquals(0, smart_radio.getCurrentRadioStation());
    }

    @Test
    public void currentStation() {

        smart_radio.setCurrentStation(0);

        assertEquals(0, smart_radio.getCurrentRadioStation());

        smart_radio.setCurrentStation(9);

        assertEquals(9, smart_radio.getCurrentRadioStation());

        smart_radio.setCurrentStation(-5);

        assertEquals(0, smart_radio.getCurrentRadioStation());

        smart_radio.setCurrentStation(15);

        assertEquals(9, smart_radio.getCurrentRadioStation());

    }

    @Test
    public void currentVolume() {

        smart_radio.setCurrentVolume(0);
        assertEquals(0, smart_radio.getCurrentVolume());


        smart_radio.setCurrentVolume(100);
        assertEquals(100, smart_radio.getCurrentVolume());


        smart_radio.setCurrentVolume(150);
        assertEquals(100, smart_radio.getCurrentVolume());


        smart_radio.setCurrentVolume(-15);
        assertEquals(0, smart_radio.getCurrentVolume());
    }

}