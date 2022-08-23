// ListExt.java
// Modifichiamo MiniLinkedList della Lezione 14,
// cambiando il nome della classe e implementando le interfacce richieste

// Dichiariamo che ListExt implementa le interfacce Comparable ed Iterable.
// Questo consentira` di confrontare istanze della classe secondo l'ordine lessicografico,
// e di usare il costrutto iterativo foreach per iterare sugli elementi.
public class ListExt implements Iterable<Integer>, Comparable<ListExt> {
    private Node first;
    private int size;

    public ListExt() {
        first = null;
        size = 0;
    }
    
    public int getSize() { return this.size; }
    
    // Metodo privato node(i) = riferimento al nodo V_i
    private Node node(int i){
        assert 0 <= i && i < size;
        // creo una copia di first per non modificare l'originale
        Node p = this.first;

        while (i > 0) { //rimpiazzo per i volte: p con il nodo dopo
            assert p != null;
            p = p.getNext();
            i--;
        }

        // Dopo aver applicato p = p.getNext() per i volte abbiamo p=node(i)
        assert p != null;

        return p;
    }

    // DEFINIZIONE get(i), set(i,x), add(i,x), remove(i) usando node(i)

    // get(i) = contenuto i-esimo nodo
    public int get(int i) { return node(i).getElem(); }

    // set(i,x) assegna x al nodo i-esimo
    public void set(int i, int x) { node(i).setElem(x); }

    // add(i,x) aggiunge un nodo che contiene x in posizione i
    public void add(int i, int x) {
        assert 0 <= i && i <= size;

        if (i == 0) {
            first = new Node(x, first); // aggiungo un nodo all'inizio
        } else {
            // calcolo il nodo precedente al nodo da aggiungere
            Node prev = node(i - 1);

            //aggiungo un nodo tra prev e prev.getNext()
            prev.setNext( new Node(x, prev.getNext()) );
        }

        size++;
    }

    // remove(i) elimina il nodo i-esimo e ne restituisce il contenuto x
    public int remove(int i) {
        assert 0 <= i && i < size;
        int x;

        if (i == 0) { // Elimino first. Nuovo first = vecchio first.getNext()
            x = first.getElem();
            first = first.getNext();
        } else { // i > 0
            // Nodo prev precedente il nodo da eliminare = node(i-1)
            Node prev = node(i - 1);

            // Nodo el da eliminare = nodo che viene dopo prev
            Node el = prev.getNext();
            x = el.getElem();

            // Per eliminare el, collego prev al nodo che viene dopo el
            prev.setNext( el.getNext() );
        }
        size--;
        return x;
    }

    // Implementazione di Comparable<ListExt>:
    // confrontiamo due liste rispetto all'ordine lessicografico
    public int compareTo(ListExt lista) {
        Node p = this.first;
        Node q = lista.first;
        // p, q sono puntatori ai nodi delle due liste, che scorriamo un passo alla volta

        while ( (p != null) && (q != null) ) { 
            if (p.getElem() != q.getElem()) // le due liste sono diverse
                return p.getElem() - q.getElem();
                // valore positivo se la prima lista e' piu' grande, negativo altrimenti
            else { // avanzo lungo entrambe le liste
                p = p.getNext();
                q = q.getNext();
            }
        }

        // quando il while finisce ho esaurito almeno una delle due liste
        // trovando solo elementi uguali. Consideriamo minore la lista piu' corta
        if (p == null) {    // la prima lista e' finita
            if (q == null)  // entrambe le liste sono finite
                return 0;   // quindi sono uguali
            else            // prima lista finita ma seconda lista no
                return -1;  // la prima prima lista e' minore
            } 
        else                // prima lista NON finita,
            return +1;      // dunque seconda lista e' finita, ed e' la minore
    }

    // Implementazione di Iterable<Integer>:
    // incapsuliamo il primo elemento di ListExt in un oggetto ListIterator
    // che implementa l'interfaccia Iterator<Integer>
    public ListIterator iterator() { return new ListIterator(first); }
}


