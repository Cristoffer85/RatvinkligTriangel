import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double triangelSideA, triangelSideB, triangelHyp;
        System.out.println("Ange den rätvinkliga triangelns sida a i siffror: ");
        triangelSideA = scanner.nextDouble();
        System.out.println("Ange den rätvinkliga triangelns sida b i siffror: ");
        triangelSideB = scanner.nextDouble();
        System.out.println("Ange den rätvinkliga triangelns hypotenusa c i siffror: ");
        triangelHyp = scanner.nextDouble();

        double triangleArea = triangelSideA * triangelSideB / 2;
        double triangleCirc = triangelSideB + triangelSideB + triangelHyp;

        System.out.println("Triangelns area är: " + triangleArea);
        System.out.println("Triangelns omkrets är: " + triangleCirc);
    }
}
