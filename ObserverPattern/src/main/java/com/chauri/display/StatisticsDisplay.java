package com.chauri.display;

import com.chauri.interfaces.DisplayElement;
import com.chauri.interfaces.Observer;
import com.chauri.interfaces.Subject;

public class StatisticsDisplay implements Observer, DisplayElement {
    private float temperature, humidity, pressure;
    private Subject weatherData;
    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum = 0.0f;
    private int numReadings;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        tempSum += temperature;
        numReadings++;
        maxTemp = Math.max(maxTemp, temperature);
        minTemp = Math.min(minTemp, temperature);
        display();
    }

    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings) + "/" + maxTemp + "/" + minTemp);
    }
}
