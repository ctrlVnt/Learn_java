// Trapezio.java (Trapezio Isoscele)

// Sottoclasse non astratta di Poligono:
// sovrascrive i metodi per calcolare area e perimetro,
// in piu' ha attributi e metodi specifici per i trapezi isosceli: base maggiore, minore, altezza
// (il numero dei lati e' fisso a 4)

public class Trapezio extends Poligono {
    private double baseMinore;
    private double baseMaggiore;
    private double altezza;

    public Trapezio (double baseMinore, double baseMaggiore, double altezza) {
        // l'invocazione a super() DEVE essere la prima istruzione del costruttore
        super(4); // il trapezio e' un poligono con 4 lati

        assert baseMinore > 0 && baseMinore <= baseMaggiore && altezza > 0;
        
        this.baseMinore = baseMinore;
        this.baseMaggiore = baseMaggiore;
        this.altezza = altezza;
    }

    public double getBaseMinore() { return baseMinore; }
    public double getBaseMaggiore() { return baseMaggiore; }
    public double getAltezza() { return altezza; }

    public void setBaseMinore(double baseMinore) { this.baseMinore = baseMinore; }
    public void setBaseMaggiore(double baseMaggiore) { this.baseMaggiore = baseMaggiore; }
    public void setAltezza(double altezza) { this.altezza=altezza; }

    // Formula per l'area del trapezio (anche non isoscele)
    public double area() { return (baseMinore + baseMaggiore) * altezza / 2; }

    // Formula per il lato del trapezio isoscele
    public double lato() {
        return Math.sqrt(Math.pow(altezza, 2) + Math.pow((baseMaggiore - baseMinore) / 2, 2));
    }

    // Formula per il perimetro del trapezio isoscele
    public double perimetro() { return 2 * lato() + baseMinore + baseMaggiore; }
}