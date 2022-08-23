// ListIterator.java
// Implementatione di Iterator<Integer>

import java.util.*;

// ListIterator incapsula un riferimento ad un nodo

public class ListIterator implements Iterator<Integer> {
    private Node next;

    public ListIterator(Node next) { this.next = next; }

    // per implementare Iterator<Integer> occorre fornire:
    // 1. un metodo boolean hasNext() che ci dice se esiste un prossimo elemento
    // 2. un metodo Integer next() che avanza next al prossimo elemento e ne restituisca il valore

    public boolean hasNext() {return next != null; }

    public Integer next() {
        int x = next.getElem(); // contenuto del prossimo nodo
        next = next.getNext();  // indirizzo del nodo successivo
        return x; // x viene automaticamente convertito in un oggetto di classe wrapper Integer
    }
} 
