import java.util.Scanner;
public class magos {
    private static int opciones(){
        int puntos = 0;
        Scanner sc = new Scanner(System.in);
        int menu = sc.nextInt();
        while (menu>=1 && menu<=6){
            if(menu==1){
                puntos+=2;
                System.out.println("Conjuro: Abracadabra");
            }else if(menu==2){
                puntos+=5;
                System.out.println("Conjuro: Alakazam");
            }else if(menu==3){
                puntos+=10;
                System.out.println("Conjuro: wingardiuomleviousa");
            }else if(menu==4){
                puntos+=20;
                System.out.println("Conjuro: ASPIROUSIMOKQLMANousiol");
            }else if(menu==5){
                puntos+=25;
                System.out.println("Conjuro: LAKIDAHUUYFDRSFNSVADEQUIA");
            }else if(menu==6){
                puntos+=50;
                System.out.println("Conjuro: XMAMMXAMMIWMXMWXNNWXIUXWXAOISU");
            }
            menu = sc.nextInt();
        }
        return puntos;
    }
    public static void main(String[]args){
        System.out.println("Seleccione el nivel de conjuro ingresando el numero correspondiente: " +
                " \n 1. Aprendiz (2 puntos) \n 2. Facil (5 puntos) \n " +
                "3. Medio (10 puntos) \n 4. Dificil (20 puntos)  \n 5. Muy dificil (25 puntos) " +
                "\n 6. Experto (50 puntos) \n otro para Salir");
        int p = opciones();
        System.out.println("Sus puntos son: " + p);
    }
}
