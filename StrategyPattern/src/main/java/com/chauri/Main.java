package com.chauri;

import com.chauri.behaviours.FlyRocketPowered;
import com.chauri.duck.Duck;
import com.chauri.duck.MallardDuck;
import com.chauri.duck.ModelDuck;

public class Main {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.performFly();
        mallardDuck.performQuack();
        mallardDuck.display();

        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehaviour(new FlyRocketPowered());
        modelDuck.performFly();
    }
}