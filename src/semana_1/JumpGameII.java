package semana_1;

public class JumpGameII {

    /*
    Se te da un array de enteros nums con índice 0 de longitud n.
    Inicialmente, estás posicionado en nums[0].

    Cada elemento nums[i] representa la longitud máxima de un salto hacia
    adelante desde el índice i. En otras palabras, si estás en nums[i], puedes
    saltar a cualquier nums[i + j] donde:

    0 <= j <= nums[i] y i + j < n
    Devuelve el número mínimo de saltos para llegar a nums[n - 1].
    Los casos de prueba están generados de tal manera que siempre puedes
    llegar a nums[n - 1].

    Ejemplo 1:

    Entrada: nums = [2, 3, 1, 1, 4]

    Salida: 2

    Explicación: El número mínimo de saltos para llegar al último índice es 2.
    Saltas 1 paso desde el índice 0 al 1, luego 3 pasos al último índice.

    Ejemplo 2:

    Entrada: nums = [2, 3, 0, 1, 4]

    Salida: 2
     */

    static int jump(int[] nums) {
        int saltos = 0;
        int inicio = 0;
        int fin = 0;
        if (nums.length <= 1) {
            return saltos;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            inicio = Math.max(inicio, i + nums[i]);
            if (i == fin) {
                saltos++;
                fin = inicio;
            }
            if (fin >= nums.length - 1) {
                break;
            }
        }
        return saltos;
    }

    public static void main(String[] ignoredArgs) {
        int[] nums = {1, 2};
        System.out.println(jump(nums));
    }
}
