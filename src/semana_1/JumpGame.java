package semana_1;

public class JumpGame {

    /*
    Se te da un array de enteros nums. Inicialmente, estás posicionado en el
    primer índice del array, y cada elemento en el array representa la máxima
     distancia que puedes saltar desde esa posición.

    Devuelve true si puedes llegar al último índice, o false en caso contrario.

    Ejemplo 1:
    Entrada: nums = [2,3,1,1,4]
    Salida: true
    Explicación: Salta 1 paso desde el índice 0 al 1, luego salta 3 pasos hasta
    el último índice.

    Ejemplo 2:
    Entrada: nums = [3,2,1,0,4]
    Salida: false
    Explicación: Siempre llegarás al índice 3 sin importar qué hagas. Su máximo
    salto es 0, lo que hace imposible llegar al último índice.
     */

    static boolean canJump(int[] nums) {
        int cont = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > cont) {
                return false;
            }
            cont = Math.max(cont, i + nums[i]);
        }
        return true;
    }

    public static void main(String[] ignoredArgs) {
        int[] nums = {3,2,1,0,4};
        System.out.println(canJump(nums));
    }
}
