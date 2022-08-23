class Rect {
    private double base;
    private double altezza;
    private double area;

    public void calcola_area() {
        area = base * altezza;
    }

    public void setBase(double x) {
        base = x;
        calcola_area();
    }

    public void setAltezza(double x) {
        altezza = x;
        calcola_area();
    }

    public double getArea() {
        return area;
    }

    public void scriviOutput() {
        System.out.println("Base=" + base + " Altezza=" + altezza + " Area=" + area);
    }
}

class RectDemoGood {
    public static void main(String[] args) {
        Rect rect1;

        rect1 = new Rect();
        rect1.setBase(10);
        rect1.setAltezza(3);
        rect1.scriviOutput();

        rect1.setAltezza(5);
        System.out.println("Area=" + rect1.getArea());
    }
}