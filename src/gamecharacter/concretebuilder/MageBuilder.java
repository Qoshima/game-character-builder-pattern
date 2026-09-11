package gamecharacter.concretebuilder;
import gamecharacter.CharacterBuilder;
import gamecharacter.GameCharacter;

public class MageBuilder extends CharacterBuilder {
    public MageBuilder(){
        character.setCharacterClass("Mage");
        character.setWeapon("Silver Staff");
        character.setArmor("Magic Cape");
        character.setHealth(70);
        character.setMana(170);
        character.setStrength(20);
        character.setAgility(60);
        character.setDefense(40);
    }
}
