package semana_1;

public class MaxProfitStocksII {

    /*
    Ejemplo 1:
    Entrada: prices = [7,1,5,3,6,4]
    Salida: 7
    Explicación:

    Compramos el día 2 (precio = 1) y vendemos el día 3 (precio = 5), ganando
     5 - 1 = 4.
    Luego compramos el día 4 (precio = 3) y vendemos el día 5 (precio = 6),
    ganando 6 - 3 = 3.
    La ganancia total es 4 + 3 = 7.
     */

    static int maxProfit(int[] prices) {
        int ganancia = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i] < prices[i + 1]) {
                ganancia += prices[i + 1] - prices[i];
            }
        }
        return ganancia;
    }

    public static void main(String[] ignoredArgs) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }
}
