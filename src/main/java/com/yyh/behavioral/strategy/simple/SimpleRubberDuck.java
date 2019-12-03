package main.java.com.yyh.behavioral.strategy.simple;

public class SimpleRubberDuck extends SimpleDuck {
    @Override
    void fly() {
    }

    @Override
    void quack() {
        System.out.println("삑삑");
    }

    @Override
    void display() {
        System.out.println("고무 오리");
    }
}
