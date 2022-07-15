// Inseriamo tutto nel file AnimalDemo.class

class Animal { //classe non eseguibile e non pubblica
    // Introduciamo una classe per sperimentare costruttori e metodo equals. Gli attributi sono privati.
    private String nome;
    private int eta;
    private double peso;

    // (i) Il primo COSTRUTTORE assegna valori di default privi di interesse
    public Animal() {
        nome = "nessun nome";
        eta = 0;
        peso = 0;
    }

    // Il secondo COSTRUTTORE produce un oggetto a partire da informazioni rilevanti
    public Animal(String n, int e, double p) {
        nome = n;
        eta = e;
        peso = p;
    }

  /** (ii) Metodi set e get */
    public void setAnimal(String n, int e, double p) {
        nome = n;
        eta = e;
        peso = p;
    }

    public String getNome() {
        return nome;
    }
    
    public int getEta() {
        return eta;
    }
    
    public double getPeso() {
        return peso;
    }

    public void setNome(String n) {
        nome = n;
    }

    public void setEta(int e) {
        if (e >= 0)
            eta = e;
        else
            System.out.println("L'eta' deve essere non negativa");
    }

    public void setPeso(double p) {
        if (peso >= 0)
            peso=p;
        else
            System.out.println("Il peso deve essere non negativo");
    }

    // metodo di scrittura
    public void scriviOutput() {
        System.out.println( " nome " + nome);
        System.out.println( " eta' " + eta);
        System.out.println( " peso " + peso);
    }

    // (iii) Metodo che assegna a un animale x gli attributi di un altro animale y.
    public void assegna(Animal altroAnimale) {
        this.nome = altroAnimale.nome;
        this.eta = altroAnimale.eta;
        this.peso = altroAnimale.peso;
    }
    // Questo metodo di assegnazione e' diverso da assegnare x = y;
    // nel secondo caso x e y occupano lo stesso spazio di memoria
    // sono lo stesso oggetto e ogni modifica fatta a x si ripercuote a y.

    // (iv) Metodo equals che controlla se due animali hanno gli stessi attributi.
    // Uso il metodo dinamico s.equalsIgnoreCase(s'):
    // controlla se s, s' sono uguali ignorando la differenza maiuscole/minuscole.
    // Qui s,s' sono i nomi di "this" e di "altroAnimale".
    public boolean equals(Animal altroAnimale) {
        return (this.nome.equalsIgnoreCase(altroAnimale.nome)) &&
        (this.eta == altroAnimale.eta) &&
        (this.peso == altroAnimale.peso);
    }
}

// Verifichiamo che essere uguali e' diverso dall'avere lo stesso indirizzo.
// Usiamo la classe AnimalDemo e il file AnimalDemo.java

public class AnimalDemo {
    public static void main(String[] args) {
        Animal fido = new Animal("Fido", 10, 5.0); // valori significativi

        Animal bobi = new Animal(); // valori di default

        System.out.println( "1. Fido" );
        fido.scriviOutput();

        System.out.println( "2. Bobi" );
        bobi.scriviOutput();

        // All'inizio i due oggetti sono diversi
        System.out.println("3. Fido e' uguale a Bobi? " + fido.equals(bobi) );
        
        // Se assegno il primo al secondo attributo per attributo diventano uguali attributo per attributo
        System.out.println("4. Assegno gli attributi di Fido a Bobi ");
        bobi.assegna(fido);

        System.out.println("5. Fido e' uguale a Bobi? " + fido.equals(bobi) );
        //Vero: stessi attributi

        System.out.println("6. Fido == Bobi? " + (fido==bobi) );
        // Falso: diversi indirizzi
    }
}
