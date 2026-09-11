# Game Character Builder Pattern
## Overview

This project demonstrates the implementation of the **Builder Creational Design Pattern** in Java.

The application creates different types of game characters step by step.  
Each character has common properties such as name, weapon, armor, health, mana, strength, agility, and defense.

## Builder Pattern Structure
The project contains the following Builder Pattern components:

- **Product:** `GameCharacter`
- **Builder:** `CharacterBuilder`
- **Concrete Builders:**
  - `WarriorBuilder`
  - `MageBuilder`
  - `ArcherBuilder`
  - `TankBuilder`
- **Director:** `CharacterDirector`
- **Client:** `Main`

## Character Types

Project supports four character representations:
- Warrior
- Mage
- Archer
- Tank

Each Concrete Builder defines its own default character class, weapon, armor, and statistics.

The default configuration can still be changed using the fluent Builder API.

Example:

```java
GameCharacter warrior = new WarriorBuilder()
        .setName("Gideon")
        .setWeapon("Great Sword")
        .setHealth(180)
        .build();
```
## Director Usage

`CharacterDirector` controls the construction process and works with the abstract `CharacterBuilder`.

Example:

```java
CharacterDirector director =
        new CharacterDirector(new WarriorBuilder());

GameCharacter warrior =
        director.constructCharacter("Gideon");

director.setBuilder(new MageBuilder());

GameCharacter mage =
        director.constructCharacter("Merlin");
```

This allows the same Director to work with different character representations without depending on a specific Concrete Builder.

## Project Structure

```text
src/
└── gamecharacter/
    ├── GameCharacter.java
    ├── CharacterBuilder.java
    ├── CharacterDirector.java
    ├── Main.java
    │
    └── concretebuilder/
        ├── WarriorBuilder.java
        ├── MageBuilder.java
        ├── ArcherBuilder.java
        └── TankBuilder.java
```

## Clean Code Practices

The implementation applies several Clean Code principles:

- Meaningful and intention-revealing class and method names
- Small methods with a single responsibility
- DRY principle by keeping shared Builder logic in `CharacterBuilder`
- Validation before creating the final product
- Small and focused classes
- Constants instead of unexplained numeric values where appropriate

## Validation

The `build()` method validates the character before returning the final product.

For example, a character cannot be created without a name:

```java
public GameCharacter build() {
    if (character.getName() == null || character.getName().isBlank()) {
        throw new IllegalStateException(
                "Character name must not be empty"
        );
    }

    return character;
}
```

## Requirements

- Java JDK 26
- IntelliJ IDEA or another Java IDE

## How to Run

1. Clone the repository.
2. Open the project in IntelliJ IDEA.
3. Make sure JDK 26 is selected.
4. Open `Main.java`.
5. Run the `main()` method.

The program will create and print several different game characters using the Builder pattern.

## Example Output

```text
GameCharacter{name='Gideon', characterClass='Warrior', ...}
GameCharacter{name='Merlin', characterClass='Mage', ...}
GameCharacter{name='Robin', characterClass='Archer', ...}
GameCharacter{name='Arthas', characterClass='Tank', ...}
```
## Design Pattern

**Creational Design Pattern: Builder**

The Builder pattern is appropriate for this project because a `GameCharacter` consists of multiple configurable parts and can have several different representations.

Using the pattern makes the construction process more readable, reusable, and easier to extend with additional character types.

## I hope you enjoy my university project, thank you for reading README <3
