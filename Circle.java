import java.lang.Math;
import java.util.Scanner;


public class Circle implements Shape {
    private double radius;

    public Circle(){
        this.radius = 0;
    }

    public Circle(double r){
        this.radius = r;
    }

    @Override
    public void set2DDimensions(){
        System.out.println("Radius?");
        Scanner sc = new Scanner(System.in);
        double s = sc.nextDouble();
        this.radius = s;
    }

    public double getRadius(){
        return radius;
    }

    @Override
    public double findArea(){
        return Math.PI*radius*radius;
    }

    @Override
    public double findPerimeter(){
        return 2*Math.PI*radius;
    }

    @Override
    public void print() {}
    
    //for 3D
    

    @Override
    public double findVolume() {
        return 4*(Math.PI)*radius*radius*radius/3;
    }

    @Override
    public double findSurfaceArea() {
        double sa = 4*Math.PI*radius*radius;
        System.out.println("Surface area of Sphere is " + sa);
        return sa;
    }

    @Override
    public void set3DDimensions() {
        set2DDimensions();
    }

}
