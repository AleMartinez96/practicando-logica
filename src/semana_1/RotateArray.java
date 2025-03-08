package semana_1;

import java.util.Arrays;

public class RotateArray {

    /*
    Dado un arreglo de enteros nums, rota el arreglo hacia la derecha k
    pasos, donde k es no negativo.

    Ejemplo 1:

    Entrada: nums = [1,2,3,4,5,6,7], k = 3
    Salida: [5,6,7,1,2,3,4]
    Explicación:
    Rota 1 paso a la derecha: [7,1,2,3,4,5,6]
    Rota 2 pasos a la derecha: [6,7,1,2,3,4,5]
    Rota 3 pasos a la derecha: [5,6,7,1,2,3,4]

    Ejemplo 2:

    Entrada: nums = [-1,-100,3,99], k = 2
    Salida: [3,99,-1,-100]
    Explicación:
    Rota 1 paso a la derecha: [99,-1,-100,3]
    Rota 2 pasos a la derecha: [3,99,-1,-100]
     */

    static void rotate(int[] nums, int k) {
        int length = nums.length;
        k = k % length;
        // -> hacemos que las rotaciones no sean mayor al tamanio de la lista
        reverse(nums, 0, length - 1); // -> rotamos toda la lista
        reverse(nums, 0, k - 1); // -> rotamos los primeros k elementos
        reverse(nums, k, length - 1); // -> rotamos los k elementos restantes
    }

    static void reverse(int[] nums, int izq, int der) {
        while (izq < der) {
            int temp = nums[izq];
            nums[izq] = nums[der];
            nums[der] = temp;
            izq++;
            der--;
        }
    }

    public static void main(String[] ignoredArgs) {
        // Rota 3 pasos a la derecha: [5,6,7,1,2,3,4]
        int[] numeros = {1, 2, 3, 4, 5, 6, 7};
        int valor = 3;
        rotate(numeros, valor);
        System.out.println(Arrays.toString(numeros));
    }
}
