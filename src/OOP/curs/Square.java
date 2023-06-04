package OOP.curs;

public class Square {
    //state
    private int side;
    //constructor
    public void setSide (int side){
       this.side = side;
    }

    public int getSide (){
        return side;
    }

    public double getAria(){
        return (side*side);
    }

    public double getParameter(){
        return (4*side);
    }
}
