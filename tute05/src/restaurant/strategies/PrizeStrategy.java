package restaurant.strategies;

import java.util.List;

import restaurant.Meal;

public class PrizeStrategy implements ChargingStrategy {
    private int num = 0;

    @Override
    public double cost(List<Meal> order, boolean payeeIsMember) {
        num++;

        if (num % 100 == 0) {
            return 0;
        } else {
            return order.stream().mapToDouble(meal -> meal.getCost()).sum();
        }
    }

    @Override
    public double modifierCost() {
        // TODO Auto-generated method stub
        return 1;
    }


}
