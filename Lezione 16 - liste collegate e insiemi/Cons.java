// Cons.java LISTE NON VUOTE

// Sottoclasse concreta di List
// Sovrascriviamo tutti i metodi astratti di List.
// Gli elementi di Cons rappresentano le liste NON vuote.
// Le implementazioni sono ricorsive

public class Cons extends List {
    // Una lista (ordinata) non vuota ha due informazioni:
    
    private int elem; //primo elemento
    private List next; //indirizzo degli elementi rimanenti

    // Definisco il costruttore Cons come protected,
    // perche' consente di costruire liste non ordinate,
    // mentre vogliamo impedire a chi usa la classe di farlo.
    // Usando protected possiamo usare Cons in Nil.

    protected Cons(int elem, List next) {
        this.elem = elem;
        this.next = next;
    }

    // Override dei metodi astratti di List e del metodo toString
    // nel caso della lista NON vuota.
    public boolean empty() { return false; }
    // empty() e' costante = false sulla sottoclasse Cons,
    // e' costante = true sulla sottoclasse Nil, dunque NON e' costante su List

    public int size() { return 1 + next.size(); }
    // size() chiama ricorsivamente se stesso se next e' di classe Cons,
    // chiama il metodo size() di Nil se next e' in Nil

    public boolean contains(int x) { return x == elem || next.contains(x); }
    //Il metodo contains(x) chiama ricorsivamente se stesso se next e' di classe Cons,
    // chiama il metodo contains(x) di Nil se next e' in Nil

    // INSERT. Metodo che aggiunge x, costruisce una nuova lista
    // riutilizzando this se possibile, e preserva l'ordine crescente
    public List insert(int x) {
        if (x < elem)
            return new Cons(x, this); // se x < primo elemento aggiungo x davanti
        else if (x == elem) // se x == primo elemento lascio this invariato
            return this;
        else // se x > primo elemento aggiungo x nel resto della lista:
            return new Cons(elem, next.insert(x)); 
    }
    // Il metodo insert(x) chiama ricorsivamente se stesso se next e' in Cons,
    // chiama il metodo insert(x) su Nil se next e' in Nil

    // APPEND. Aggiunge una lista l a this,
    // costruendo una nuova lista e preservando l'ordine crescente.
    // Usiamo insert() per aggiungere il contenuto di l un elemento alla volta,
    // preservando l'ordine ad ogni passo
    public List append(List l) {
        if ( l.empty() )
            return this;
        else { // prima aggiungo il primo elemento di l, in seguito gli altri
            int x = ((Cons) l).elem;    // x = primo elemento di l
            List m = ((Cons) l).next;   // m = altri elementi di l
            return this.insert(x).append(m);
        }
    }
    // NOTA: per scrivere l.elem, l.next devo prima fare un downcast ((Cons) l)
    // dato che elem e next esistono solo in Cons.
    // Il downcast non causa errori a runtime, perche' se l non e' vuota ha tipo esatto Cons

    // TOSTRING
    public String toString() { return elem + " " + next.toString(); }
    // trasformo in String il primo elemento,
    // e concateno questa strings con l'output di toString() sul resto della lista
}
