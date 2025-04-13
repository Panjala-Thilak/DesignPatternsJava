package Structural.DecoratorDesignPattern;

/**
 * Decorator Design Pattern Demo.
 * Class Explosion can be avoided.
 */
public class DecoratorDemo {
    public static void main(String[] args) {
        Pizza pizza = new PlainPizza();

        pizza = new CheeseDecorator(pizza);

        System.out.println("Description: " + pizza.getDescription());
        System.out.println("Cost: " + pizza.getCost());

        Pizza pizza1 = new ChickenDecorator(new PlainPizza());

        System.out.println("Description: " + pizza1.getDescription());
        System.out.println("Cost: " + pizza1.getCost());

        Pizza pizza2 = new PlainPizza();
        pizza2 = new ChickenDecorator(new CheeseDecorator(pizza2));

        System.out.println("Description: " + pizza2.getDescription());
        System.out.println("Cost: " + pizza2.getCost());
    }
}
