import java.util.Scanner;
public class figuras {
    public static void menu(int figura) {
        Scanner scanner = new Scanner(System.in);
        while (figura != 5) {
            if (figura == 1) {
                System.out.println("Ingrese el radio del circulo");
                double radio = scanner.nextDouble();
                Acirculo(radio);
            } else if (figura == 2) {
                System.out.println("Ingrese el lado del cuadrado");
                double lado = scanner.nextDouble();
                Acuadrado(lado);
            } else if (figura == 3) {
                System.out.println("Ingrese la base del triangulo");
                double base = scanner.nextDouble();
                System.out.println("Ingrese la altura del triangulo");
                double altura = scanner.nextDouble();
                Atriangulo(base, altura);
            } else {
                System.out.println("Opcion no valida");
            }
            System.out.println("Ingrese el tipo de figura: " +
                    "\n 1. Circulo \n 2. Cuadrado \n 3. Triangulo \n 5. Salir");
            figura = scanner.nextInt();
        }

    }
    public static void Atriangulo(double base, double altura) {
        double area = (base * altura) / 2;
        System.out.println("El area del triangulo es: " + String.format("%.2f", area));
    }

    public static void Acuadrado(double lado) {
        double area = Math.pow(lado, 2);
        System.out.println("El area del cuadrado es: " + String.format("%.2f", area));
    }

    public static void Acirculo(double radio) {
        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("El area del circulo es: " + String.format("%.2f", area));
    }

    public static void main(String[] args) {
        System.out.println("Calcule el area de las figuras");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el tipo de figura: " +
                "\n 1. Circulo \n 2. Cuadrado \n 3. Triangulo \n 5. Salir");
        int figura = scanner.nextInt();
        menu(figura);

    }
}
