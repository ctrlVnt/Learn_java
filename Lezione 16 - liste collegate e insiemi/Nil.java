// Nil.java LISTE VUOTE
// Sottoclasse concreta di List:
// sovrascriviamo tutti i metodi astratti di List.

public class Nil extends List {
    // Costruttore di default new Nil()
    // Facciamo override dei metodi astratti di List e il metodo toString nel caso della lista vuota 

    public boolean empty() { return true; }
    // empty() e' costante = true sulla sottoclasse Nil,
    // e' costante = false sulla sottoclasse Cons, dunque NON e' costante su List

    public int size() { return 0; }
    /// size() e' costante = 0 sulla sottoclasse Nil,
    // NON e' costante sulla sottoclasse Cons, dunque NON e' costante su List

    public boolean contains(int x) { return false; }
    // contains(x) e' costante = false sulla sottoclasse Nil,
    // NON e' costante sulla sottoclasse Cons, dunque NON e' costante su List 

    // INSERT. Metodo che aggiunge x ad una lista
    // Quando aggiungo un elemento costruisco una nuova lista non vuota,
    // dunque un'istanza della sottoclasse concreta Cons.
    public List insert(int x) { return new Cons(x, this); }
    // NOTA: qui this indica l'unico elemento della classe Nil, la lista vuota.
    // Evitando di scrivere new Nil() riutilizzo la precedente istanza della lista vuota.

    // L'unione di una lista vuota e di l e' l.
    // Restituendo l stessa evito di definire un clone di l e risparmio memoria.
    public List append(List l) { return l; }

    // TOSTRING. Sovrascrivo il metodo toString() (che fa parte di ogni classe)
    // per definire una stringa (vuota) che rappresenta la lista vuota
    public String toString() { return ""; }
}


