public class pareinpar {
        private static void pares() {
            for (int i = 1; i <= 100; i++) {
                if (i%2==0) {
                    System.out.print(i + " ");
                }
            }
        }
        private static void imp() {
            for (int i = 1; i <= 100; i++) {
                if (i%2!=0) {
                    System.out.print(i + " ");
                }
            }
        }
        public static void main(String[]args){
            System.out.println("Pares del 1 al 100:");
            pares();
            System.out.println("\n Impares del 1 al 100:");
            imp();
        }
    }
