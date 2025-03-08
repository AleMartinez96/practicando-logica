package semana_1;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    /*
    Dado un arreglo nums de tamaño n, devuelve el elemento mayoritario.

    El elemento mayoritario es el que aparece más de [n / 2] veces. Puedes
    asumir que el elemento mayoritario siempre existe en el arreglo.

    Ejemplo 1:
    Entrada: nums = [3,2,3]
    Salida: 3

    Ejemplo 2:
    Entrada: nums = [2,2,1,1,1,2,2]
    Salida: 2
    */

    static int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int mitad = nums.length / 2;
        for (Integer numero : nums) {
            map.put(numero, map.getOrDefault(numero, 0) + 1);
            if (map.get(numero) > mitad) {
                return numero;
            }
        }
        return -1;
    }

    public static void main(String[] ignoredArgs) {
        int[] numeros = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(majorityElement(numeros));
    }
}
