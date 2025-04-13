package Structural.DecoratorDesignPattern;

public class PizzaDecorator extends PlainPizza {
    protected Pizza decoratedPizza;

    public PizzaDecorator(Pizza pizza) {
        this.decoratedPizza = pizza;
    }
}
