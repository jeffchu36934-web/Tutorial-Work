package restaurant.strategies;

import java.util.List;

import restaurant.Meal;

public interface ChargingStrategy {
    public double cost(List<Meal> order, boolean payeeIsMember);
    public double modifierCost();
}
