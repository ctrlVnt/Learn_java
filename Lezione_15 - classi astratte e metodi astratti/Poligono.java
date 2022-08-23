// Poligono.java. Sottoclasse astratta di Figura:
// e' ancora astratta perche' non implementa dei metodi per calcolare area e perimetro,
// (ma ha degli attributi e un metodo di lettura per il numero dei lati)

public abstract class Poligono extends Figura {
    protected int lati;
    // "protected" consente di modificare "lati" in una sottoclasse di Poligono

    public Poligono(int lati) {
        // Non e' necessario invocare il costruttore della classe superiore
        // SE lo invochiamo senza argomenti, quindi omettiamo super()

        assert lati >= 3;
        this.lati = lati;
    }

    public int getLati() { return lati; }

    // In alcune sottoclassi il numero dei lati puo' cambiare ma in altre no,
    // quindi non implementiamo un metodo set()
}

