// TestFigura.java

// Classe introdotta per provare a usare la classe Figura e il binding dinamico.
// La classe Figura ha solo metodi astratti per area e perimetro (non utilizzabili)
// Gli oggetti di Figura appartengono tutti a sottoclassi non astratte,
// dove esistono metodi che sovrascrivono area() e perimetro(): sono questi ultimi ad essere usati.

public class TestFigura {
    // Metodo per trovare la figura di massima area in un vettore di figure (non vuoto)
    public static int maxArea(Figura[] V) {
        // esempio di binding dinamico:
        // il metodo da eseguire e' determinato dal tipo esatto di un oggetto
        int n = V.length;
        assert n > 0; //controllo che V non sia vuoto

        int m = 0; // m = indice oggetto con massima area
        for (int i = 1; i < n; i++) {
            if ( V[i].area() > V[m].area() )
                m = i;
                // ogni volta che trovo un'area V[i] piu' grande di V[m] aggiorno m
        }

        return m;
    }

    public static void main(String[] args) {
        Figura f = new Cerchio(1.0);
        // Il tipo esatto di f e' Cerchio
        System.out.println( "\nArea cerchio f di raggio 1 = " + f.area() );

        // Vantaggio dalla classe astratta Figura:
        // posso definire un vettore con figure di OGNI TIPO
        // e usare i metori area(), perimetro(), appropriati,
        // ed usare il metodo maxArea() di cui sopra.

        Figura[] V = {  new Cerchio(1.0),       // Cerchio di raggio 1
                        new Rettangolo(1,2),    // Rettagolo di base 1 e altezza 2
                        new PolReg(6, 2),       // Esagono regolare di raggio 2
                        new Trapezio(1, 2, 3)   // Base minore 1, base maggiore 2, altezza 3
                    };

        System.out.println( "\nStampo area e perimetro delle figure in V:");
        for(int i = 0; i < V.length; i++) {
            System.out.println(" Area V[" + i + "] = " + V[i].area() );
            System.out.println(" Perimetro V[" + i + "] = " + V[i].perimetro() );
        }
        System.out.println("\nIndice figura massima area in V = "+ maxArea(V) );
    }
}

