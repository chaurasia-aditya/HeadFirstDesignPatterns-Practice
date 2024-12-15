package com.chauri.duck;

import com.chauri.behaviours.FlyNoWay;
import com.chauri.behaviours.Quack;
import com.chauri.behaviours.Squeak;

public class ModelDuck extends Duck{

    public ModelDuck() {
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Quack();
    }

    @Override
    public void display() {
        System.out.println("i;m a model duck");
    }
}
