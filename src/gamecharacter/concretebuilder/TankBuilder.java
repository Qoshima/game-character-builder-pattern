package gamecharacter.concretebuilder;
import gamecharacter.CharacterBuilder;
import gamecharacter.GameCharacter;

public class TankBuilder extends CharacterBuilder {
    public TankBuilder(){
        character.setCharacterClass("Tank");
        character.setWeapon("Shield");
        character.setArmor("Plate Armor");
        character.setHealth(200);
        character.setMana(40);
        character.setStrength(90);
        character.setAgility(40);
        character.setDefense(95);
    }
}
