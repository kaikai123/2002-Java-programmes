import java.util.ArrayList;
import java.util.Scanner;

public class ShapeApp {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please choose: (1) 2D, (2) 3D");
        int d = sc.nextInt();
        switch(d){
            case 1:
                System.out.println("Enter total number of shapes..");
                int n = sc.nextInt();
                Shape[] shapes = new Shape[n];
                for (int i = 0; i < n; i++){
                    System.out.println("Choose a shape:");
                    System.out.println("(1) Circle");
                    System.out.println("(2) Triangle");
                    System.out.println("(3) Square");
                    System.out.println("(4) Rectangle");

                    int sh = sc.nextInt();
                    switch(sh){
                        case 1:
                            shapes[i] = new Circle();
                            break;
                        case 2:
                            shapes[i] = new Triangle();
                            break;
                        case 3:
                            shapes[i] = new Square();
                            break;
                        case 4:
                            shapes[i] = new Rectangle();
                            break;
                        default:
                            shapes[i] = new Circle();
                            break;
                    }
                
                    System.out.println("");
                    System.out.println("Enter dimension..");
                    shapes[i].set2DDimensions();
                
                }
            
                System.out.println("Calculate (1)Area (2)Volume");
                int cal = sc.nextInt();
                if (cal == 1){
                    double t=0;
                    for (Shape s : shapes){
                        t += s.findArea();

                    }
                    System.out.println("Total Area = " + t);
                }
                break;
                
            case 2:
                System.out.println("Enter total number of 3D figures..");
                n = sc.nextInt();
                Shape[] shapes_3d = new Shape[n];
                for (int i = 0; i < n; i++){
                    System.out.println("Choose a figure:");
                    System.out.println("(1) Sphere");
                    System.out.println("(2) Square-based Pyramid");
                    System.out.println("(3) Cone");
                    System.out.println("(4) Cube");
                    System.out.println("(5) Cubiod");
                    System.out.println("(6) Cylinder");

                    int sh = sc.nextInt();
                    switch(sh){
                        case 1:
                            shapes_3d[i] = new Circle();
                            break;
                        case 2:
                            shapes_3d[i] = new Triangle();
                            break;
                        case 3:
                            shapes_3d[i] = new Cone();
                            break;
                        case 4:
                            shapes_3d[i] = new Square();
                            break;
                        case 5:
                            shapes_3d[i] = new Rectangle();
                            break;
                        case 6:
                            shapes_3d[i] = new Cylinder();
                            break;
                        default:
                            shapes_3d[i] = new Circle();
                            break;
                    }
                    
                    System.out.println("Enter dimension..");
                    shapes_3d[i].set3DDimensions();
                
                }
            
                System.out.println("Calculate (1)Surface Area (2)Volume");
                int ca = sc.nextInt();
                if (ca == 1){
                    double t=0;
                    for (Shape s : shapes_3d){
                        t += s.findSurfaceArea();

                    }
                    System.out.println("Total Surface Area is " + t);
                }else if(ca == 2){
                    double v=0;
                    for (Shape s : shapes_3d){
                        v += s.findVolume();
                    }
                    System.out.println("Total Volume is " + v);
                }else{System.out.println("Error!");}
                break;
            default:
                System.out.println("Error!");
                break;
                

	}
    } 

}

