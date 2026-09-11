package gamecharacter.concretebuilder;
import gamecharacter.CharacterBuilder;
import gamecharacter.GameCharacter;

public class WarriorBuilder extends CharacterBuilder {
    public WarriorBuilder(){
        character.setCharacterClass("Warrior");
        character.setWeapon("Sword");
        character.setArmor("Chain Mail");
        character.setHealth(175);
        character.setMana(30);
        character.setStrength(130);
        character.setAgility(60);
        character.setDefense(80);
    }
}
