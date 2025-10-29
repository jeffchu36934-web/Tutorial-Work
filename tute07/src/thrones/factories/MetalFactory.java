package thrones.factories;

import thrones.characters.Dragon;
import thrones.characters.King;
import thrones.characters.Knight;
import thrones.characters.Queen;
import thrones.characters.metal.MetalDragon;
import thrones.characters.metal.MetalKing;
import thrones.characters.metal.MetalKnight;
import thrones.characters.metal.MetalQueen;

public class MetalFactory extends AbstractFactory {

    @Override
    public King createKing() {
        // TODO Auto-generated method stub
        return new MetalKing(getInt(5), 0);
    }

    @Override
    public Queen createQueen() {
        // TODO Auto-generated method stub
        return new MetalQueen(getInt(5), 0);
    }

    @Override
    public Knight createKnight() {
        // TODO Auto-generated method stub
        return new MetalKnight(getInt(5), 0);
    }

    @Override
    public Dragon createDragon() {
        // TODO Auto-generated method stub
        return new MetalDragon(getInt(5), 0);
    }

}
