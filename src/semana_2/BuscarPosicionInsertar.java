package semana_2;

public class BuscarPosicionInsertar {

    /*
    Dado un array ordenado de enteros distintos y un valor objetivo, devuelve
     el índice si se encuentra el objetivo. En caso contrario, devuelve el
     índice donde estaría si se insertara en orden.
     */

    static int searchInsert(int[] nums, int target) {
        int inicio = 0;
        int fin = nums.length - 1;
        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;
            if (nums[medio] == target) {
                return medio;
            } else if (nums[medio] < target) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }
        return inicio;
    }

    public static void main(String[] ignoredArgs) {
        int[] nums = {1, 3, 5, 6};
        int target = 7;
        System.out.println(searchInsert(nums, target));
    }
}
