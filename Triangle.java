import java.lang.Math;
import java.util.Scanner;

public class Triangle implements Shape {
    private double height;
    private double base;
    
    public Triangle(){
            this.height = 1;
            this.base = 1;
    }
    
    public Triangle(double a, double b) {
        height = a;
        base = b;
    }
    
    @Override
    public void set2DDimensions(){
        System.out.println("Height?");
        Scanner sc = new Scanner(System.in);
        double s1 = sc.nextDouble();
        this.height = s1;
        System.out.println("Base?");
        double s2 = sc.nextDouble();
        this.base = s2;
    }
    
    @Override
    public double findArea(){
        return (height*base)/2;
    }
    
    @Override
    public double findPerimeter(){
        return 0;
    }
    
    @Override
    public void print(){
        
    }

    //for3D
    @Override
    public void set3DDimensions(){
        System.out.println("Altitude?");
        Scanner sc = new Scanner(System.in);
        double s1 = sc.nextDouble();
        this.height = s1;
        System.out.println("Length of base sides?");
        double s2 = sc.nextDouble();
        this.base = s2;
    }
    
    @Override
    public double findVolume() {
        return (1/3)*base*base*height;
    }

    @Override
    public double findSurfaceArea() {
        double sl = Math.sqrt(height*height + (base/2)*(base/2));
        double sa = (1/2)*4*base*sl + base*base; //formula:(1/2)pl+B
        System.out.println("Surface area of Square-based Pyramid is " + sa);
        return sa;
    }

}
