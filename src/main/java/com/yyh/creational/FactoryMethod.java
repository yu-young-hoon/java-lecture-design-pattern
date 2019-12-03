package main.java.com.yyh.creational;

public class FactoryMethod {
    class Pizza {
        void prepare() {}
        void bake() {}
    }
    class NYCheesePizza extends Pizza {

    }
    class NYPepperoniPizza extends Pizza {

    }
    abstract class PizzaStore {

        public Pizza orderPizza(String type) {
            Pizza pizza = null;
            pizza = createPizza(type);
            pizza.prepare();
            pizza.bake();
            return pizza;
        }
        abstract Pizza createPizza(String type);
    }

    class NYPizzaStore extends PizzaStore {

        @Override
        Pizza createPizza(String type) {
            Pizza pizza = null;
            if ("페페".equals(type)) {
                pizza = new NYPepperoniPizza();
            } else if ("치즈".equals(type)) {
                pizza = new NYCheesePizza();
            }
            return pizza;
        }
    }
}
