import java.util.*; //per le interfacce

class IntervalIterator implements Iterator<Integer> {
    private Node first, last;

    public IntervalIterator(Node first,Node last) {
        this.first = first;
        this.last = last;
    }

    // [first,last[ ha almeno un nodo se first!=last e first!=null
    public boolean hasNext() {
        return first != last && first != null;
    }

    // portiamo avanti first senza cambiare last,
    // e restituiamo il contenuto del first originario
    public Integer next() {
        int elem = first.getElem();
        first = first.getNext();
        return elem;
    }
}  
