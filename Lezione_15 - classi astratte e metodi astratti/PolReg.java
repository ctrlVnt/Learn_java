// PolReg.java

// Sottoclasse non astratta di Poligono (e quindi di Figura).
// Implementa i metodi area() e perimetro(),
// piu' attributi e metodi specifici per raggio, lato e apotema.

public class PolReg extends Poligono {
    private double raggio;

    public PolReg(int lati, double raggio) {
        super(lati);
        assert raggio >= 0;
        this.raggio = raggio;
    }

    public double getRaggio() { return this.raggio; }
    public void setRaggio(double raggio) { this.raggio = raggio; }
    
    // Il numero dei lati di un poligono regolare puo' cambiare.
    public void setLati(int lati) { this.lati = lati; }

    // Formula per apotema
    public double apotema() { return raggio * Math.cos(Math.PI / getLati()); }

    // Formula per lato
    public double lato() { return 2 * raggio * Math.sin(Math.PI / getLati()); }

    // Formula per perimetro
    public double perimetro() { return lato() * getLati(); }

    // Formula per area
    public double area() { return getLati() * (lato() * apotema() / 2); }

    // esempio
    public static void main(String[] args) {
        Figura E = new PolReg(6, 1.0);
        System.out.println( E.area() ); // area calcolata nella classe PolReg
    }
}

