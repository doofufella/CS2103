public class Circle extends Shape implements Printable {

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public int area() {
        return (int) (Math.PI * Math.pow(radius, 2));
    }

    @Override
    public void print() {
        System.out.println("Area of Circle: " + this.area());
    }
}
