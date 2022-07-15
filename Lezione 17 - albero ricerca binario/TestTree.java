// TestTree.java
import java.util.*; // ci serve la classe Random

public class TestTree {
    public static void main(String[] args) {
        Random r = new Random(); // r e' un generatore di numeri casuali

        // Creo un albero t che contiene n numeri interi casuali tra 0 e (n-1)
        // (gli interi estratti piu' volte compaiono una volta sola,
        // altri interi non compariranno affatto)
        int n = 8;

        Tree t = new Leaf(); // L'albero t nasce vuoto
        for (int i = 0; i < n; i++)
            t = t.insert( r.nextInt(n) );

        System.out.println("\nStampa albero casuale t di al piu' " + n + " elementi:\n");
        t.scriviOutput();
        System.out.println("\n t.max() = " + t.max() );

        // Creo un albero u inserendo sempre elementi piu' grandi, quindi a destra
        Tree u = new Leaf();
        for (int i = 0; i < n; i++)
            u = u.insert(i);

        System.out.println("\nStampa albero u di " + n + " elementi, tutti figli destri:\n");
        u.scriviOutput();

        // Creo un albero u inserendo sempre elementi piu' piccoli, quindi a sinistra
        Tree v = new Leaf();
        for (int i = n-1; i >=0; i--)
            v = v.insert(i);
            
        System.out.println("\nStampa albero v di " + n + " elementi, elementi, tutti figli sinistri:\n");
        v.scriviOutput();

        Tree w = new Leaf();
        w = w.insert(3);
        w = w.insert(1);
        w = w.insert(4);
        w = w.insert(2);

        System.out.println("\nStampa albero w con insieme nodi={1,2,3,4}:\n");
        w.scriviOutput();

        System.out.println("\nw senza il nodo 3:\n");
        w = w.remove(3);
        w.scriviOutput();
    }
}


