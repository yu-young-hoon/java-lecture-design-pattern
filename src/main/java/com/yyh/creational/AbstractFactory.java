package main.java.com.yyh.creational;

public class AbstractFactory {
    class Dough {

    }
    class  Cheese {

    }

    class CrustDough extends Dough {

    }

    class NyCheese extends Cheese {

    }

    class Pepperoni {

    }

    class NyPepperoni extends Pepperoni {

    }

    interface PizzaIngredientFactory {
        Dough createCheese();
        Cheese createDough();
        Pepperoni createPepperoni();
    }

    class NyPizzaIngredientFactory implements PizzaIngredientFactory {
        @Override
        public Dough createCheese() {
            return new CrustDough();
        }
        @Override
        public Cheese createDough() {
            return new NyCheese();
        }
        @Override
        public Pepperoni createPepperoni() {
            return new Pepperoni();
        }
    }
    abstract class Pizza {
        PizzaIngredientFactory pizzaIngredientFactory;
        abstract void prepare();
        void bake() {}
    }
    class NYCheesePizza extends Pizza {
        NYCheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
            pizzaIngredientFactory = pizzaIngredientFactory;
        }
        @Override
        void prepare() {
            pizzaIngredientFactory.createCheese();
            pizzaIngredientFactory.createDough();
        }
    }
    class NYPepperoniPizza extends Pizza {
        NYPepperoniPizza(PizzaIngredientFactory pizzaIngredientFactory) {
            pizzaIngredientFactory = pizzaIngredientFactory;
        }
        @Override
        void prepare() {
            pizzaIngredientFactory.createPepperoni();
            pizzaIngredientFactory.createDough();
        }
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
                pizza = new NYPepperoniPizza(new NyPizzaIngredientFactory());
            } else if ("치즈".equals(type)) {
                pizza = new NYCheesePizza(new NyPizzaIngredientFactory());
            }
            return pizza;
        }
    }
}