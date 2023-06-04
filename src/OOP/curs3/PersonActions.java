package OOP.curs3;

public class PersonActions {
    public static void main(String[] args) {
        //definesc clasa Person (name, age) cu behavior : relax, sleep(sout pers doarme in medie 8h/zi)
        //creati 2 clase : Scholar si Teacher
        //scolarul doarme 9/zi si teacher-ul doarme 7h/zi
        //pot sa definesc by default cat doarme si sa definesc eu nr de ore pe care le doarme si sa definesc separat si locul unde doarme
        //teacher-ul are o proprietate in plus: cursul care il preda

        Scholar scholar = new Scholar();
        System.out.println(scholar);
    }

    public void Person (){
        String sleepPlace;
        int hours;
    }
    public String relax (){
        System.out.println("relaxed");
        return relax();
    }
    public String sleep (){
        System.out.println("o pers doarme in medie 8h/zi");
        return sleep();
    }
}
