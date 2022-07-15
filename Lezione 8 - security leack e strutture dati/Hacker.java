// Hacker.java (vediamo come aggirare i divieti di scrittura)

public class Hacker {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Definisco Fido e Bobi:");

        CoppiaAnimali c = new CoppiaAnimali("Fido", 3, 5.0, "Bobi", 2, 4.0);
        c.scriviOutput();
        System.out.println();

        System.out.println("Chiedo una copia dell'indirizzo di Fido:");
        Animale f = c.getPrimo();
        f.scriviOutput();
        System.out.println();

        System.out.println("Anche con una copia dell'indirizzo posso modificare Fido:");
        f.setNome("XXX");
        c.scriviOutput();

        System.out.println();
    }
}

