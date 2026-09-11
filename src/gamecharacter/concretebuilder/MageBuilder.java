package gamecharacter.concretebuilder;
import gamecharacter.CharacterBuilder;

public class MageBuilder extends CharacterBuilder {

    private final static int DEFAULT_HEALTH = 70;
    private final static int DEFAULT_MANA = 170;
    private final static int DEFAULT_STRENGTH = 20;
    private final static int DEFAULT_AGILITY = 60;
    private final static int DEFAULT_DEFENSE = 40;

    public MageBuilder(){
        character.setCharacterClass("Mage");
        character.setWeapon("Silver Staff");
        character.setArmor("Magic Cape");
        character.setHealth(DEFAULT_HEALTH);
        character.setMana(DEFAULT_MANA);
        character.setStrength(DEFAULT_STRENGTH);
        character.setAgility(DEFAULT_AGILITY);
        character.setDefense(DEFAULT_DEFENSE);
    }
}
