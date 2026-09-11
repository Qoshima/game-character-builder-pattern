package gamecharacter.concretebuilder;
import gamecharacter.CharacterBuilder;
import gamecharacter.GameCharacter;

public class ArcherBuilder implements CharacterBuilder{
    private final GameCharacter character = new GameCharacter();

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
