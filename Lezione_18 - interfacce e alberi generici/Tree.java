// Tree.Java

// alberi di ricerca su T
public abstract class Tree<T extends Comparable<T>> {
    public abstract boolean empty(); 
    public abstract boolean contains(T x);
    public abstract T max();
    public abstract Tree<T> insert(T x);
    public abstract Tree<T> remove(T x);
    protected abstract void scriviOutput(String prefix, String root, String left, String right);
    public void scriviOutput() { scriviOutput("","___"," "," "); }
}

