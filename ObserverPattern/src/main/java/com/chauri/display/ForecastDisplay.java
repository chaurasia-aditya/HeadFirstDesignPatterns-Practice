package com.chauri.display;

import com.chauri.interfaces.DisplayElement;
import com.chauri.interfaces.Observer;
import com.chauri.interfaces.Subject;

public class ForecastDisplay implements Observer, DisplayElement {
    private float currentPressure = 29.92f;
    private float lastPressure;
    private Subject weatherData;

    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure) {
        this.lastPressure = this.currentPressure;
        this.currentPressure = pressure;
        display();
    }

    public void display() {
        System.out.print("Forecast: ");
        if(currentPressure > lastPressure){
            System.out.println("Improving weather on the way!");
        } else if(currentPressure == lastPressure){
            System.out.println("More of the same");
        } else if(currentPressure < lastPressure){
            System.out.println("Watch out for cooler, rainy weather");
        }
    }
}
