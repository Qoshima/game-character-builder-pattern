package gamecharacter.concretebuilder;
import gamecharacter.CharacterBuilder;

public class TankBuilder extends CharacterBuilder {

    private final static int DEFAULT_HEALTH = 200;
    private final static int DEFAULT_MANA = 40;
    private final static int DEFAULT_STRENGTH = 90;
    private final static int DEFAULT_AGILITY = 40;
    private final static int DEFAULT_DEFENSE = 95;

    public TankBuilder(){
        character.setCharacterClass("Tank");
        character.setWeapon("Shield");
        character.setArmor("Plate Armor");
        character.setHealth(DEFAULT_HEALTH);
        character.setMana(DEFAULT_MANA);
        character.setStrength(DEFAULT_STRENGTH);
        character.setAgility(DEFAULT_AGILITY);
        character.setDefense(DEFAULT_DEFENSE);
    }
}
