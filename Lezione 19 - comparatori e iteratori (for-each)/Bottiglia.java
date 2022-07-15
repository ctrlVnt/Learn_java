// Bottiglia.java

public class Bottiglia implements Comparable<Bottiglia> {
    private int capacita;   // 0 <= capacita
    private int livello;    // 0 <= livello <= capacita'

    public Bottiglia(int capacita) {
        this.capacita = capacita;
        livello = 0;

        assert (0 <= livello) && (livello <= capacita);
    }

    // aggiungiamo tutta la parte di una quantita' data che trova posto nella bottiglia
    // (dunque il minimo tra la quantita' data e la capacita' residua).
    // Restituiamo la quantita che abbiamo aggiunto (che puo' essere meno della richiesta)
    public int aggiungi(int quantita) {
        assert quantita >= 0: "la quantita' doveva essere >=0 invece vale " + quantita;
        int aggiunta = Math.min(quantita, this.capacita - this.livello);
        livello = livello + aggiunta;
        assert (0 <= livello) && (livello <= capacita);
        return aggiunta;
    }

    // Rimuoviamo da una bottiglia una quantita' richiesta se c'e',
    // altrimenti togliamo tutto (dunque il minimo tra la quantita' richiesta e il livello).
    // Restituiamo la quantita' rimossa (che puo' essere meno della richiesta)
    public int rimuovi(int quantita) {
        assert quantita >= 0: "la quantita' doveva essere >=0 invece vale " + quantita;
        int rimossa = Math.min(quantita, livello);
        livello = livello - rimossa;
        assert (0 <= livello) && (livello <= capacita);
        return rimossa;
    }

    public int getCapacita() { return this.capacita; }

    public int getLivello() { return this.livello; }

    // Non consentiamo di cambiare la capacita'
    public void setLivello(int livello) {
        assert (0 <= livello) && (livello <= capacita);
        this.livello = livello;
    }

    public String toString() {
        return livello + "/" + capacita;
    }

    public int compareTo(Bottiglia b) { return this.livello - b.livello; }
    // L'esito del confronto e' 0 se le bottiglie hanno lo stesso livello,
    // e' > 0 se this ha livello maggiore del livello di b, e' < 0 altrimenti.
    // Nota: il valore di ritorno è la differenza di livello, ma compareTo()
    // richiede solo che il segno del valore di ritorno sia corretto.
}
