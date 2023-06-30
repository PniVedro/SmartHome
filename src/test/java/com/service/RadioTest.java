package com.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RadioTest {
    @ParameterizedTest
    @CsvSource({"100, 100",
            "0, 101",
            "70, 70",
            "0, 0",
            "0, -1"
    })
    public void setVolume(int expected, int newCurrentVolume) {
        Radio radio = new Radio();
        radio.setVolume(newCurrentVolume);
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({"1, 0",
            "2, 1",
            "100, 99",
            "100, 100",
    })
    public void increaseVolumeTest(int expected, int newCurrentVolume) {
        Radio radio = new Radio();
        radio.setVolume(newCurrentVolume);
        radio.increaseVolume();
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({"0, 0",
            "0, 1",
            "99, 100",
            "98, 99",
    })
    public void decreaseVolumeTest(int expected, int newCurrentVolume) {
        Radio radio = new Radio();
        radio.setVolume(newCurrentVolume);
        radio.decreaseVolume();
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({"0, 0",
            "1, 1",
            "9, 9",
            "0, 10",
            "0, -1"
    })
    public void setRadioStationNumberTest(int expected, int newRadioStationNumber) {
        Radio radio = new Radio();
        radio.setRadioStationNumber(newRadioStationNumber);
        int actual = radio.getRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({"1, 0",
            "2, 1",
            "0, 9",
            "9, 8"
    })
    public void nextTest(int expected, int newRadioStationNumber) {
        Radio radio = new Radio();
        radio.setRadioStationNumber(newRadioStationNumber);
        radio.next();
        int actual = radio.getRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({"9, 0",
            "0, 1",
            "8, 9",
            "7, 8",
    })
    public void prevTest(int expected, int newRadioStationNumber) {
        Radio radio = new Radio();
        radio.setRadioStationNumber(newRadioStationNumber);
        radio.prev();
        int actual = radio.getRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }


}

