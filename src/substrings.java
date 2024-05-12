public class substrings {
    public static void main (String[] args) {
        String str1 = "Esta es una prueba de string, que verifica donde esta un string";
        str1 = str1.toLowerCase();
        String str2 = "Esta";
        String str3 = "String";
        int i1 = str1.indexOf(str2.toLowerCase());
        int i2 = str1.indexOf(str3.toLowerCase());
        System.out.println("La posición del sub-string 1 es:" + i2);
        System.out.println("La posición del sub-string 2 es:" + i1);
    }
}
