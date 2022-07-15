//salveremo tutto nel file: OracoloDemo.java

import java.util.Scanner;

class Oracolo { //classe non eseguibile e non pubblica
    private String vecchiaRisposta = "la risposta e' dentro di te";
    private String nuovaRisposta;
    private String domanda;

    private Scanner tastiera = new Scanner(System.in);

    public void parla() {
        String continua = "si";
        while ( continua.equalsIgnoreCase( "si" ) ) {
            System.out.println( "Cosa vuoi chiedere?" );
            domanda = tastiera.nextLine();
            rispondi();
            aggiorna();

            System.out.println( "Vuoi continuare?" );
            continua = tastiera.nextLine();
        }
        System.out.println( "L'oracolo ora riposa" );
    }

    private void rispondi() {
        System.out.println("Avrei bisogno di un suggerimento: cosa mi suggerisci?");
        nuovaRisposta = tastiera.nextLine();
        System.out.println( "Hai posto la domanda : " + domanda);
        System.out.println( "Ecco la tua risposta : " + vecchiaRisposta);
    }

    private void aggiorna() {
        vecchiaRisposta = nuovaRisposta;
    }
}

public class OracoloDemo {
    public static void main(String[] args) {
        // Costruiamo un singolo oracolo e iniziamo a parlare con lui
        Oracolo delfi = new Oracolo();
        delfi.parla();
    }
}

// Il trucco per ottenere un dialogo apparentemente sensato e' il seguente:
// La prima risposta e' gia' scelta. Chi pone la domanda all'oracolo,
// invia la risposta alla prossima domanda facendo finta di suggerire la risposta alla domanda presente.