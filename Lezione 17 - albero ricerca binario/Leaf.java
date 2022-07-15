// Leaf.java unico elemento: "leaf" (albero vuoto)

// Implementazione della classe Leaf per rappresentare alberi vuoti.
// I metodi definiti in Leaf restituiscono risultati costanti che non dipendono dall'albero

public class Leaf extends Tree {
    public Leaf() { }
    // Il costruttore non fa nulla e si puo' lasciare implicito.   
    // Un albero viene inizializzato con new Leaf() ed esteso un elemento alla volta

    public boolean empty() { return true; } // l'albero vuoto e'... vuoto

    public int max() { assert false; return 0; }
    // l'albero vuoto non ha massimo, chiamare questo metodo genera un errore.
    // Java richiede un return se c'e' un tipo di ritorno, per questo scriviamo return 0;

    public boolean contains(int x) { return false; }
    // l'albero vuoto e'... vuoto

    public Tree insert(int x) { return new Branch(x, this, this); }
    // se inserisco x ottengo l'albero di radice x e nessun figlio a destra e sinistra
    // per rappresentare "Leaf()" senza creare foglie nuove scrivo "this"

    public Tree remove(int x) { return this; }
    // non c'e' nulla da cancellare nell'albero vuoto, quindi non cambia nulla


    // Metodo che gestisce la parte NON pubblica della stampa
    protected void scriviOutput(String prefix, String root, String left, String right) {
        System.out.println(prefix + root + "leaf");
    }
}




