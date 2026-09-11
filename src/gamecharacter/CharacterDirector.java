package gamecharacter;

public class CharacterDirector {
    private CharacterBuilder builder;

    public CharacterDirector(CharacterBuilder builder){
        this.builder = builder;
    }

    public void setBuilder(CharacterBuilder builder){
        this.builder = builder;
    }

    public GameCharacter constructCharacter(String name){
        return builder
                .setName(name)
                .build();
    }
}
