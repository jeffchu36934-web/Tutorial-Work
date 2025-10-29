package thrones.decorators;

import java.util.List;

import thrones.Character;
import thrones.MoveResult;

public class CharacterDecorator implements Character {
    private Character character;

    public CharacterDecorator(Character character) {
        this.character = character;
    }

    @Override
    public int getHealthPoints() {
        return character.getHealthPoints();  
    }

    @Override
    public int getX() {
        // TODO Auto-generated method stub
        return character.getX();
    }

    @Override
    public int getY() {
        // TODO Auto-generated method stub
        return character.getY();
    }

    @Override
    public void setX(int x) {
        // TODO Auto-generated method stub
        character.setX(x);
    }

    @Override
    public void setY(int y) {
        // TODO Auto-generated method stub
        character.setY(y);
    }

    @Override
    public void damage(int points) {
        // TODO Auto-generated method stub
        character.damage(points);
    }

    @Override
    public void attack(Character victim) {
        // TODO Auto-generated method stub
        character.attack(victim);
    }

    @Override
    public boolean canMove(int dx, int dy) {
        // TODO Auto-generated method stub
        return character.canMove(dx, dy);
    }

    @Override
    public MoveResult makeMove(int x, int y, List<Character> characters) {
        // TODO Auto-generated method stub
        return character.makeMove(x, y, characters);
    }



}
