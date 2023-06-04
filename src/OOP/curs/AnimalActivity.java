package OOP.curs;

import OOP.Inheritance.Animal;
import OOP.Inheritance.Cat;

public class AnimalActivity{
    public static void main(String[] args) {
        Cat cat = new Cat("ina" ,2);
        cat.eat(3);
        cat.sleep();
        cat.walk();

        Animal animal = new Animal("aa", 2);
        animal.walk();
    }
}
