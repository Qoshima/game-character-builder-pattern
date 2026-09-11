package gamecharacter.concretebuilder;
import gamecharacter.CharacterBuilder;
import gamecharacter.GameCharacter;

public class ArcherBuilder extends CharacterBuilder {
    public ArcherBuilder(){
        character.setCharacterClass("Archer");
        character.setWeapon("Composite Bow");
        character.setArmor("Leather Armor");
        character.setHealth(90);
        character.setMana(20);
        character.setStrength(60);
        character.setAgility(150);
        character.setDefense(70);
    }
}
