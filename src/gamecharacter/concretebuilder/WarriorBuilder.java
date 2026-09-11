package gamecharacter.concretebuilder;
import gamecharacter.CharacterBuilder;
import gamecharacter.GameCharacter;

public class WarriorBuilder implements CharacterBuilder{
    private final GameCharacter character = new GameCharacter();

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
    
    @Override
    public CharacterBuilder setName(String name) {
        character.setName(name);
        return this;
    }

    @Override
    public CharacterBuilder setWeapon(String weapon) {
        character.setWeapon(weapon);
        return this;
    }

    @Override
    public CharacterBuilder setArmor(String armor) {
        character.setArmor(armor);
        return this;
    }

    @Override
    public CharacterBuilder setHealth(int health) {
        character.setHealth(health);
        return this;
    }

    @Override
    public CharacterBuilder setMana(int mana) {
        character.setMana(mana);
        return this;
    }

    @Override
    public CharacterBuilder setStrength(int strength) {
        character.setStrength(strength);
        return this;
    }

    @Override
    public CharacterBuilder setAgility(int agility) {
        character.setAgility(agility);
        return this;
    }

    @Override
    public CharacterBuilder setDefense(int defense) {
        character.setDefense(defense);
        return this;
    }

    @Override
    public GameCharacter build() {
        return character;
    }
}
