package semana_1;

public class MaxProfitStocks {

    /*
    Se te da un array prices, donde prices[i] es el precio de una acción en
    el día i.

    Tu objetivo es maximizar tu ganancia eligiendo un solo día para comprar una
    acción y un día diferente en el futuro para venderla.

    Devuelve la máxima ganancia que puedes obtener con esta transacción. Si
    no es posible obtener ninguna ganancia, devuelve 0.

    Ejemplo 1:
    Entrada: prices = [7,1,5,3,6,4]
    Salida: 5
    Explicación:
    Compra en el día 2 (precio = 1) y vende en el día 5 (precio = 6),
    ganancia = 6 - 1 = 5.
    Nota que comprar en el día 2 y vender en el día 1 no está permitido
    porque debes comprar antes de vender.

    Ejemplo 2:
    Entrada: prices = [7,6,4,3,1]
    Salida: 0
    Explicación:
    En este caso, no se realiza ninguna transacción y la ganancia máxima es 0.
     */

    static int maxProfit(int[] prices) {
        int menor = prices[0];
        int ganancia = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < menor) {
                menor = prices[i];
            } else {
                ganancia = Math.max(ganancia, (prices[i] - menor));
            }
        }
        return ganancia;
    }

    public static void main(String[] ignoredArgs) {
        int[] prices = {2, 4, 1};
        System.out.println(maxProfit(prices));
    }
}
