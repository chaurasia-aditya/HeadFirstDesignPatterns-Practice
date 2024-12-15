package com.chauri.duck;

import com.chauri.behaviours.FlyWithWings;
import com.chauri.behaviours.Quack;

public class MallardDuck extends Duck{

    public MallardDuck() {
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a Mallard Duck");
    }
}
