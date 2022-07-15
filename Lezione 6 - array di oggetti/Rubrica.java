// Rubrica.java

public class Rubrica {
    // Invariante: (i) una volta costruita, una rubrica non contiene nomi duplicati,
    // (ii) (0 <= numContatti <= lunghezza vettore contatti)

    private int numContatti;        // all'inizio vale 0
    private Contatto[] contatti;    // all'inizio vale null

    public Rubrica(int maxContatti) { // costruisce una rubrica con max. num. di contatti = maxContatti
        numContatti =  0;
        // all'inizio i contatti validi nella rubrica sono 0

        contatti =  new Contatto[maxContatti];
        // all'inizio tutti i contatti nella rubrica non sono validi: hanno nome e email uguali a null
    }

    public int getNumContatti() { return numContatti; }
    // non diamo un metodo get per ottenere il vettore dei contatti:
    // conoscendolo, un'altra classe potrebbe leggere e modificare i contatti in modo errato
    // (in contraddizione con l’invariante)

    public void scriviOutput() {
        int i = 0;

        System.out.println( "Num. contatti = " + numContatti);

        // Stampiamo i contatti di indice da 0 fino a numContatti-1
        // Gli altri contatti sono privi di significato
        while (i < numContatti) {
            contatti[i].scriviOutput();
            i++;
        }
    }

    // Il metodo cercaIndice(n) restituisce l'unico indice i di un contatto di nome n, se c'e',
    // restituisce numContatti se non c'e'. Il metodo cercaIndice(n) e' privato,
    // per evitare che le altre classi modifichino un contatto in contraddizione con l’invariante
    private int cercaIndice(String n) {
        int i = 0;

        // Esaminiamo i contatti di indice da 0 a numContatti-1:
        // il primo con nome n e' il contatto cercato
        while (i < numContatti) {
            if ( contatti[i].getNome().equalsIgnoreCase(n) )
                return i;
            i++;
        } // Se non troviamo n restituiamo un valore fittizio: numContatti

        return numContatti;
    }

    // usando cercaIndice(n) possiamo stabilire se il nome n e' presente nella rubrica
    public boolean presente(String n) {
        return ( cercaIndice(n) < numContatti );
    }

    // usando cercaIndice(n) possiamo trovare quale e-mail corrisponde
    // a un nome presente nella rubrica (restituiamo "" se il nome e' assente)
    public String cercaEmail(String n) {
        int i = cercaIndice(n);

        if (i < numContatti)
            return contatti[i].getEmail();
        else
            return "";
    }

    // controlliamo se una rubrica e' piena,
    // cioe' se il numContatti e' uguale al numero di elementi
    // che possiamo inserire nel vettore contatti
    public boolean piena() {
        return (numContatti == contatti.length);
    }

    // Ora possiamo definire metodi per aggiungere, rimuovere e cambiare contatti.
    // I metodi restituiscono false quando falliscono
    public boolean aggiungi(String n, String e) {
        if ( presente(n) )
            return false; //rubrica contiene n: fallimento
            
        if ( piena() )
            return false; //rubrica piena: fallimento

        contatti[numContatti] = new Contatto(n, e);
        //aggiungo il nuovo contatto nella prima posizione disponibile

        numContatti++; //aggiorno il numero degli elementi
        return true;   //successo
    }

    // Per rimuovere un contatto sposto l’ultimo contatto al posto del contatto rimosso
    public boolean rimuovi(String n) {
        int i = cercaIndice(n);

        if (i == numContatti)
            return false; // il contatto manca: fallimento

        // se invece il contatto c'e': diminuiamo di 1 il numero dei contatti
        // e spostiamo il contatto al fondo (ora irraggiungibile)
        // al posto del contatto i da cancellare.
        // Se i e' l'ultimo contatto allora i resta in fondo e non e' piu' raggiungibile.

        numContatti--;
        contatti[i] = contatti[numContatti];
        
        return true; //successo
    }

    //cerco un contatto di nome n, e se lo trovo cambio il nome a n2
    public boolean cambiaNome(String n, String n2) {
        int i = cercaIndice(n), j = cercaIndice(n2);

        if ( (i == numContatti) || (j < numContatti) )
            return false;
        // contatto con nome n non trovato,
        // oppure contatto con nome n2 trovato: fallimento

        // Altrimenti cambiamo il nome del contatto i da n a n2
        contatti[i].setNome(n2);
        
        return true;
    }

    // cerco un contatto di nome n e se lo trovo cambio la email a e2
    public boolean cambiaEmail(String n, String e2) {
        int i = cercaIndice(n);

        if (i == numContatti)
            return false;

        // contatto di nome n non trovato: fallimento.
        // Se n e' presente modifichiamo la email
        contatti[i].setEmail(e2);
    
        return true;
    }
}