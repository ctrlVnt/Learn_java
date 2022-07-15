class RectBad {
    private double base;
    private double altezza;
    private double area;

    public void calcolaArea() {
        area = base * altezza;
    }

    public void setBase(double x) {
        base = x;
        calcolaArea();
    }

    public void setAltezza(double x) {
        altezza = x;
        calcolaArea();
    }

    public double getArea() {
        return area;
    }
}

public class RectDemoBad {
    public static void main(String[] args) {
        RectBad rect = new RectBad();

        rect.setBase(10);
        rect.setAltezza(5);

        System.out.println("Area = " + rect.getArea());
    }
}