package main.java.com.yyh.behavioral.strategy.behavior;

public class RubberDuck extends Duck {
    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squack();
    }
}
