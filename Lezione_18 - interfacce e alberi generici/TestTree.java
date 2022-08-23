// TestTree.java

import java.util.*; // ci serve la classe Random

// Test dell'implementazione con classe astratta degli alberi binari 
public class TestTree {
    public static void Title(String s) {
        System.out.println("--------------------------------------");
        System.out.println(s);
        System.out.println("--------------------------------------");
    }

    public static void main(String[] args) {
        Random r = new Random(); // r e' un generatore di numeri casuali
        
        // Creo un albero t con n reali casuali tra 0 e 1
        int n = 8;

        Tree<Double> t = new Leaf<Double>(); // l'albero t nasce vuoto
        for (int i = 0; i < n; i++)
            t = t.insert( r.nextDouble() );

        // metodo di stampa e calcolo del massimo
        Title("Stampa albero casuale t di " + n + " elementi");
        t.scriviOutput();
        System.out.println("\n t.max() = " + t.max() );

        // Creo un albero u inserendo sempre elementi piu' grandi, quindi sempre a destra
        Tree<Integer> u = new Leaf<Integer>();
        for (int i = 0; i < n; i++)
            u = u.insert(i);

        Title("Stampa albero u di " + n + " elementi, tutti figli destri");
        u.scriviOutput();

        // Creo un albero u inserendo sempre elementi piu' piccoli, quindi sempre a sinistra
        Tree<String> v = new Leaf<String>();
        for (int i = n-1; i >=0; i--)
            v = v.insert( "numero " + i);
        
        Title("Stampa albero v di " + n + " elementi, tutti figli sinistri");
        v.scriviOutput();

        // Provo il metodo di cancellazione
        Tree<Contatto> w = new Leaf<Contatto>();
        Contatto c = new Contatto("Cafasso", "cafasso@ristorante");
        Contatto a = new Contatto("Anfossi", "anfossi@scuola");
        Contatto d = new Contatto("Davanzo", "davanzo@comune");
        Contatto b = new Contatto("Borghi", "borghi@ditta");
        
        w = w.insert(c);
        w = w.insert(a);
        w = w.insert(d);
        w = w.insert(b);

        Title("Stampa albero w di contatti {a,b,c,d}");
        w.scriviOutput();

        Title("w senza il contatto c");
        w = w.remove(c);
        w.scriviOutput();
    }
}


