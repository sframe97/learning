package OOP.Inheritance;

public class Cat extends Animal{
    //animal = SUPERCLASS, BASE CLASS, PARENT
    //CAT = SUBCLASS, CHILD CLASS
    public Cat(String name, int age) {
        super(name, age);
    }
    public void zgaraie (){
        System.out.println("zgariat");
    }

    @Override
    public void walk (){
        System.out.println("pisicuta tiptil merge");
    }
    //override cand preiua tot din clasa de baza si adaug behaviour in plus
    @Override
    public void sleep (){
        super.sleep(); //preia tot behaviourul de la sleep din animal
        System.out.println("purrrr");
    }
}
