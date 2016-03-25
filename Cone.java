import java.lang.Math;
import java.util.Scanner;


public class Cone extends Circle implements Shape {
    private double radius;
    private double height;
    private double slant;

    public Cone() {
        super();
        this.height = 1;
        this.slant = 3;
    }
    
    //only methods for 3D
    @Override
    public double findVolume() {
        return (1/3)*Math.PI*radius*radius*height;
    }

    @Override
    public double findSurfaceArea() {
        double sa = Math.PI*radius*(slant+radius);
        System.out.println("Surface area of Cone is " + sa);
        return sa;
    }

    @Override
    public void set3DDimensions() {
        System.out.println("Radius?");
        Scanner sc = new Scanner(System.in);
        double s = sc.nextDouble();
        this.radius = s;
        System.out.println("Height?");
        double h = sc.nextDouble();
        this.height = h;
        System.out.println("Slant length?");
        double l = sc.nextDouble();
        this.slant = l;
    }
    
    
}

