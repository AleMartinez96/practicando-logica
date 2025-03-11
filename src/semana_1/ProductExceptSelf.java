package semana_1;

import java.util.Arrays;

public class ProductExceptSelf {

    /*
    Dado un array de enteros nums, devuelve un array answer tal que answer[i]
     sea igual al producto de todos los elementos de nums excepto nums[i].

    Se garantiza que el producto de cualquier prefijo o sufijo de nums cabe
    en un entero de 32 bits.

    Debes escribir un algoritmo que se ejecute en O(n) y sin usar la
    operación de división.
     */

    static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] array = new int[n];
        int producto = 1;
        array[0] = producto;

        for (int i = 1; i < n; i++) {
            producto *= nums[i - 1];
            array[i] = producto;
        }

        producto = 1;
        for (int i = n - 2; i >= 0; i--) {
            producto *= nums[i + 1];
            array[i] *= producto;
        }

        return array;
    }

    public static void main(String[] ignoredArgs) {
        int[] array = {1, 2, 3, 4};
        System.out.println(Arrays.toString(productExceptSelf(array)));
    }
}
