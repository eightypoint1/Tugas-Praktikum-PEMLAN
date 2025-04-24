package praktic.geometry.mains;

// Import classnya
import praktic.geometry.bases.CircularShape;
import praktic.geometry.bases.Shape;
import praktic.geometry.interfaces.ThreeDimensional;
import praktic.geometry.interfaces.Weightable;
import praktic.geometry.shapes.Circle;
import praktic.geometry.shapes.Cube;
import praktic.geometry.shapes.Sphere;
import praktic.geometry.shapes.Square;
// Import buat scanner
import java.util.*;

/* Ezekiel Aaron Marmora - 245150701111017

 _____         _    _      _ 
| ____|_______| | _(_) ___| |
|  _| |_  / _ \ |/ / |/ _ \ |
| |___ / /  __/   <| |  __/ |
|_____/___\___|_|\_\_|\___|_|
                                                     

*/
public class ShapeCalculator {

    public static void main(String[] args) {
        // Buat objek Scanner
        Scanner scanner = new Scanner(System.in);

        // Warna ANSI
        String biru = "\u001B[34m";

        System.out.println(biru + "==========================================");
        System.out.println("Shape Calculator");
        System.out.println("Ezekiel Aaron Marmora"); 
        System.out.println("245150701111017"); 
        System.out.println("==========================================");

        // Circle
        System.out.println("2D Circle");
        System.out.println("==========================================");
        System.out.print("Enter radius      : ");
        double radius = scanner.nextDouble();
        Circle circle1 = new Circle(radius);
        circle1.printInfo();

        // Biar semua metode kepake
        Circle circle2 = new Circle();

        // Square
        System.out.println("2D Square");
        System.out.println("==========================================");
        System.out.print("Enter side        : ");
        Double side = scanner.nextDouble(); 
        Square square1 = new Square(side);
        square1.printInfo();

        // biar semuanya terpakai
        Square square2 = new Square();


        // Cube
        System.out.println("3D Weightable Cube");
        System.out.println("==========================================");
        System.out.print("Enter edge        : ");
        double cubeEdge1 = scanner.nextDouble(); 
        System.out.print("Enter mass        : ");
        double cubeMass1 = scanner.nextDouble(); 
        Cube cube1 = new Cube(cubeEdge1, cubeMass1);
        cube1.printInfo();

        // biar kepake semua
        Cube cube2 = new Cube();

        // Sphere
        System.out.println("3D Weightable Sphere");
        System.out.println("==========================================");
        System.out.print("Enter radius      : ");
        double sphereRadius1 = scanner.nextDouble();
        System.out.print("Enter mass        : ");
        double sphereMass1 = scanner.nextDouble(); 
        Sphere sphere1 = new Sphere(sphereRadius1, sphereMass1);
        sphere1.printInfo();

        // biar kepake semua
        Sphere sphere2 = new Sphere();

        // Polimorfisme
        System.out.println("Volume of Cube and Sphere");
        System.out.println("POLYMORPHISM: INTERFACE");
        System.out.println("==========================================");
        System.out.print("Enter edge          : ");
        double cubeEdge2 = scanner.nextDouble(); 
        System.out.print("Enter radius        : ");
        double sphereRadius2 = scanner.nextDouble();
        System.out.print("Enter mass          : ");
        double massPoli = scanner.nextDouble(); // massa buat demonstrasi polimorfisme (buat cube dan sphere)
        System.out.println("==========================================");


        // Polimorfisme Shape
        Shape Cube3 = new Cube(cubeEdge2, massPoli);
        Shape Sphere3 = new Sphere(sphereRadius2, massPoli);

        // Demonstrasi menggunakan setName
        Cube3.setName("PolyCube"); 
        Sphere3.setName("PolySphere");

        // Polimorfisme CircularShape
        CircularShape SPHERE = new Sphere(sphereRadius2, massPoli);

        // Polimorfisme ThreeDimensional
        ThreeDimensional Cube4 = (ThreeDimensional) Cube3;
        ThreeDimensional Sphere4 = (ThreeDimensional) Sphere3;

        // Polimorfisme Weightable
        Weightable Cube5 = (Weightable) Cube3;
        Weightable Sphere5 = (Weightable) Sphere3;


        System.out.printf("%s's volume   : %.2f\n", Cube3.getName() , Cube4.getVolume());
        System.out.printf("%s's volume : %.2f\n", Sphere3.getName(), Sphere4.getVolume());
        System.out.printf("Combined Weight     : %.2f\n", Cube5.getWeight() + Sphere5.getWeight()); 
        System.out.println("==========================================");


        scanner.close();
    }
}