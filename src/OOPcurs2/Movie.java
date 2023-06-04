package OOPcurs2;

public class Movie {
    String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    boolean start;
    public boolean getStart (){
        if (start == true){
            System.out.println("pauza");
        }else {
            return false;
        }
        return start;
    }
    public void setStart (){

    }

    int minutes;
    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    String actor;
    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }
}
