class Rect {
    private double base;
    private double altezza;
    private double area;


    public Rect() {
    }

    public Rect(double lato) {
        this.base = lato;
        this.altezza = lato;
        calcola_area();
    }

    public Rect(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
        calcola_area();
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

class RectDemoBetter {
    public static void main(String[] args) {
        Rect rect1, rect2, rect3;

        rect1 = new Rect();
        rect1.scriviOutput();

        rect2 = new Rect(5.0);
        rect2.scriviOutput();

        rect3 = new Rect(10.0, 5.0);
        rect3.scriviOutput();
    }
}