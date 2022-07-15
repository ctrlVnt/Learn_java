// DieHard.java

public class DieHard {
    // Non costruiamo oggetti di classe DieHard.
    // Dunque i metodi di DieHard non vengono "inviati" a oggetti della classe
    // e devono essere dichiarati statici.

    public static void riempi(Bottiglia b) {
        //riempo fino al massimo livello consentito la bottiglia b
        b.setLivello( b.getCapacita() );
    }

    public static void svuota(Bottiglia b) {
        b.setLivello(0);
    }

    public static void travasa(Bottiglia a, Bottiglia b) {
        //calcolo quanto basta per riempire b
        int capienzaResiduaB = b.getCapacita() - b.getLivello();

        // rimuovo questa quantita da a, rimuovo tutto da a se a non basta a riempire b.
        // Aggiungo la quantita' ottenuta alla bottiglia b
        b.aggiungi( a.rimuovi(capienzaResiduaB) );
    }

    public static void descrizione(String m, Bottiglia b1, Bottiglia b2) {
        System.out.println();
        System.out.println(m);
        b1.scriviOutput();
        b2.scriviOutput();
    }

    // Una soluzione all'indovinello con le tre operazioni consentite
    public static void main(String[] args) {
        Bottiglia b3 = new Bottiglia(3);
        Bottiglia b5 = new Bottiglia(5);
        
        descrizione("Inizio", b3, b5);

        riempi(b5);
        descrizione("Riempio b5", b3, b5);
        
        travasa(b5, b3);
        descrizione("Travaso b5 su b3", b3, b5);
        
        svuota(b3);
        descrizione("Svuoto b3", b3, b5);
        
        travasa(b5, b3);
        descrizione("Travaso b5 su b3",b3, b5);
        
        riempi(b5);
        descrizione("Riempio b5", b3, b5);
        
        travasa(b5, b3);
        descrizione("Travaso b5 su b3", b3, b5);
    }
}

