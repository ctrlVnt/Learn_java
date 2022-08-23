class Frazione {
    private int num;
    private int den;

    public Frazione() {
        num = 1;
        den = 1;
    }

    private Frazione(int n, int d) {
        num = n;
        den = d;
    }
    
    public static Frazione create(int n, int d) throws DenZeroException {
        if (d <= 0)
            throw new DenZeroException(d);

        return new Frazione(n, d);
    }
    // DenZeroException e' una eccezione controllata:
    // se la sollevo sono obbligato ad aggiungere "throws DenZeroException"
    // alla segnatura di create, e sono obbligato a catturare l'eccezione.

    public String toString() {return num + "/" + den; }
}

