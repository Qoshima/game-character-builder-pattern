package gamecharacter.concretebuilder;
import gamecharacter.CharacterBuilder;

public class ArcherBuilder extends CharacterBuilder {
    private final static int DEFAULT_HEALTH = 90;
    private final static int DEFAULT_MANA = 20;
    private final static int DEFAULT_STRENGTH = 60;
    private final static int DEFAULT_AGILITY = 150;
    private final static int DEFAULT_DEFENSE = 70;

    public ArcherBuilder(){
        character.setCharacterClass("Archer");
        character.setWeapon("Composite Bow");
        character.setArmor("Leather Armor");
        character.setHealth(DEFAULT_HEALTH);
        character.setMana(DEFAULT_MANA);
        character.setStrength(DEFAULT_STRENGTH);
        character.setAgility(DEFAULT_AGILITY);
        character.setDefense(DEFAULT_DEFENSE);
    }
}
