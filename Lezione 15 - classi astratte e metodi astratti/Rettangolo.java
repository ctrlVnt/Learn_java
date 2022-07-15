// Rettangolo.java

// Sottoclasse non astratta di Poligono (e quindi di Figura)
// Rettangolo ha dei metodi "veri", non astratti,
// uno dei quali ereditato dalla classe Poligono: getLati().
// (il numero dei lati e' fisso a 4)

public class Rettangolo extends Poligono {
    private double base;
    private double altezza;

    public Rettangolo(double base, double altezza) {
        super(4);
        this.base = base;
        this.altezza = altezza;
    }

    public double getBase() { return base; }
    public double getAltezza() { return altezza; }
    
    public void setBase(double base) { this.base = base; }
    public void setAltezza(double altezza) { this.altezza=altezza; }
    
    public double area() { return base*altezza; }
    public double perimetro() { return 2*(base+altezza); }
}
