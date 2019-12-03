package main.java.com.yyh.behavioral.strategy.behavior;

public class Duck {
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    void disply() {}

    void performQuack() {
        quackBehavior.quack();
    }

    void performFly() {
        flyBehavior.fly();
    }

    void setFlyBehavior(FlyBehavior flyBehavior) {
        flyBehavior = flyBehavior;
    }

    void setQuackBehavior(QuackBehavior quackBehavior) {
        quackBehavior = quackBehavior;
    }
}
