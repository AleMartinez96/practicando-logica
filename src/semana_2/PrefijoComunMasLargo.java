package semana_2;

public class PrefijoComunMasLargo {

    static String longestCommonPrefix(String[] strs) {
        String prefijo = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(prefijo)) {
                prefijo = prefijo.substring(0, prefijo.length() - 1);
            }
        }
        return prefijo;
    }

    public static void main(String[] ignoredArgs) {
        String[] palabras = {"flower", "flow", "flight"};
        String prefijo = palabras[0];
        for (int i = 1; i < palabras.length; i++) {
            while (!palabras[i].startsWith(prefijo)) {
                prefijo = prefijo.substring(0, prefijo.length() - 1);
            }
        }
        System.out.println(prefijo);
    }
}
