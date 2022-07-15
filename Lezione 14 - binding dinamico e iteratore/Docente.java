// Docente.java

public class Docente extends Persona {
    // Su un docente abbiamo delle informazioni in piu' che su una persona generica
    private String corso;
    
    public Docente(String nome, String corso) {
        super(nome);
        this.corso = corso;
    }
    
    public String getCorso() { return this.corso; }
    
    public void setCorso(String corso) { this.corso = corso; }

    //OVERRIDE del metodo scriviOutput(): stampo le informazioni in piu'
    
    public void scriviOutput() {
        super.scriviOutput();
        System.out.println( " corso = " + this.corso);
    }

    // non facciamo override del metodo scriviNome(), che quindi ereditiamo
}
