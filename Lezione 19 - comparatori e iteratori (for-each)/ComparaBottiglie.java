import java.util.*; // Per la classe Arrays

// COSA ABBIAMO FATTO: nella classe Bottiglia abbiamo sovrascritto
// il metodo compareTo(), per implementare il confronto di due bottiglie
//
// COSA OTTENIAMO IN CAMBIO: i metodi statici Arrays.sort() per ordinare un vettore di bottiglie
// e Arrays.binarysearch() per la ricerca binaria in un vettore ordinato di bottiglie
// sono disponibili per tutti gli oggetti che implementano l'interfaccia Comparable

public class ComparaBottiglie {
    public static void main(String[] args) {
        Bottiglia b1 = new Bottiglia(10);   // bottiglia vuota di capacita' 10
        Bottiglia b2 = new Bottiglia(20);   // bottiglia vuota di capacita' 20
        Bottiglia b3 = new Bottiglia(5);    // bottiglia vuota di capacita' 5
        Bottiglia b4 = new Bottiglia(15);   //bottiglia vuota di capacita' 15

        // Riempo le prime 3 bottiglie, poi le confronto in base al livello
        b1.aggiungi(3);
        b2.aggiungi(2);
        b3.aggiungi(1);

        // Confronto in base al livello
        System.out.println();
        System.out.println(" confronto b1 (3 litri) con b2 (2 litri): " + b1.compareTo(b2) );
        System.out.println(" confronto opposto: " + b2.compareTo(b1) );
        System.out.println(" confronto b1 con b1: " + b1.compareTo(b1) );
        System.out.println();

        // Ordinamento di un vettore di bottiglie in base al livello:
        // posso ordinare questo array perche' Bottiglia implementa l'interfaccia Comparable
        Bottiglia[] bottiglie = {b1, b2, b3};
        System.out.println(" Ordino e stampo {b1, b2, b3}");
        Arrays.sort(bottiglie);

        // Dato che "bottiglie" e' un vettore, posso usare la parola chiave "foreach"
        for (Bottiglia b : bottiglie)
            System.out.println(b);
        System.out.println();

        // posso eseguire la ricerca binaria della posizione di una bottiglia
        // in questo array ordinato perche' Bottiglia implementa l'interfaccia Comparable<Bottiglia>.
        // binarySearch(b) restituisce un valore negativo se b non e' presente
        System.out.println(" cerco posizione di b1 nell'array:" + Arrays.binarySearch(bottiglie, b1) );
        System.out.println(" cerco posizione di b2 nell'array:" + Arrays.binarySearch(bottiglie, b2) );
        System.out.println(" cerco posizione di b3 nell'array:" + Arrays.binarySearch(bottiglie, b3) );
        System.out.println(" cerco posizione di b4 nell'array:" + Arrays.binarySearch(bottiglie, b4) );
    }
}
