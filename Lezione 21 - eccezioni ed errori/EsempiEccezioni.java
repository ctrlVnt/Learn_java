// EsempiEccezioni.java
// Per diverse eccezioni comuni scriviamo un metodo che solleva quella eccezione

public class EsempiEccezioni {
    public static void test_ArithmeticException() {
        System.out.println(1 / 0);
    }

    public static void test_ClassCastException() {
        Object obj = "ciao";
        Float f = (Float) obj;
    }
    // non e' possibile convertire String a Float

    public static void test_NumberFormatException () {
        Integer.parseInt("ciro");
    }
    // parseInt() trasforma una stringa in un intero, ma "ciao" non rappresenta un intero

    public static void test_IndexOutOfBoundsException() {
        int[] a = new int[10];
        a[10] = 0;
    }
    // a[10] non esiste

    public static void test_NullPointerException() {
        Object obj = null;
        System.out.println( obj.toString() );
    }
    // Non possiamo mandare un metodo dinamico a null

        public static void main(String[] args) {
            // Ognuna delle prossime righe solleva una eccezione
            test_ArithmeticException();
            // test_ClassCastException();
            // test_NumberFormatException();
            // test_IndexOutOfBoundsException();
            // test_NullPointerException();
        }
    }
    