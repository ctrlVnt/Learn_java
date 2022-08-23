// ArrayExt.java

// Questa classe definisce arrays estendibili con dimensioni
// un valore min deciso inizialmente, oppure il doppio, il quadruplo
// eccetera, a seconda di quanto spazio viene richiesto

public class ArrayExt {
    // Invariante: 0 <= size <= lunghezza vett
  
    private int size;
    //la parte effettivamente in uso del vettore, all'inizio vale 0

    private int[] vett;
    //per ora vett vale null
    
    public int getSize() { return this.size; }

    // Se min>0, questo metodo mi costruisce un vettore di min elementi con size=0.
    // La lunghezza di vett sara' min*(una potenza di 2)

    public ArrayExt(int min) {
        assert min > 0 : "Err: min negativo = " + min;
        size = 0;
        vett = new int[min];
    }

    public void scriviOutput() {
        System.out.println(" size = " + this.size);
        for (int i=0; i < size; i++)
            System.out.println(" vett[" + i + "]=" + vett[i] );
    }
  
    // Metodo di lettura dell'elemento i con 0 <= i < size
    public int get(int i) {
        assert (0 <= i) && (i < size);
        return vett[i];
    }

    // Metodo di scrittura dell'elemento i con 0 <= i < size
    public void set(int i, int x) {
        assert (0 <= i) && (i < size);
        vett[i] = x;
    }

    // Metodo per espandere il vettore quando necessario
    private void extend() {
        int[] vett1 = new int[this.vett.length*2];
        //nuovo vettore di lunghezza doppia

        for(int i=0; i<size; i++) {
            vett1[i] = vett[i];
        }
        // trascrivo il vecchio vettore nel nuovo
        // (aggiorno l'indirizzo del vettore)
        this.vett = vett1;

        assert (0 <= size) && (size <= vett.length);
    }

    // Metodo per aggiungere un elemento x in posizione 0 <= i <= size,
    // spostando di una posizione gli elementi a destra di i.
    // Puo' fungere da funzione "push".
    
    public void add(int i, int x) {
        assert (0 <= i) && (i <= size);

        if (size == vett.length) //se manca spazio
            extend(); //espando il vettore

        assert size < vett.length; //ora lo spazio c'e'

        for(int j=size-1; j>=i; j--) {
            vett[j+1] = vett[j];
        }
        // sposto avanti di una posizione gli elementi a destra di i
        // eseguo le assegnazioni nell’ordine da destra a sinistra

        vett[i] = x; // nello spazio cosi' creato aggiungo x

        size++; //aggiorno il numero degli elementi

        assert (0 <= size) && (size <= vett.length);
    }

    // Rimozione della posizione 0 <= i < size effettivamente nel vettore.
    // restituisce l'elemento rimosso e quindi puo' fungere da "pop"
    public int remove(int i) {
        assert (0 <= i) && (i < size);

        size--; //aggiorno la dimensione

        int x = vett[i];
        //salvo vett[i] in x prima di cancellarlo
        
        for (int j=i; j<=size-1; j++) {
            vett[j] = vett[j+1];
        }

        // sposto gli elementi a destra di i indietro di uno
        // eseguo le assegnazioni nell’ordine da sinistra a destra
        return x;
    }
}


  
  

  
  