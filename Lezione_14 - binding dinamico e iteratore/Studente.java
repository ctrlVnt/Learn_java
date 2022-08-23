// Studente.java

public class Studente extends Persona {
    // Su uno studente abbiamo informazioni in piu' che su una persona generica
    private int matricola;

    public Studente(String nome, int matricola) {
        super(nome);
        this.matricola = matricola;
    }

    public int getMatricola() { return this.matricola; }
    
    public void setMatricola(int matricola){ this.matricola = matricola; }

    // OVERRIDE del metodo scriviOutput(): stampo le informazioni in piu'
    public void scriviOutput() {
        super.scriviOutput();
        System.out.println(" matricola = " + matricola);
    }

    // non facciamo override del metodo scriviNome(), che quindi ereditiamo
}