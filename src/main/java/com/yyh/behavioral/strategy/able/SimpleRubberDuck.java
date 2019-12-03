package main.java.com.yyh.behavioral.strategy.able;

public class SimpleRubberDuck extends SimpleDuck implements QuackAble {
    @Override
    void display() {
        System.out.println("고무 오리");
    }

    @Override
    public void quack() {

    }
}
