package com.service;

public class Radio {
    private int radioStationNumber;
    private int currentVolume;
    private int maxRadioStation;


    {
        maxRadioStation = 10;
    }

    public Radio() {

    }

    public Radio(int maxRadioStation) {
        this.maxRadioStation = maxRadioStation;

    }

    public int getVolume() {
        return currentVolume;
    }

    public void setVolume(int newCurrentVolume) {
        if (newCurrentVolume >= 0 && newCurrentVolume <= 100) {
            currentVolume = newCurrentVolume;
        }

    }

    public void increaseVolume() {
        setVolume(currentVolume + 1);
    }

    public void decreaseVolume() {
        setVolume(currentVolume - 1);
    }

    public int getRadioStationNumber() {
        return radioStationNumber;
    }

    public void setRadioStationNumber(int newRadioStationNumber) {
        if (newRadioStationNumber >= 0 && newRadioStationNumber < maxRadioStation) {
            radioStationNumber = newRadioStationNumber;
        }
    }

    public void next() {
        setRadioStationNumber((radioStationNumber + 1) % maxRadioStation);
    }

    public void prev() {
        setRadioStationNumber(((radioStationNumber - 1) + maxRadioStation) % maxRadioStation);
    }
}
