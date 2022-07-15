class Rect {
    private double base;
    private double altezza;
    private double area;

    public Rect() {
    }

    public Rect(double lato) {
        this(lato, lato);
    }

    public Rect(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
        calcola_area();
    }

    public boolean equals(Rect altroRect) {
        // return (this.base == altroRect.base) && (this.altezza == altroRect.altezza);
        return this.area == altroRect.area;
    }

    private void calcola_area() {
        this.area = this.base * this.altezza;
    }

    public void setBase(double base) {
        this.base = base;
        calcola_area();
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
        calcola_area();
    }

    public double getArea() {
        return this.area;
    }

    public void scriviOutput() {
        System.out.println("Base=" + this.base + " Altezza=" + this.altezza + " Area=" + this.area);
    }
}

public class RectDemoBest {
    public static void main(String[] args) {
        Rect rect1, rect2;

        rect1 = new Rect(4.0);
        rect1.scriviOutput();

        rect2 = new Rect(4.0, 4.0);
        rect2.scriviOutput();

        assert rect1.getArea() == rect2.getArea() : "NON CI SIAMO";
    }
}