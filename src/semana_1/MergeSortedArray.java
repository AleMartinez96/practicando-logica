package semana_1;

public class MergeSortedArray {

    /*
    Se te dan dos arreglos de enteros nums1 y nums2, ordenados en orden no
    decreciente, y dos enteros m y n, que representan la cantidad de
    elementos en nums1 y nums2, respectivamente.

    Combina nums1 y nums2 en un solo arreglo ordenado en orden no decreciente.

    El arreglo final no debe ser devuelto por la función, sino que debe
    almacenarse dentro de nums1. Para esto, nums1 tiene una longitud de m + n,
    donde:

    Los primeros m elementos representan los valores que deben ser combinados.
    Los últimos n elementos están inicializados en 0 y deben ser ignorados.
    nums2 tiene una longitud de n

    Entrada:
    nums1 = [1,2,3,0,0,0], m = 3
    nums2 = [2,5,6], n = 3
    Salida:
    [1,2,2,3,5,6]
    */

    static void merge(int[] nums1, int m, int[] nums2, int n) {
        int lengthNums1 = m - 1;
        int lengthNums2 = n - 1;
        int lengthTotal = (n + m) - 1;
        while (lengthNums1 >= 0 && lengthNums2 >= 0) {
            nums1[lengthTotal--] = nums1[lengthNums1] <=
                                   nums2[lengthNums2] ? nums2[lengthNums2--]
                    : nums1[lengthNums1--];
        }
        while (lengthNums1 >= 0) {
            nums1[lengthTotal--] = nums1[lengthNums1--];
        }
        while (lengthNums2 >= 0) {
            nums1[lengthTotal--] = nums2[lengthNums2--];
        }
    }

    public static void main(String[] ignoredArgs) {

        int[] numeros1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] numeros2 = {2, 5, 6};
        int n = 3;
        merge(numeros1, m, numeros2, n);
    }
}
