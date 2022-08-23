// Classe Animale: animali di cui e' noto nome, eta' e peso
// abbiamo un costruttore, metodi get e set, metodo di stampa

public class Animale {
    private String nome;
    private int eta;
    private double peso;

    public Animale(String nome, int eta, double peso) {
        this.nome = nome;
        this.eta = eta;
        this.peso = peso;
    }

    public String getNome() { return nome; }
    public int getEta() { return eta; }
    public double getPeso() { return peso; }

    public void setNome(String nome) { this.nome = nome; }
    public void setEta(int eta) { this.eta = eta; }
    public void setPeso(double peso) { this.peso = peso; }

    public void scriviOutput() {
        System.out.println(" nome=" + nome + " eta=" + eta + " peso=" + peso);
    }
}
