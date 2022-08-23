// CoppiaAnimali.java

public class CoppiaAnimali {
    private Animale primo;
    private Animale secondo;

    public CoppiaAnimali(String n1, int e1, double p1, String n2, int e2, double p2) {
        primo = new Animale(n1, e1, p1);
        secondo = new Animale(n2, e2, p2);
    }

    public Animale getPrimo() { return primo; }

    public Animale getSecondo() { return secondo; }

    // I METODI QUI SOTTO SONO QUELLI CORRETTI
    // Se non vogliamo consentire di modificare gli attributi dei due animali dall'esterno,
    // dobbiamo passare l'indirizzo di una copia o "clone" dei due animali, non l'indirizzo originario.
    // Metodi di clonazione:
    
    // public Animale getPrimo() {
    //    return new Animale(primo.getNome(), primo.getEta(), primo.getPeso());
    // }
    //
    // public Animale getSecondo() {
    //    return new Animale(secondo.getNome(), secondo.getEta(), secondo.getPeso());
    // }

    public void scriviOutput() {
        primo.scriviOutput();
        secondo.scriviOutput();
    }
}

