// PersonaDemo.java

public class PersonaDemo {
    public static void main(String[] args) {
        // Definisco delle persone appartenenti a sottoclassi
    
        Studente a = new Studente("Rossi", 111); // 111 = matricola

        Docente b = new Docente("Bianchi", "Programmazione II");

        // Definisco un vettore con le persone appena introdotte
        int n = 2;
        Persona[] c = new Persona[n];
        c[0] = a;
        c[1] = b;

        // tipo apparente c[0],c[1]: Persona, tipo esatto: Studente, Docente

        // Stampo c usando il metodo scriviOutput():
        // Java utilizza il tipo "esatto" (il tipo originario) di ogni oggetto
        System.out.println("\nEsempio di scriviOutput()");
        for (int i = 0; i < n; i++) {
            System.out.println(i + ":");
            c[i].scriviOutput();
        }

        // Stampo c usando il metodo scriviNome()
        // Java utilizza il tipo esatto di ogni oggetto e il metodo scriviNome() per il tipo esatto,
        // che IN QUESTO CASO E' EREDITATO dalla classe Persona
        System.out.println("\nEsempio di scriviNome()");
        for (int i=0; i < n; i++) {
            System.out.println(i + ":");
            c[i].scriviNome();
        }
    }
}
