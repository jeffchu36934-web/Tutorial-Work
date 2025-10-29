package thrones.factories;

import thrones.characters.Dragon;
import thrones.characters.King;
import thrones.characters.Knight;
import thrones.characters.Queen;
import thrones.characters.wood.WoodDragon;
import thrones.characters.wood.WoodKing;
import thrones.characters.wood.WoodKnight;
import thrones.characters.wood.WoodQueen;

public class WoodenFactory extends AbstractFactory {
    private int n;

    public WoodenFactory(int n) {
        this.n = n;
    }

    @Override
    public Dragon createDragon() {
        // TODO Auto-generated method stub
        return new WoodDragon(getIntDivisibleBy(n), getIntDivisibleBy(n));
    }

    @Override
    public King createKing() {
        // TODO Auto-generated method stub
        return new WoodKing(getIntDivisibleBy(n), getIntDivisibleBy(n));
    }

    @Override
    public Knight createKnight() {
        // TODO Auto-generated method stub
        return new WoodKnight(getIntDivisibleBy(n), getIntDivisibleBy(n));
    }

    @Override
    public Queen createQueen() {
        // TODO Auto-generated method stub
        return new WoodQueen(getIntDivisibleBy(n), getIntDivisibleBy(n));
    }

    
}
