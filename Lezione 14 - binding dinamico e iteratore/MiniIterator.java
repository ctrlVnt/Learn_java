// MiniIterator.java.
// Classe che consente di traversare una lista senza rendere pubblici gli indirizzi dei nodi
// (con un numero "size" di applicazioni di getNext())

public class MiniIterator {
    private Node next; // next = prossimo nodo da "visitare"

    public MiniIterator(Node first) { next = first; }

    public boolean hasNext() { return next != null; }

    public int next() {
        assert hasNext();

        int x = next.getElem();
        next = next.getNext();
        return x;
    }
}

