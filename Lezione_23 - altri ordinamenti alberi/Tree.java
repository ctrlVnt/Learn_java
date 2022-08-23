// Tree.java

public abstract class Tree {
    // Test se l'albero e' vuoto
    public abstract boolean empty();

    //stampa i nodi in pre-ordine: radice-sinistra-destra
    public abstract void preOrder();

    //stampa i nodi in in-ordine: sinistra-radice-destra
    public abstract void inOrder();

    //stampa i nodi in post-ordine: sinistra-destra-radice
    public abstract void postOrder();

    // Metodo che restituisce il livello numero n sotto forma di stringa
    public abstract String livello(int n);

    // Metodo che stampa per livelli
    public abstract void livello();

    // Metodo leavesAt(n) che calcola il numero di foglie
    // di un albero a distanza n dalla radice, per n>=0
    public abstract int leavesAt(int n); // n >= 0

    protected abstract String toStringAux(String prefix, String root, String left, String right);
    // Metodo ausiliario che gestisce la parte NON pubblica della stampa.

    public String toString() { return toStringAux("","___"," "," "); }
    // Metodo pubblico di stampa, dall'alto verso il basso,
    // con i sottoalberi disegnati piu' a destra dell'albero di cui fan parte 
}
