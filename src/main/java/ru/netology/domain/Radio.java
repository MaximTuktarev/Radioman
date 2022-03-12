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
        } else {
            this.currentVolume = 10;
        }
    }

    public void decreaseVolume() {

        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else {
            this.currentVolume = 0;
        }
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void nextStation() {

        if (currentRadioStation < 9) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            this.currentRadioStation = 0;
        }
    }

    public void prevStation() {

        if (currentRadioStation > 0) {
            this.currentRadioStation = currentRadioStation - 1;
        } else {
            this.currentRadioStation = 9;
        }
    }

    public void setCurrentStation(int currentStation) {

        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9)
            return;

        this.currentRadioStation = currentStation;
    }
}


