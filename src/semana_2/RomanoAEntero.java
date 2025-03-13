package semana_2;

import java.util.Map;

public class RomanoAEntero {

    /*
    Los números romanos se representan con siete símbolos diferentes: I, V,
    X, L, C, D y M.

    Por ejemplo, el 2 se escribe II en números romanos, simplemente sumando dos
    unos. El 12 se escribe XII, que es simplemente X + II. El número 27 se
    escribe XXVII, que es XX + V + II.

    Los números romanos suelen escribirse de mayor a menor, de izquierda a
    derecha. Sin embargo, el número para el cuatro no es IIII. En su lugar, el
    número cuatro se escribe IV. Como el uno está antes del cinco, lo restamos
    para obtener cuatro. El mismo principio se aplica al número nueve, que se
    escribe IX. Hay seis casos en los que se usa la resta:

    I puede colocarse antes de V (5) y X (10) para formar 4 y 9.
    X puede colocarse antes de L (50) y C (100) para formar 40 y 90.
    C puede colocarse antes de D (500) y M (1000) para formar 400 y 900.
    Dado un número romano, conviértalo a un entero.
     */

    static int romanToInt(String s) {
        Map<Character, Integer> map = Map.of('I', 1, 'V', 5, 'X', 10, 'L', 50,
                'C', 100, 'D', 500, 'M', 1000);
        int resultado = 0;
        int anterior = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int valorMap = map.get(s.charAt(i));
            resultado += valorMap >= anterior ? valorMap : -valorMap;
            anterior = valorMap;
        }
        return resultado;
    }

    public static void main(String[] ignoredArgs) {
        String romano = "MCMXCIV";
        System.out.println(romanToInt(romano));
    }
}
