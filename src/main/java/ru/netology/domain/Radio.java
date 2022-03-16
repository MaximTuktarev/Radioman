package ru.netology.domain;

public class Radio {
    private String name = "Smart-Radio";
    //private int firstStation = 0;
    //private int lastStation = 9;
    private int quantityOfStations = 10;
    private int currentRadioStation;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume;


    public Radio() {
    }


    // public Radio(String name, int quantityOfStations, int currentRadioStation, int minVolume, int maxVolume, int currentVolume) {
    // this.name = name;
    // this.quantityOfStations = quantityOfStations;
    //this.currentRadioStation = currentRadioStation;
    // this.minVolume = minVolume;
    //this.maxVolume = maxVolume;
    // this.currentVolume = currentVolume;
    // }


    public int getCurrentRadioStation() {
        return currentRadioStation;
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getLastStation() {
        return quantityOfStations - 1;
    }


    public void increaseVolume() {

        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        } else {
            this.currentVolume = 100;
        }
    }

    public void decreaseVolume() {

        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        } else {
            this.currentVolume = 0;
        }
    }

    public void nextStation() {

        if (currentRadioStation < getLastStation()) {
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
            this.currentRadioStation = 0;
            return;
        }
        if (currentStation > getLastStation()) {
            this.currentRadioStation = getLastStation();
            return;
        } else {
            this.currentRadioStation = currentStation;
        }
    }


    public void setCurrentVolume(int currentVolume) {

        if (currentVolume < minVolume) {
            this.currentVolume = minVolume;
            return;
        }
        if (currentVolume > maxVolume) {
            this.currentVolume = maxVolume;
            return;
        } else {

            this.currentVolume = currentVolume;
        }
    }
}








