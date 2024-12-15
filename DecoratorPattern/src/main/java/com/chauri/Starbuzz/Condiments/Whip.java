package com.chauri.Starbuzz.Condiments;

import com.chauri.Starbuzz.Beverage;
import com.chauri.Starbuzz.CondimentDecorator;

public class Whip extends CondimentDecorator {
    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    public double cost() {
        return .10 + beverage.cost();
    }
}
