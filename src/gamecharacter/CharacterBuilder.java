package gamecharacter;

public abstract class CharacterBuilder {
    protected final GameCharacter character = new GameCharacter();

    public CharacterBuilder setName(String name){
        character.setName(name);
        return this;
    }

    public CharacterBuilder setWeapon(String weapon){
        character.setWeapon(weapon);
        return this;
    }

    public CharacterBuilder setArmor(String armor){
        character.setArmor(armor);
        return this;
    }

    public CharacterBuilder setHealth(int health){
        character.setHealth(health);
        return this;
    }

    public CharacterBuilder setMana(int mana){
        character.setMana(mana);
        return this;
    }

    public CharacterBuilder setStrength(int strength){
        character.setStrength(strength);
        return this;
    }

    public CharacterBuilder setAgility(int agility){
        character.setAgility(agility);
        return this;
    }

    public CharacterBuilder setDefense(int defense){
        character.setDefense(defense);
        return this;
    }

    public GameCharacter build(){
        if (character.getName() == null || character.getName().isBlank()){
            throw new IllegalStateException("Character name cant be empty");
        }
        return character;
    }
}
