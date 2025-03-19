package semana_2;

public class TamanioUltimaPalabra {

    /*
    Dada una cadena s compuesta de palabras y espacios, devuelve la longitud
    de la última palabra de la cadena.
     */

    static int lengthOfLastWord(String s) {
        int cont = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ')
                break;
            cont++;
        }
        return cont;
    }

    public static void main(String[] ignoredArgs) {
        String s = "Hello World";
        System.out.println(lengthOfLastWord(s));
    }
}
