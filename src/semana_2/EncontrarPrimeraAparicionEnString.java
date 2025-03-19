package semana_2;

public class EncontrarPrimeraAparicionEnString {

    /*
    Dadas dos cadenas, aguja y pajar, devuelve el índice de la primera
    aparición de aguja en pajar, o -1 si aguja no es parte de pajar.

    Ejemplo
    Si haystack = "hola mundo" y needle = "mundo", la respuesta es 5 porque
    "mundo" comienza en la posición 5 dentro de "hola mundo".
    Si needle = "adiós", la respuesta es -1 porque "adiós" no está en "hola
    mundo".
     */

    static int strStr(String haystack, String needle) {
        int index = 0;
        while (!haystack.isEmpty()) {
            if (haystack.startsWith(needle)) {
                return index;
            }
            haystack = haystack.substring(1);
            index++;
        }
        return -1;
    }

    public static void main(String[] ignoredArgs) {
        String hayStack = "a";
        String needle = "a";
        System.out.println(strStr(hayStack, needle));
    }
}
