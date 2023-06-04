package OOP.curs3;

public class Scholar extends PersonActions {
    @Override
    public String sleep() {
        System.out.println("scholar-ul doarme 9h");
        return super.sleep();
    }
}
