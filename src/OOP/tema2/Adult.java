package OOP.tema2;

public class Adult extends Person {
    String job;
    public void muncesc (){
        System.out.println("eu " + nume + " muncesc");
    }
    @Override
    public void doarme() {
        System.out.println("dorm 7 in timpul saptamanii si 9h in weekend");
    }
}
