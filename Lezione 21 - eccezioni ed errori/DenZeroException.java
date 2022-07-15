class DenZeroException extends Exception { // controllata
    private int den; // den viene rifiutato quanto den <= 0
    public DenZeroException(int den) { this.den = den; }
    public int getDen() { return den; }
}


