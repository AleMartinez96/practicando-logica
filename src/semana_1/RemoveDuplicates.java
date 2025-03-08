package semana_1;

import java.util.Arrays;

public class RemoveDuplicates {

    /*
    Dado un arreglo de enteros nums ordenado en orden no decreciente, elimina
    los duplicados en su lugar de manera que cada elemento único aparezca
    solo una vez. El orden relativo de los elementos debe mantenerse igual.
    Luego, devuelve el número de elementos únicos en nums.

    Considera que el número de elementos únicos en nums es k. Para que se
    acepte la solución, debes hacer lo siguiente:

    Cambiar el arreglo nums de tal manera que los primeros k elementos de
    nums contengan los elementos únicos en el orden en que aparecían
    inicialmente en nums. Los elementos restantes de nums no importan, ni el
    tamaño del arreglo. Devuelve k.

    Entrada:
    nums = [1,1,2]
    Salida:
    2, nums = [1,2,_]
    */

    static int removeDuplicates(int[] nums) {
        int index = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[index++] = nums[i];
            }
        }
        return index;
    }

    public static void main(String[] ignoredArgs) {
        int[] numeros = {1, 1, 2};
        System.out.println(removeDuplicates(numeros));
        System.out.println(Arrays.toString(numeros));
    }
}
