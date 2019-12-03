package main.java.com.yyh.behavioral.strategy.behavior;

public class WoodDuck extends Duck {
    public WoodDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }
}
