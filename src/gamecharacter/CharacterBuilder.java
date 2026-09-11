package gamecharacter;

public interface CharacterBuilder {
    CharacterBuilder setName(String name);

    CharacterBuilder setWeapon(String weapon);

    CharacterBuilder setArmor(String armor);

    CharacterBuilder setHealth(int health);

    CharacterBuilder setMana(int mana);

    CharacterBuilder setStrength(int strength);

    CharacterBuilder setAgility(int agility);

    CharacterBuilder setDefense(int defense);

    GameCharacter build();
}
