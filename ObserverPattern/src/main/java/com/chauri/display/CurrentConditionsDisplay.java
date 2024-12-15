package com.chauri.display;

import com.chauri.interfaces.DisplayElement;
import com.chauri.interfaces.Observer;
import com.chauri.interfaces.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature, humidity, pressure;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity and " + pressure + " pressure");
    }
}
