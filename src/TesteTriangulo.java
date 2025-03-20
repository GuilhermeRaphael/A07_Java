import java.util.Scanner;

public class TesteTriangulo {
    public static void main(String[] args) {
        Scanner tri = new Scanner(System.in);
        Triangulo triangulo = new Triangulo();
        System.out.println("Digite x: ");
        triangulo.setX(tri.nextDouble());
        System.out.println("Digite y: ");
        triangulo.setY(tri.nextDouble());
        System.out.println("Digite z: ");
        triangulo.setZ(tri.nextDouble());

        System.out.println(triangulo.getX());
        System.out.println(triangulo.getY());
        System.out.println(triangulo.getZ());
        System.out.println(triangulo.Valida());

    }
}
