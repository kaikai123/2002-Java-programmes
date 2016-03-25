import java.lang.Math;
import java.util.Scanner;


class Cylinder extends Circle implements Shape {
    private double radius;
    private double height;

    public Cylinder() {
        super();
        this.height = 1;
    }
    
    //only methods for 3D
    @Override
    public double findVolume() {
        return Math.PI*radius*radius*height;
    }

    @Override
    public double findSurfaceArea() {
        double sa = 2*Math.PI*radius*(height+radius);
        System.out.println("Total surface area of Cylinder is " + sa);
        return sa;
    }

    @Override
    public void set3DDimensions() {
        System.out.println("Radius?");
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        this.radius = r;
        System.out.println("Height?");
        double s = sc.nextDouble();
        this.height = s;
    }
    
}
