// Bottiglia.java

// Versione con: uso assert, "this" omesso ove possibile, metodi get() e set().
// Per evitare modifiche alla capacita', non forniamo un metodo set() per la capacita'.

public class Bottiglia {
    // Nota: quantita' intere espresse in galloni
    private int capacita;   // 0 <= capacita
    private int livello;    // 0 <= livello <= capacita'

    public Bottiglia(int capacita) {
        this.capacita = capacita;
        livello = 0;

        assert (0<=livello) && (livello <= capacita);
    }
    // Qui l'uso di this e` fondamentale se vogliamo usare la variabile capacita
    // sia come argomento del metodo che come attributo

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

    // min e' un metodo statico della classe Math,
    // quindi fuori dalla classe Math lo indico con Math.min .
    // Rimuoviamo da una bottiglia una quantita' richiesta se c'e',
    // altrimenti togliamo tutto (dunque il minimo tra la quantita' richiesta e il livello).
    // Restituiamo la quantita' rimossa (che puo' essere meno della richiesta)
    public int rimuovi(int quantita) {
        assert quantita >= 0: "la quantita' doveva essere >=0 invece vale " + quantita;

        int rimossa = Math.min(quantita, livello);

        livello = livello - rimossa;

        assert (0<=livello) && (livello <= capacita);
        
        return rimossa;
    }

    public int getCapacita() { return this.capacita; }

    public int getLivello() { return this.livello; }

    // Non consentiamo di cambiare la capacita'
    public void setLivello(int livello) {
        assert (0<=livello) && (livello <= capacita);
        this.livello = livello;
    }

    public void scriviOutput() {
        System.out.println(livello + "/" + capacita);
    }
}
