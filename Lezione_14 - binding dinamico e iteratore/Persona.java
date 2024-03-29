// Persona.java

public class Persona {
    private String nome;

    public Persona(String nome) { this.nome = nome; }
    
    public String getNome() { return this.nome; }
    
    public void setNome(String nome) { this.nome = nome; }

    // Metodo di scrittura di cui faccio OVERRIDE in ogni sottoclasse:
    // si arricchisce man mano che ci sono piu' informazioni su un oggetto
    public void scriviOutput() { System.out.println( "nome = " + this.nome); }

    // Metodo di scrittura di cui NON intendo fare OVERRIDE
    // resta uguale anche se quando sono informazioni in piu'
    public void scriviNome() { System.out.println( " nome = " + this.nome); }
    
    // (per ora i due metodi di scrittura sono identici)
}
