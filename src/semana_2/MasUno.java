package semana_2;

import java.util.Arrays;

public class MasUno {

    /*
    Se le proporciona un entero grande representado como una matriz de
    enteros digits, donde cada digits[i] es el i-ésimo dígito del entero. Los
     dígitos están ordenados de mayor a menor valor, de izquierda a derecha.
     El entero grande no contiene ningún cero inicial.

    Incremente el entero grande en uno y devuelva la matriz de dígitos
    resultante.
     */

    static int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        digits = new int[n + 1];
        digits[0] = 1;
        return digits;
    }

    public static void main(String[] ignoredArgs) {
        int[] digits = {7, 2, 8, 5, 0, 9, 1, 2, 9, 5, 3, 6, 6, 7, 3, 2, 8, 4, 3,
                7, 9, 5, 7, 7, 4, 7, 4, 9, 4, 7, 0, 1, 1, 1, 7, 4, 0, 0, 9};
        System.out.println(Arrays.toString(plusOne(digits)));
    }
}
