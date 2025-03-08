package semana_1;

import java.util.Arrays;

public class RemoveElement {

    /*
        Dado un arreglo de enteros nums y un entero val, elimina todas las
        ocurrencias de val en nums en su lugar. El orden de los elementos
        puede cambiar. Luego, devuelve el número de elementos en nums que no
        son iguales a val.

        Considera que el número de elementos en nums que no son iguales a val
         es k. Para que se acepte la solución, debes hacer lo siguiente:

        Cambiar el arreglo nums de tal forma que los primeros k elementos de
        nums contengan los elementos que no son iguales a val.
        Los elementos restantes de nums no importan, ni el tamaño del arreglo.
        Devuelve k.

        Entrada:
        nums = [3,2,2,3], val = 3
        Salida:
        2, nums = [2,2,_,_]
    */

    static int removeElement(int[] nums, int val) {
        int i = 0;
        for (Integer integer : nums) {
            if (integer != val) {
                nums[i++] = integer;
            }
        }
        return i;
    }

    public static void main(String[] ignoredArgs) {
        int[] numeros = {3, 2, 2, 3};
        int valor = 3;
        System.out.println(removeElement(numeros, valor));
        System.out.println(Arrays.toString(numeros));
    }
}
