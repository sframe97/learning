package OOPcurs2;

public class OOP2 {
    //clasa actor (name si surname)
    //clasa movie (name, start - boolean, minutes - int, actor - string)
    //methods : startMovie, stopMovie, moveBackwords(x), moveForward(x)
    // ma uit la filmul titanic in care joaca leonardo di caprio. sunt la minutul 30.
    public static void main(String[] args) {
        Actor actor = new Actor();
        Movie film = new Movie();
        System.out.print(actor.setName("Leonardo"));
        System.out.print(actor.setSurName("Di Capro"));
        System.out.println("");
        System.out.println(film.getStart());
    }

}
