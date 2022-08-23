import java.io.*; // per le IOException

public class TestError {
    public static void m1() {
        throw new Error("mio errore preferito");
    }
    // Error e' non controllato, non devo scrivere throws

    public static void m2() throws IOException {
        throw new IOException("la mia IO exception");
    }
    // IOException e' controllato, devo scrivere throws

    public static void m3() {
        throw new RuntimeException("la mia runtime exception");
    }
    //RuntimeException e' non controllata, non devo scrivere throws

    public static void main(String[] args) {

        try {
            m1();
            m2();
            m3();
        } catch (Throwable e) { // catturo tutti gli errori o eccezioni
            System.out.println("Captured: " + e);
        }
    }
}
