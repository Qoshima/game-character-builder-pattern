package gamecharacter.concretebuilder;
import gamecharacter.CharacterBuilder;

public class WarriorBuilder extends CharacterBuilder {

    private final static int DEFAULT_HEALTH = 175;
    private final static int DEFAULT_MANA = 30;
    private final static int DEFAULT_STRENGTH = 130;
    private final static int DEFAULT_AGILITY = 60;
    private final static int DEFAULT_DEFENSE = 80;

    public WarriorBuilder(){
        character.setCharacterClass("Warrior");
        character.setWeapon("Sword");
        character.setArmor("Chain Mail");
        character.setHealth(DEFAULT_HEALTH);
        character.setMana(DEFAULT_MANA);
        character.setStrength(DEFAULT_STRENGTH);
        character.setAgility(DEFAULT_AGILITY);
        character.setDefense(DEFAULT_DEFENSE);
    }
}
