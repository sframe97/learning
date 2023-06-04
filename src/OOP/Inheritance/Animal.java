package OOP.Inheritance;

public class Animal {
    private String name;
    private int age;

    public Animal (String name, int age){
        this.name = name;
        this.age = age;
    }
    public void sleep(){
        System.out.println("zzzzz");
    }
    public int eat(int nr){
        System.out.println("yummmy");
        return nr;
    }
    public void walk (){
        System.out.println("1-2-3? 1-2-3!");
    }

}
