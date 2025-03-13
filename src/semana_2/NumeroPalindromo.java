package semana_2;

public class NumeroPalindromo {

    /*
    Dado un entero x, devuelve verdadero si x es un palíndromo y falso en
    caso contrario.
     */

    static boolean isPalindrome(int x) {
        int reverse = 0;
        int aux = x;
        int valor;
        while (x > 0) {
            valor = x % 10;
            reverse = reverse * 10 + valor;
            x /= 10;
        }
        return aux == reverse;
    }

    public static void main(String[] ignoredArgs) {
        System.out.println(isPalindrome(232));
    }
}
