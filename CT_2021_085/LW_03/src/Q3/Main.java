package Q3;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the radius of inner circle radius(ri):");
        double ri=scanner.nextDouble();

        System.out.println("Enter the radius of outer circle(ro): ");
        double ro=scanner.nextDouble();

        //Create Circle objects
        Circle innerCircle=new Circle();
        Circle outerCircle=new Circle();

        //set method
        innerCircle.setRadius(ri);
        outerCircle.setRadius(ro);

        //compute area
        double innerArea=innerCircle.computeArea();
        double outerArea=outerCircle.computeArea();

        //compute circumference
        double innerCircumference=innerCircle.computeCircumference();
        double outerCircumference=outerCircle.computeCircumference();

        //calculate the area of shaded region
        double shadedArea=outerArea-innerArea;

        System.out.println("\nInner Circle:");
        System.out.printf("Area: %.2f%n", innerArea);
        System.out.printf("Circumference: %.2f%n",innerCircumference );

        System.out.println("\nOuter Circle:");
        System.out.printf("Area: %.2f%n", outerArea);
        System.out.printf("Circumference: %.2f%n",outerCircumference );

        System.out.println("\nShaded Area between circles:");
        System.out.printf("Area: %.2f%n", shadedArea);
    }
}
