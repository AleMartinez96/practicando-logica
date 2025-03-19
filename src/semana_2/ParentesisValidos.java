package semana_2;

public class ParentesisValidos {

    /*
    Dada una cadena s que contiene únicamente los caracteres '(', ')', '{',
    '}', '[' y ']', determine si la cadena de entrada es válida.

    Una cadena de entrada es válida si:

    Los corchetes de apertura deben cerrarse con el mismo tipo de corchete.
    Los corchetes de apertura deben cerrarse en el orden correcto.
    Cada corchete de cierre tiene un corchete de apertura correspondiente del
    mismo tipo.
     */

    static boolean isValid(String s) {
        char[] caracteres = s.toCharArray();
        char[] cierre = new char[caracteres.length];
        int pos = 0;

        for (char caracter : caracteres) {
            switch (caracter) {
                case '{' -> cierre[pos++] = '}';
                case '(' -> cierre[pos++] = ')';
                case '[' -> cierre[pos++] = ']';
                default -> {
                    if (pos == 0 || cierre[--pos] != caracter) {
                        return false;
                    }
                }
            }
        }
        return pos == 0;
    }

    public static void main(String[] ignoredArgs) {
        String parentesis = "([)]";
        System.out.println(isValid(parentesis));
    }
}
