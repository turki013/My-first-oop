
public class MyFirstOOPproject {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.setlength(9);
        r1.setwidth(6.9);

        Rectangle r2 = new Rectangle();
        r2.setlength(15.6);
        r2.setwidth(20);

        print(r1, r2);
    }

    public static void print(Rectangle r1, Rectangle r2) {
        System.out.println("Rectangle 1: Length = " + r1.getLength() + ", Width = " + r1.getWidth());
        System.out.println("Rectangle 2: Length = " + r2.getLength() + ", Width = " + r2.getWidth());
    }
}

class Rectangle {

    private double length;
    private double width;

    public void setlength(double y) {
        length = y;
    }

    public void setwidth(double w) {
        width = w;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
}
