package ru.netology.domain;

public class Radio {
    public int currentVolume;
    public int currentRadioStation;


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume() {

        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
        {
            if (currentVolume == 10)
                this.currentVolume = 10;
        }
    }

    public void decreaseVolume() {

        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
        {
            if (currentVolume == 0)
                this.currentVolume = 0;
        }
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void nextStation() {

        if (currentRadioStation < 9) {
            currentRadioStation = currentRadioStation + 1;
        }
        {
            if (currentRadioStation == 9)
                this.currentRadioStation = 0;
        }
    }

    public void prevStation() {

        if (currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;
        }
        {
            if (currentRadioStation == 0)
                this.currentRadioStation = 9;
        }
    }

    public void setCurrentStation(int newCurrentStation) {

        if (newCurrentStation < 0) {
            return;
        }
        {
            if (newCurrentStation > 9) {
                return;
            }
            currentRadioStation = newCurrentStation;
        }
    }
}

