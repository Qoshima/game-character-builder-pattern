package gamecharacter;

public class GameCharacter {
    private String name;
    private String characterClass;
    private String weapon;
    private String armor;

    private int health;
    private int mana;
    private int strength;
    private int agility;
    private int defense;

    public void setName(String name) {
        this.name = name;
    }

    public void setCharacterClass(String characterClass) {
        this.characterClass = characterClass;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void setArmor(String armor) {
        this.armor = armor;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "GameCharacter{" +
                "name='" + name + '\'' +
                ", characterClass='" + characterClass + '\'' +
                ", weapon='" + weapon + '\'' +
                ", armor='" + armor + '\'' +
                ", health=" + health +
                ", mana=" + mana +
                ", strength=" + strength +
                ", agility=" + agility +
                ", defense=" + defense +
                '}';
    }
}
