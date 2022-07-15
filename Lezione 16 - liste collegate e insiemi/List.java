// List.java
// Liste crescenti di interi per rappresentare insiemi.

// INVARIANTE della classe: gli elementi della lista sono in ordine crescente
// La classe astratta "Lista" elenca i metodi che voglio definire.
// Le sottoclassi concrete Nil, Cons realizzano questi metodi nei vari casi:
// Nil: una lista con zero elementi (vuota)
// Cons: una lista con almeno un elemento

public abstract class List {
    // Zero costruttori per List.
    // Tutti i metodi di List sono astratti.
    // Elenco dei metodi astratti di List da sovrascrivere

    public abstract boolean empty();            // controllo se this e' vuota
    public abstract int size();                 // numero elementi di this
    public abstract boolean contains(int x);    // controllo se x e' contenuto in this
    public abstract List insert(int x);         // nuova lista = this unione {x}
    public abstract List append(List l);        // nuova lista = this unione l
    public abstract String toString();          // rappresentazione della liste come stringa

    // Tutti i metodi di tipo List costruiscono una nuova lista
    // senza modificare this e la lista in input
}

