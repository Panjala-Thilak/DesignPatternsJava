package Structural.DecoratorDesignPattern;

public class ChickenDecorator extends PizzaDecorator{
    public ChickenDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + "- Chicken";
    }

    @Override
    public int getCost() {
        return decoratedPizza.getCost() + 50;
    }
}
