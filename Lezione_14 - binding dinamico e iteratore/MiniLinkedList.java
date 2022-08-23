-// MiniLinkedList.java

public class MiniLinkedList {
    private Node first;
    private int size;

    public MiniLinkedList() {
        first = null;
        size = 0;
    }
    
    public int getSize() { return this.size; }
    
    // Metodo privato node(i) = indirizzo del nodo V_i
    // Viene usato dalla classe per definire gli altri
    // Non viene reso pubblico per evitare che dall'esterno
    // sia possibile modificare i nodi della classe senza aggiornare size
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

    // get(i) = contenuto node(i)
    public int get(int i) { return node(i).getElem(); }

    // set(i,x) assegna node(i) ad x
    public void set(int i, int x){ node(i).setElem(x); }

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

    // Definiamo un metodo che incapsula una MiniLinkedList
    // in un elemento della classe MiniIterator.
    // MiniIterator consente di eseguire un ciclo for senza rendere pubblici gli indirizzi dei nodi
    public MiniIterator iterator() {
        return new MiniIterator(first);
    }
}


