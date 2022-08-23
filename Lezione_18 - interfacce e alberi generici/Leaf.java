// ALBERI VUOTI -- unico elemento "leaf"

public class Leaf<T extends Comparable<T>> extends Tree<T> {
    // non definiamo un costruttore
    public boolean empty(){return true;}
    public boolean contains(T x){return false; }
    public T max(){assert false; return null; }
    public Tree<T> insert(T x){ return new Branch<T>(x, this, this); }
    public Tree<T> remove(T x){ return this; }
    protected void scriviOutput(String prefix, String root, String left, String right) {
        System.out.println(prefix + root + "leaf");
    }
}
