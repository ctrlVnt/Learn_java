// Salveremo il tutto nel file: CaneDemo.java

import java.util.Scanner; //Usiamo la classe Scanner (Java utility)

class Cane // Classe non pubblica, utilizzabile solo all'interno dello stesso file
{
    public String nome;
    public String razza;
    public int anni;
    
// Metodi dinamici publici: se senza argomenti, si scrivono: public tipo metodo() {... ...}

    public void leggiInput() { //metodo dinamico
        Scanner tastiera = new Scanner(System.in);
        // Definisco un nuovo oggetto "tastiera" di tipo Scanner,
        // capace di tradurre un input in caratteri inviato da tastiera
        // nella sua rappresentazione Java.
        // Il metodo nextLine() richiede una riga di input da tastiera
        // e restituisce la rappresentazione Java di una stringa.

        System.out.print( " nome = " );
        nome = tastiera.nextLine();

        System.out.print( " razza = " );
        razza = tastiera.nextLine();

        System.out.print( " anni = " );
        anni = tastiera.nextInt();

        tastiera.close();
    }

    public void scriviOutput() { //metodo dinamico
        System.out.println( " nome = " + nome);
        System.out.println( " razza = " + razza);
        System.out.println( " anni = " + anni);
    }

    // Trasforma gli anni di un cane in corrispondenti per l'uomo.
    // Contiamo 11 anni ciascuno i primi due anni, e 5 anni ogni altro anno
    public int GetEtaInAnniUmani() { //metodo dinamico
        if (anni <= 2)
            return anni*11;
        else
            return 22 + (anni-2)*5;
    }
}



// Il primo esempio di un programma che usa classi definite da noi.
// CaneDemo ha un main, quindi è un programma, e usa la classe Cane.
// La classe Cane deve: (1) trovarsi nello stesso file del programma
// e non essere pubblica (è la nostra scelta),
// oppure (2) trovarsi in un file di nome Cane.java della stessa cartella ed essere pubblica.


// public class CaneDemo: quindi la classe CaneDemo può essere usata da classi in altri files,
// e deve essere salvata nel file CaneDemo.java
 
public class CaneDemo {
    //Una classe è eseguibile se ha un main, come questo:
    public static void main(String[] args) {
        Cane fido = new Cane();
        // Il comando C x = new C(); definisce un nuovo oggetto x di tipo C
        // con valori di default per gli attributi.
        // Nel caso di un cane: null, null, 0 per gli attributi: nome, razza, anni

        System.out.println("fido prima dell'inserimento dei dati" );
        fido.scriviOutput(); // stampo i valori di default: null,null,0

        System.out.println("Inserisci dati fido" );
        fido.leggiInput();

        System.out.println("Dati inseriti fido" );
        fido.scriviOutput();
        
        System.out.println( "età fido in anni umani " + fido.GetEtaInAnniUmani());

        // un altro cane
        Cane bobi = new Cane();
        System.out.println( "Inserisco dati bobi da dentro il programma" );

        /*bobi.nome = "Bobi";
        bobi.razza = "Terrier";
        bobi.anni = 5;
        bobi.scriviOutput();*/

        System.out.println("bobi prima dell'inserimento dei dati" );
        bobi.scriviOutput(); // stampo i valori di default: null,null,0

        System.out.println("Inserisci dati bobi" );
        bobi.leggiInput();

        System.out.println("Dati inseriti bobi" );
        bobi.scriviOutput();
    }
}