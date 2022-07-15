// Cerchio.java: Sottoclasse non astratta di Figura
// Sovrascrive area() e perimetro(),
// ha un attributo e metodi specifici per il raggio del cerchio.

public class Cerchio extends Figura {
    private double raggio;

    public Cerchio(double raggio) {
        assert raggio >= 0;
        this.raggio = raggio;
    }

    public double getRaggio() { return raggio; }

    public void setRaggio(double raggio) {
        assert raggio >= 0;
        this.raggio = raggio;
    }

    // PI * R^2
    public double area() { return Math.PI * raggio * raggio; }

    // 2 * PI * R
    public double perimetro(){return 2 * Math.PI * raggio; }
}