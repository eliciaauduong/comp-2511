# Tutorial 5

## Interfaces, abstract classes and inheritance

Compare interfaces, abstract classes and concrete classes.

* Which of them can be constructed?
    * Only concrete classes
* Which can have abstract methods?
    * Interfaces and abstract classes with the keyword `abstract` prefixed
* Which can have concrete methods?
    * Abstract and concrete classes
    * Interfaces can have default methods which have an implementation
        * Conflicting methods would need specification from the implementing class
* Which can have fields?
    * Abstract and concrete classes
* How do they relate to each other in terms of inheritance and realisation?
    * Realise / implement interfaces
        * Can implement more than one at the same time
    * Inherit / extend abstract or concrete classes
        * Can only extend on at a time

Consider a game where different types of characters move around on a grid fighting each other. When one character moves into the square occupied by another they attack that character and inflict damage based on random chance (e.g. a dice roll).

* A king can move one square in any direction (including diagonally), and always causes 8 points of damage when attacking.
* A knight can move like a knight in chess (in an L shape), and has a 1 in 2 chance of inflicting 10 points of damage when attacking.
* A queen can move to any square in the same column, row or diagonal as she is currently on, and has a 1 in 3 chance of inflicting 12 points of damage or a 2 out of 3 chance of inflicting 6 points of damage.
* A troll can only move up, down, left or right, and has a 1 in 6 chance of inflicting 20 points of damage.

The classes in the packages `unsw.characters.inheritance` and `unsw.characters.strategy` show two different approaches to representing the characters in such a game.

* What are the key differences between the two?
    * Inheritance version has abstract classes with abstract methods
        * Constructor only needs x and y arguments
    * Strategy version has concrete classes with concrete methods
        * Constructor needs more information
* How does this example differ from the movie rental example from last week?
    * We don't expect a change between the types of characters
* What are the strengths and weaknesses of each approach?
    * Inheritance is simpler
    * Strategy is more flexible if the requirements change and reduces repetition
        * You can change attack and move behaviour at run time
* Suppose you wanted to create a new elf character that moves like a king, but attacks like a queen. How would you implement such a character with both approaches?
    * Strategy pass in king move and queen attack
    * Inheritance could subclass king or subclass queen and reimplement the other class
* Thinking more generally, is one of them always preferable to the other?
    * Inheritance is simpler if requirements are not expected to change
