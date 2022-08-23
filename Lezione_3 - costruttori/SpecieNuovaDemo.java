// salviamo tutto nel file SpecieNuovaDemo.java

import java.util.Scanner;

class SpecieNuova { //classe non eseguibile e non pubblica
    // Rendendo privati gli attributi un metodo esterno alla classe
    // non puo' piu' modificare nome, popolazione, tassoCrescita
    private String nome;
    private int popolazione;
    private double tassoCrescita;

    // per modificare gli attributi della classe ora e' necessario un metodo "set",
    // che impedisce modifiche inconsistenti
    public void setSpecie(String n, int p, double t) {
        nome = n;
        if (p < 0)
            System.out.println( "Valori negativi pop. non accettati" );
        else
            popolazione = p;
      tassoCrescita = t;
    }

    // per ottenere gli attributi della classe ora e' necessario un metodo "get"
    public String getNome() {
        return nome;
    }
    public int getPopolazione() {
        return popolazione;
    }
    public double getTassoCrescita() {
        return tassoCrescita;
    }

    // I metodi di lettura e scrittura non cambiano
    public void leggiInput() {
        Scanner tastiera = new Scanner(System.in);

        System.out.print(" nome = ");
        nome = tastiera.nextLine();

        System.out.print(" popolazione = ");
        popolazione = tastiera.nextInt();

        System.out.print(" tasso di crescita = ");
        tassoCrescita = tastiera.nextDouble();

        tastiera.close();
    }

    public void scriviOutput() {
        System.out.println(" nome = " + nome);
        System.out.println(" popolazione = " + popolazione);
        System.out.println(" tasso crescita = " + tassoCrescita);
    }

    public int prediciPopolazione(int anni) {
        double p = popolazione;
        while(anni > 0) {
            p = p + p * tassoCrescita/100;
            anni--;
        }
        return (int) p;
    }

    // Per cambiare un oggetto consigliamo di assegnare i suoi attributi.
    // Questo metodo cambia gli attributi di "altraSpecie"
    public void cambia(SpecieNuova altraSpecie) {
        altraSpecie.nome = this.nome;
        altraSpecie.popolazione = this.popolazione;
        altraSpecie.tassoCrescita = this.tassoCrescita;
    }

    // dobbiamo aggiungere un metodo per confrontare due oggetti:
    // usare == non va bene, perche' == confronta gli indirizzi dei due oggetti
    public boolean equals(SpecieNuova altraSpecie) {
        return (nome.equalsIgnoreCase(altraSpecie.nome))
            && (popolazione == altraSpecie.popolazione)
            && (tassoCrescita == altraSpecie.tassoCrescita);
    }
}

// Usiamo una classe SpecieNuovaDemo per fare esperimenti con la classe Specie
public class SpecieNuovaDemo {
//classe eseguibile pubblica
    private static void pause() {
        // questo metodo aspetta un a capo per continuare.
        // E' statico, quindi non e' legato ad una particolare istanza della classe.

        Scanner tastiera = new Scanner(System.in);

        System.out.println("..... premi a capo per continuare");
        tastiera.nextLine();
    }

    public static void main(String[] args) {
        SpecieNuova specieTerrestre = new SpecieNuova();// primo oggetto
        System.out.println("\n 1. Inserisco specieTerrestre usando un metodo set()");

        // Non possiamo assegnare nome, popolazione e tasso di crescita direttamente
        // perche' questi attributi sono privati. Usiamo il metodo set() appositamente progettato.
        specieTerrestre.setSpecie( "Bufalo Nero", 500, 3);

        System.out.println("\n 2. Dati inseriti specieTerrestre");
        specieTerrestre.scriviOutput();

        pause();

        SpecieNuova specieKlingon = new SpecieNuova(); //secondo oggetto
        System.out.println("\n 3. Inserisco specieKlingon usando un metodo set()");
        specieKlingon.setSpecie( "Bufalo Klingon" ,1000, 10);

        System.out.println("\n 4. Dati inseriti specieKlingon");
        specieKlingon.scriviOutput();

        pause();

        System.out.println("\n 5. Assegno specieterrestre = specieKlingon");
        specieTerrestre = specieKlingon;

        System.out.println("Ho identificato i due oggetti, ora valgono:");
        specieTerrestre.scriviOutput();
        specieKlingon.scriviOutput();

        System.out.println("\n 6. Per rendermi conto che i due oggetti sono identificati: ");
        System.out.println("se modifico la specie terrestre in Elefante modifico anche il Klingon");
        specieTerrestre.setSpecie("Elefante", 100, 2);
        specieTerrestre.scriviOutput();
        specieKlingon.scriviOutput();

        pause();

        System.out.println("\n 7. Vediamo ora il modo corretto di modificare gli oggetti");
        System.out.println("Creo \"specieAfricana\" e le assegno i valori Elefante");
        SpecieNuova specieAfricana = new SpecieNuova(); //terzo oggetto
        // copio gli attributi da specieTerrestre a specieAfricana
        specieTerrestre.cambia(specieAfricana);
        specieAfricana.scriviOutput();

        pause();

        System.out.println("\n 8. I primi due oggetti sono lo stesso: (specieTerrestre == specieKlingon) vale : "
            + (specieTerrestre == specieKlingon) );
        // vero, sono lo stesso indirizzo

        System.out.println("\n 9. Invece il primo e il terzo oggetto no: (specieTerrestre == specieAfricana) vale : "
            + (specieTerrestre == specieAfricana) );
        // falso, hanno gli stessi valori ma non lo stesso indirizzo

        System.out.println( "\n 10. Pero' il primo e il terzo oggetto hanno gli stessi attributi: (specieTerrestre.equals(specieAfricana)) vale : "
            + (specieTerrestre.equals(specieAfricana)));
        // vero, hanno gli stessi valori, anche se indirizzo diverso
        
        pause();

        System.out.println("\n 11. Una controprova: modifico la specie Africana in Elefante Africano.");
        specieAfricana.setSpecie("Elefante Africano", 100, 2);
        specieAfricana.scriviOutput();

        System.out.println("\n 12. NON modifico anche la specie Klingon perche' i due oggetti hanno indirizzi diversi: ");
        specieKlingon.scriviOutput();
    }
}

