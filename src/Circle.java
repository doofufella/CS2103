public class Circle {
    // Variables
    private int x;
    private int y;
    private double radius;
    private static double maxRadius = 0;

    // Constructors
    public Circle (){
        this(0,0,0);
    }

    public Circle(int x, int y, double radius){
        setX(x);
        setY(y);
        setRadius(radius);
    }

    // Getters
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public double getRadius(){
        return radius;
    }
    public static double getMaxRadius(){
        return maxRadius;
    }

    // Setters
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public void setRadius(double radius){
        radius = radius < 0 ? 0 : radius;
        this.radius = radius;
        maxRadius = Math.max(maxRadius, radius);
    }

    // Methods
    public int getArea(){
        double area = Math.PI * Math.pow(radius, 2);
        return (int)area;
    }

}
