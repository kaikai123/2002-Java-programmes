import java.util.Scanner;

public class Square implements Shape {
    private double length;
    
    public Square(){
        this.length = 1;
    }
    
    public Square(double l) {
        length = l;
    }
    
    @Override
    public void set2DDimensions(){
        System.out.println("Length?");
        Scanner sc = new Scanner(System.in);
        double s = sc.nextDouble();
        this.length = s;
    }
    
    @Override
    public double findArea() {
        return length * length;
    }
    
    @Override
    public double findPerimeter(){
        return 4*length;
    }
    
    @Override
    public void print(){}

    //for 3D
    @Override
    public double findSurfaceArea() {
        double sa = 6*findArea();
        System.out.println("Surface area of Cube is " + sa);
        return sa;
    }

    @Override
    public double findVolume() {
        return length*findArea();
    }

    @Override
    public void set3DDimensions() {
        set2DDimensions();
    }

}
