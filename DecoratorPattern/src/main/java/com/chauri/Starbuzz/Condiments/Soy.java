package com.chauri.Starbuzz.Condiments;

import com.chauri.Starbuzz.Beverage;
import com.chauri.Starbuzz.CondimentDecorator;

public class Soy extends CondimentDecorator {
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    public double cost() {
        return .15 + beverage.cost();
    }
}
