import java.util.Scanner;

//Specie e' una classe non pubblica e non eseguibile
//per rappresentare delle specie di esseri viventi.
//Scriveremo un programma per sperimentare Specie in una classe
//di nome SpecieDemo, e salveremo tutto nel file: SpecieDemo.java

// Classe non pubblica, deve stare nello stesso file della classe che la usa

class Specie { 
// Rendendo privati gli attributi di Specie,
// un metodo esterno alla classe non puo' più modificare direttamente gli attributi:
// nome, popolazione, tassoCrescita
    private String nome;
    private int popolazione;
    private double tassoCrescita;

    // per modificare gli attributi della classe ora e' necessario un metodo "set":
    // cosi' posso inserire un test per controllare che la modifica sia corretta

    public void setSpecie(String n, int p, double t) {
        nome = n;
        if (p < 0)
            System.out.println( "Valori negativi popolazione non accettati" );
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
        System.out.println("==========");
        System.out.println(" nome = " + nome);
        System.out.println( " popolazione = " + popolazione);
        System.out.println( " tasso crescita = " + tassoCrescita);
        System.out.println("==========");
    }

    public int predicipopolazione(int anni) {
        double p = popolazione;
        while (anni > 0) {
            p = p + p * tassoCrescita/100;
            anni--;
        }

        return (int) p; //(int) p trasforma il reale p in un intero
    }
}

    // Introduciamo una classe eseguibile SpecieDemo per sperimentare la classe Specie.
    // Proviamo a inserire i dati di una specie sia da tastiera che usando un metodo set.
    // Sperimentiamo cosa succede se assegnamo un oggetto a un altro.

    //Classe eseguibile e pubblica, deve stare in: SpecieDemo.java
    public class SpecieDemo {
        public static void main(String[] args) {
            Specie bufaloTerrestre = new Specie();

            System.out.println("BufaloTerrestre prima inserimento dati");
            bufaloTerrestre.scriviOutput();

            System.out.println("Inserisci dati BufaloTerrestre");
            bufaloTerrestre.leggiInput();

            System.out.println("Dati inseriti BufaloTerrestre");
            bufaloTerrestre.scriviOutput();

            System.out.println( "BufaloTerrestre dopo 10 anni = " + bufaloTerrestre.predicipopolazione(10));
            System.out.println();

            // altra specie
            Specie bufaloKlingon = new Specie();
            System.out.println("Inserisco dati BufaloKlingon usando set");

            // Non possiamo assegnare nome, popolazione e tasso di crescita direttamente
            // perche' questi attributi sono privati
            bufaloKlingon.setSpecie("BK", 1000, 10);

            System.out.println( "Dati inseriti BufaloKlingon" );
            bufaloKlingon.scriviOutput();

            System.out.println( "Bufalo Klingon dopo 10 anni = " + bufaloKlingon.predicipopolazione(10));
            System.out.println();

            // un esperimento:
            System.out.println( "Assegno bufaloKlingon a bufaloTerrestre");
            bufaloTerrestre = bufaloKlingon;
            bufaloTerrestre.scriviOutput();

            bufaloKlingon.scriviOutput();
        }
    }


