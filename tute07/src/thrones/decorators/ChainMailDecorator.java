package thrones.decorators;

import thrones.Character;


// The error from earlier was due to shift-alt-o not importing character properly
public class ChainMailDecorator extends CharacterDecorator {
    public ChainMailDecorator(Character character) {
        super(character);
    }

    @Override
    public void damage(int points) {
        super.damage(points / 2);
    }
}
