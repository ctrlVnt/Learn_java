// ALBERI VUOTI -- unico elemento "leaf"

public class Leaf<T extends Comparable<T>> extends Tree<T> {
    // non definiamo un costruttore

    public boolean empty() { return true; }
    public boolean contains(T x) { return false; }
    
    // MaxSuAlberoVuoto e' non controllata,
    // dunque se la sollevo posso scegliere se aggiungere
    // "throws MaxSuAlberoVuoto" alla segnatura di max().
    // Non sono obbligato a catturare l'eccezione.
    public T max() { // throws MaxSuAlberoVuoto {
        throw new MaxSuAlberoVuoto("max su Leaf");
    }
    // non e` piu` necessario inserire al fondo un "return 0;"
    // in quanto il compilatore Java e' a conoscenza del fatto
    // che throw causa la terminazione del metodo corrente.

    public Tree<T> insert(T x) { return new Branch<T>(x, this, this); }
    public Tree<T> remove(T x) { return this; }

    protected void scriviOutput(String prefix, String root, String left, String right) {
        System.out.println(prefix + root + "leaf");
    }
}
