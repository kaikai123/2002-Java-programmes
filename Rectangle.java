import java.util.Scanner;

public class Rectangle implements Shape {
    private double breadth;
    private double height;
    private double length;
    
    public Rectangle(){
            this.breadth = 1;
            this.height = 1;
            this.length = 1;
    }
    
    public Rectangle(double w, double h) {
        breadth = w;
        height = h;
    }
    
    public void set2DDimensions(){
        System.out.println("Height?");
        Scanner sc = new Scanner(System.in);
        double s = sc.nextDouble();
        this.height = s;
        System.out.println("Breadth?");
        double b = sc.nextDouble();
        this.breadth = b;
    }
    
    public double findArea() {
        return breadth * height;
    }
    
    public double findPerimeter(){
        return 2*(breadth + height);
    }
    
    public void print(){}

    @Override
    public double findSurfaceArea() {
        double b = breadth;
        double h = height;
        double l = length;
        double sa = 2*(b*l + b*h + h*l);
        System.out.println("Surface area of Cuboid is " + sa);
        return sa;
    }

    @Override
    public double findVolume() {
        return breadth*length*height;
    }

    @Override
    public void set3DDimensions() {
        System.out.println("Length?");
        Scanner sc = new Scanner(System.in);
        double s = sc.nextDouble();
        this.length = s;
        System.out.println("Breadth?");
        double b = sc.nextDouble();
        this.breadth = b;
        System.out.println("Height?");
        double h = sc.nextDouble();
        this.height = h;
    }

}
