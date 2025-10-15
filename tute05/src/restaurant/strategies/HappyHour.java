package restaurant.strategies;

import java.util.List;

import restaurant.Meal;

public class HappyHour implements ChargingStrategy{
    private static final double MEMBER = 0.6;
    private static final double NONMEMBER = 0.7;


    @Override
    public double cost(List<Meal> order, boolean payeeIsMember) {
        // TODO Auto-generated method stub
        if (!payeeIsMember) {
            return order.stream().mapToDouble(meal -> meal.getCost() * NONMEMBER).sum();
        } else {
            return order.stream().mapToDouble(meal -> meal.getCost() * MEMBER).sum();
        }
    }

    @Override
    public double modifierCost() {
        return 0.7;
    }

}
