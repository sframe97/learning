package OOP.curs;

public class Rectangle {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.setLength(length);
        this.setWidth(width);
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getArea() {
        return length * width;
    }

    public int getPerimeter() {
        return 2 * (length + width);
    }
}
