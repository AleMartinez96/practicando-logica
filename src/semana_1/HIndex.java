package semana_1;

import java.util.Arrays;

public class HIndex {

    /*
    Dado un array de enteros citations, donde citations[i] representa la
    cantidad de citas que recibió un investigador por su i-ésimo artículo,
    devuelve el índice h del investigador.

    Según la definición del índice h en Wikipedia:
    El índice h se define como el valor máximo de h tal que el investigador ha
    publicado al menos h artículos que han sido citados al menos h veces cada
     uno.
     */

    static int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;
        int izq = 0;
        int der = n - 1;
        while (izq <= der) {
            int med = (izq + der) / 2;
            if (citations[med] >= n - med) {
                der = med - 1;
            } else {
                izq = med + 1;
            }
        }
        return n - izq;
    }

    public static void main(String[] ignoredArgs) {
        int[] citations = {3, 0, 6, 1, 5};
        System.out.println(hIndex(citations));
    }
}
