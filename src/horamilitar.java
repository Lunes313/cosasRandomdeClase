import java.util.Scanner;
public class horamilitar {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la hora en formato militar (hh:mm:ss)");
        String h = sc.nextLine();
        horita(h);
    }
    public static void horita(String h){
        int ho = Integer.parseInt(h.substring(0, 2));
        int min = Integer.parseInt(h.substring(3,5));
        int seg = Integer.parseInt(h.substring(6));
        seg+=15;
        if(seg>59) {
            seg-=60;
            min++;
            if(min>59){
                min=0;
                ho++;
                if (ho>23) {
                    ho=0;
                }
            }
        }
        System.out.println(String.format("%02d:%02d:%02d", ho, min, seg));
    }
}
