// TestCast.java ESPERIMENTI SUL TIPO ESATTO DI UN OGGETTO
// tipo esatto di un oggetto = tipo C con cui l’oggetto x nasce
// x ha anche tipo (non esatto) ogni classe D che contiene C

// ricordiamo che (in UML): Bottiglia <- BottigliaConTappo

public class TestCast {
    public static void main(String[] args) {
        // usiamo questa variabile per scegliere se usare BottigliaConTappo oppure Bottiglia
        boolean tappo = true;

        Bottiglia b; // la classe più generale delle due

        // UPCAST: il passaggio a una classe SUPERIORE. E' sempre corretto
        // basta ignorare gli attributi eventualmente aggiunti dalla sottoclasse

        if (tappo)
            // UPCAST: il costruttore rende un oggetto BottigliaConTappo,
            // che assegnamo a b, che abbiamo dichiarato di tipo Bottiglia
            b = new BottigliaConTappo(10);
        else
            b = new Bottiglia(10);

        // NOTA: in ambo i casi b ha TIPO APPARENTE Bottiglia


        // DOWNCAST: passaggio a una classe INFERIORE.
        // Funziona SOLO nel caso in cui l'oggetto apparteneva GIA'
        // alla classe inferiore ed e' stato spostato nella superiore da un upcast.
        //
        // Il downcast qui sotto appare corretto al compilatore,
        // il quale non ha modo di sapere se il tipo esatto di b e`
        // Bottiglia o BottigliaConTappo. A tempo di esecuzione viene
        // fatto un controllo sul tipo esatto di b e il downcast puo' fallire
        // causando la terminazione anticipata del programma.

        BottigliaConTappo t = (BottigliaConTappo) b;
        // SE b si trovava gia' in BottigliaConTappo ed e' stato spostato
        // in Bottiglia allora il downcast ha successo e scrivo:
        System.out.println("Downcast avvenuto con successo");
        // ALTRIMENTI il programma termina con una ClassCastException

        System.out.println("t.aperta() = " + t.aperta());

        // System.out.println("b.aperta() = " + b.aperta());
        // Non possiamo scrivere b.aperta(), anche se durante l'esecuzione b = t:
        // il tipo apparente di b e' Bottiglia
    }
}


