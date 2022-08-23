

public class TestTryCatch {
    public static void m() { // solleva una IllegalStateException
        throw new IllegalArgumentException("non dovevi chiamarmi");
        // throw new RuntimeException("non dovevi chiamarmi");
    }

    public static void main(String[] args) {
        try {
            m();
            // otteniamo una IllegalArgumentException:
            // la prossima riga non viene eseguita
            System.out.println( "ce l'ho fatta! ho la risposta di m()");
        } catch (IllegalArgumentException e) {
            System.out.println("catturata IllegalArgumentException");
        } catch (Exception e) {
            // Questo catch viene raggiunto per eccezioni diverse da IllegalArgumentException
            System.out.println( "catturata eccezione " + e);
        } finally {
            // si puo' aggiungere una clausola che sara' eseguita
            // sia che arriviamo da try che da un catch
            System.out.println("clausola finale");
        }
    }
}

