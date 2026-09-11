package gamecharacter;
import gamecharacter.concretebuilder.*;

public class Main {
    public static void main(String[] args){
        CharacterDirector director = new CharacterDirector(new WarriorBuilder());

        GameCharacter warrior = director.constructCharacter("Gideon");
        System.out.println(warrior);

        director.setBuilder(new MageBuilder());
        GameCharacter mage = director.constructCharacter("Merlin");
        System.out.println(mage);

        director.setBuilder(new ArcherBuilder());
        GameCharacter archer = director.constructCharacter("Robin");
        System.out.println(archer);

        director.setBuilder(new TankBuilder());
        GameCharacter tank = director.constructCharacter("Arthas");
        System.out.println(tank);
    }
}
