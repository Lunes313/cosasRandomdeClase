public class Dados {
    public static void main(String[] args) {
        System.out.println("Juego de dados");
        int num1 = (int) (Math.random() * 6) + 1;
        int num2 = (int) (Math.random() * 6) + 1;
        System.out.println("Dado 1 : " + num1);
        System.out.println("Dado 2 : " + num2);
        System.out.println("La suma de los dados es : " + (num1 + num2));
    }
}
