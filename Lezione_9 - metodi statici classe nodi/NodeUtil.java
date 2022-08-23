// NodeUtil.java

public class NodeUtil {
    //0. STAMPA dei nodi della lista in ordine inverso (vedi Lezione 8)
    public static void scriviOutput(Node p) {
        while (p != null) {
            System.out.println( p.getElem() );
            p = p.getNext();
        }
    }

    //1. Length. Metodo che calcola la lunghezza di una lista.
    public static int length(Node p) {
        int l = 0;

        while (p !=null) {
            l++;
            //ogni volta che incontro un nodo incremento di 1 la lunghezza
            p = p.getNext();
        }

        return l;
    }

    // versione ricorsiva del metodo (1) qui sopra
    public static int length_rec(Node p) {
        if (p == null)
            return 0;
        else
            return 1 + length_rec( p.getNext() );
    }

    // 2. Sum. Somma degli elementi di una lista.
    public static int sum(Node p) {
        int s = 0;

        while (p != null) {
            s = s + p.getElem();
            // ogni volta che incontro un nodo ne aggiungo il contenuto alla somma
            p = p.getNext();
        }

        return s;
    }

    // versione ricorsiva del metodo (2) qui sopra
    public static int sum_rec(Node p) {
        if (p == null)
            return 0;
        else
            return p.getElem() + sum_rec( p.getNext() );
    }

    // 3. Max. Massimo degli elementi di una lista non nulla
    // (non definito per la lista vuota)
    public static int max(Node p) {
        assert p != null: "Err. Massimo di una lista vuota";

        // m = massimo dei nodi gia' visti, all’inizio m=nodo in cima
        int m = p.getElem();

        p = p.getNext();
        while (p !=null) {
            // a  passo prendo il massimo tra m (max nodi gia' visti) // e il nodo corrente.
            m = Math.max( m, p.getElem() );
            p = p.getNext();
        }

        //alla fine m e' il massimo tra tutti i nodi
        return m;
    }

    // versione ricorsiva del metodo (3) qui sopra
    public static int max_rec(Node p) {
        assert p != null: "Err. Massimo di una lista vuota";

        if (p.getNext() == null)
            return p.getElem();
        else
            return Math.max( p.getElem(), max_rec(p.getNext()) );
    }

    // 4. Member. Metodo che controlla se x dato compare in una lista p.
    public static boolean member(Node p, int x) {
        while (p != null) {
            // ad ogni passo, se trovo x restituisco "true"
            if (p.getElem() == x)
                return true;
        
            p = p.getNext();
        }
        //se ho esaurito la lista senza trovare x, allora x non c'e'
        return false;
    }

    // versione ricorsiva
    public static boolean member_rec(Node p, int x) {
        if (p == null)
            return false;
        else if (p.getElem() == x)
                return true;
        else
            return member_rec(p.getNext(), x);
    }

    // 5. String toString(Node p) restituisce una stringa
    // con i nodi di p scritti in ordine inverso
    public static String toString(Node p) {
        String s = " ";
        while (p != null) {
            s = s + p.getElem() + " - ";
            p = p.getNext();
        }
        return s;
    }

    // 6. Sorted(Node p) verifica se una lista concatenata
    // e' ordinata in modo (debolmente) decrescente
    public static boolean sorted(Node p) {
        if (p == null)
            return true; //lista vuota: ordinata

        while (p.getNext() != null) {
            // se (penultimo elemento > ultimo elemento): lista non ordinata
            if (p.getNext().getElem() > p.getElem() )
                return false;
            p = p.getNext();
        }

        //finita la lista, non c'e' un elemento > del seguente => lista ordinata
        return true;
    }

    // 7. equals(Node p, Node q) verifica se due liste concatenate sono uguali
    public static boolean equals(Node p, Node q) {
        while ( (p != null) && (q != null )) {
            // se trovo due elementi in posizioni uguali e diversi => p,q sono diverse
            if ( p.getElem() != q.getElem() )
                return false;
            p = p.getNext();
            q = q.getNext();
        }

        // finito il while abbiamo p=null oppure q=null. Quindi:
        // se p,q sono lo stesso indirizzo, allora p,q=null sono uguali
        // se p,q sono indirizzo diversi, allora uno e' null e l'altro no
        return (p == q);
    }

    public static void main(String[] args) {
        System.out.println("Le stampe sono tutte in ordine inverso");
        System.out.println("---------------------");

        Node q = new Node(1, null);
        q = new Node(2, q);
        q = new Node(3, q);
        q = new Node(4, q);
        System.out.println("Lista q:");
        scriviOutput(q);
        System.out.println("---------------------");

        Node p = new Node(3, q);
        p = new Node(2, p);
        p = new Node(1, p);
        System.out.println("Lista p:");
        scriviOutput(p);
        System.out.println("---------------------");

        System.out.println("1. length(p) = " + length(p) );
        System.out.println( "1. length_rec(p) = " + length_rec(p));
        System.out.println("---------------------");

        System.out.println( "2. sum(p) = " + sum(p) );
        System.out.println( "2. sum_rec(p) = " + sum_rec(p) );
        System.out.println("---------------------");

        System.out.println( "3. max(p) = " + max(p) );
        System.out.println( "3. maxr_rec(p) = " + max_rec(p) );
        System.out.println("---------------------");

        System.out.println( "4. member(p,3) = " + member(p,3) );
        System.out.println( "4. member(p,5) = " + member(p,5) );
        System.out.println( "4. member_rec(p,3) = " + member_rec(p,3) );
        System.out.println( "4. member_rec(p,5) = " + member_rec(p,5) );
        System.out.println("---------------------");

        System.out.println( "5. toString(q) = " + toString(q) );
        System.out.println( "5. toString(p) = " + toString(p) );
        System.out.println("---------------------");

        System.out.println( "6. sorted(q) = " + sorted(q) );
        System.out.println( "6. sorted(p) = " + sorted(p) );
        System.out.println("---------------------");

        System.out.println( "7. equals(p,q) = " + equals(p,q) );
        System.out.println( "7. equals(p,p) = " + equals(p,p) );
        System.out.println( "7. equals(q,q) = " + equals(q,q) );
        System.out.println( "7. equals(q,p) = " + equals(q,p) );
        System.out.println("---------------------");
    }
}
