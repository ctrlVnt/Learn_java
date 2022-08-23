// Leaf.java unico elemento (diverso da null): "leaf" (albero vuoto)

public class Leaf extends Tree {
    public boolean empty(){ return true; } // l'albero vuoto e'... vuoto

    public void inOrder() {}
    public void preOrder() {}
    public void postOrder() {}

    public String livello(int n) { return ""; }
    public void livello() {}

    public int leavesAt(int n) {
        if (n == 0)
            return 1;
        else
            return 0;
    }

    // Metodo ausiliario che gestisce la parte NON pubblica della stampa.
    protected String toStringAux(String prefix, String root, String left, String right) {
        return prefix + root + "leaf";
    }
}

