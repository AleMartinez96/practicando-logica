package semana_2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SumarDosNumeros {

    /*
    Dado un arreglo de enteros nums y un entero target, devuelve los índices
    de los dos números tales que sumen target.

    Puedes asumir que cada entrada tendrá exactamente una solución, y no puedes
    usar el mismo elemento dos veces.

    Puedes devolver la respuesta en cualquier orden.
     */

    static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] valores = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int resultado = target - nums[i];
            if (map.containsKey(resultado)) {
                valores[0] = map.get(resultado);
                valores[1] = i;
                break;
            }
            map.put(nums[i], i);
        }
        return valores;
    }

    public static void main(String[] ignoredArgs) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
}
