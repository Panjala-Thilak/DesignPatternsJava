package Structural.DecoratorDesignPattern;

public class CheeseDecorator extends PizzaDecorator{
    CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + " with Cheese";
    }

    @Override
    public int getCost() {
        return decoratedPizza.getCost() + 10;
    }
}
