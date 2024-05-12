public class sopaletras {
    public static void main(String[] args) {
        String sopaletras = "SOPALETRAS";
        String[][] sopaletrasArray = new String[10][10];
        //ingresamos la palabra horizontalmente en la sopa
        for (int i = 0; i < sopaletras.length(); i++) {
            sopaletrasArray[0][i] = String.valueOf(sopaletras.charAt(i));
        }
        //ingresamos la palabra verticalmente en la sopa en una posicion aleatoria
        int pos = (int) (Math.random() * 10);
        for (int i = 0; i < sopaletras.length(); i++) {
            sopaletrasArray[i][pos] = String.valueOf(sopaletras.charAt(i));
        }
        //rellenamos la sopa con letras aleatorias
        for (int i = 0; i < sopaletrasArray.length; i++) {
            for (int j = 0; j < sopaletrasArray[i].length; j++) {
                if (sopaletrasArray[i][j] == null) {
                    sopaletrasArray[i][j] = String.valueOf((char) (Math.random() * 26 + 'A'));
                }
            }
        }
        //imprimimos la sopa
        for (int i = 0; i < sopaletrasArray.length; i++) {
            for (int j = 0; j < sopaletrasArray[i].length; j++) {
                System.out.print(sopaletrasArray[i][j] + " ");
            }
            System.out.println();
        }

    }
}
