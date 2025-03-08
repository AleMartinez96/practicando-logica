package semana_1;

import java.util.Arrays;

public class RemoveDuplicatesII {

    /*
    Dado un arreglo de enteros nums ordenado en orden no decreciente, elimina
     algunos duplicados en su lugar, de manera que cada elemento único
     aparezca como máximo dos veces. El orden relativo de los elementos debe
     mantenerse igual.

    Como en algunos lenguajes no es posible cambiar el tamaño del arreglo, el
    resultado debe colocarse en la primera parte de nums. Más formalmente, si
    después de eliminar los duplicados quedan k elementos, entonces los
    primeros k elementos de nums deben contener el resultado final.
    No importa qué valores queden más allá de los primeros k elementos.

    Devuelve k después de colocar el resultado final en los primeros k espacios
    de nums.

    Restricción:
    No puedes usar espacio adicional para otro arreglo. Debes modificar el
    arreglo de entrada en su lugar, usando solo O(1) memoria extra.

    Entrada:
    nums = [0,0,1,1,1,1,2,3,3]
    Salida:
    7, nums = [0,0,1,1,2,3,3,_,_]
     */

    static int removeDuplicates(int[] nums) {
        int index = 1;
        int cont = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1] && cont < 2) {
                nums[index++] = nums[i];
                cont++;
            } else if (nums[i] != nums[i - 1]) {
                cont = 1;
                nums[index++] = nums[i];
            }
        }
        return index;
    }

    public static void main(String[] ignoredArgs) {
        int[] numeros = {0, 0, 1, 1, 1, 1, 2, 3, 3};
        System.out.println(removeDuplicates(numeros));
        System.out.println(Arrays.toString(numeros));
    }
}
