import java.util.*;

public class ProvaFrazione {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean done = false;
        int n, d;

        Frazione f = new Frazione(); // f = default = 1/1
    
        // Frazione f2 = Frazione.create(2, 3);
        // NO: solleva come eccezione: "unreported exception",
        // non ho catturato DenZeroException

        while (!done) {
            try {
                System.out.println("Inserisci il numeratore:");
                n = scanner.nextInt();

                System.out.println("Inserisci il denominatore:");
                d = scanner.nextInt();

                f = Frazione.create(n, d); // posso usare create solo dentro try{}

                done = true;
            } catch (DenZeroException err) { // Se leggo un d<=0 chiedo di nuovo
                System.out.println("Den. " + err.getDen() + "<= 0. Inserisci ancora:");
            }
            System.out.println("Hai inserito " + f);
        }
    }
}
