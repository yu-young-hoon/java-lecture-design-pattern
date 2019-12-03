package main.java.com.yyh.creational;

public class SimpleFactory {
    class Pizza {

    }
    class CheesePizza extends Pizza {

    }
    class PepperoniPizza extends Pizza {

    }
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if ("페페".equals(type)) {
            pizza = new PepperoniPizza();
        } else if ("치즈".equals(type)) {
            pizza = new CheesePizza();
        }
        return pizza;
    }
}
