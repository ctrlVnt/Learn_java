// DynamicStackMax.java

public class DynamicStackMax extends DynamicStack {
    private int max;
    // INVARIANTE di classe di DynamicStack: top punta alla cima della pila.
    // Aggiungiamo: SE lo stack non e` vuoto, allora max contiene
    // il massimo valore dello stack. Se lo stack e' vuoto il valore di max e' arbitrario.

    // COSTRUTTORE. Dobbiamo spesso fornire un costruttore per le classi estese: raramente il costruttore di default fornito da Java per una estensione e' sensato */
    public DynamicStackMax() {
        super();
        // Invoco il costruttore della classe superiore con 0 argomenti

        max = 0;
        // inizializziamo il nuovo attributo, max, anche se il suo valore non
        // ha senso quando lo stack e` vuoto. Quando lo stack e' vuoto non consentiremo l'uso di max.
    }

    // NUOVO metodo get per il nuovo campo max
    public int getMax() {
        assert !empty(); // se pila vuota: non corretto chiedere il massimo
        return this.max;
    }

    // OVERRIDE del metodo push(int n): inseriamo di un elemento in cima
    // alla pila aggiornando il valore del massimo
    public void push(int n) {
        if (empty())
            this.max = n;
            // se la pila e' vuota il massimo e' l'elemento n appena inserito
        else
            // altrimenti e' il massimo tra elemento inserito e il max. precedente
            this.max = Math.max(this.max, n);

        super.push(n);
        // invoco il push della classe superiore
    }

    // NUOVO metodo per ricalcolare max, se abbiamo motivo per dubitare
    // che max sia davvero il massimo della pila
    // Nota: possiamo usare il nodo "top" della pila perche' abbiamo
    // dichiarato top "protected" e quindi accessibile nelle classi che estendono DynamicStack

    private void resetMax() {
        // se la pila e' vuota ogni valore di max va bene
        if (!empty()) { // altrimenti ricalcolo il massimo della pila
            this.max = top.getElem();
            // calcolo il max. tra il primo elemento della pila e gli altri

            // per evitare di modificare l’indirizzo top della pila introduco
            // una nuova variabile p di tipo nodo con valore iniziale top
            for ( Node p = top.getNext(); p != null; p = p.getNext() )
                this.max = Math.max(this.max, p.getElem() );
        }
    }

    // OVERRIDE di pop(): rimozione di un elemento dalla cima della pila
    // Attenzione: puo' richiedere il ricalcolo del massimo
    public int pop() {
        assert !empty();
        
        int n = super.pop();
        // invoco il pop() della classe superiore

        // Se l'elemento tolto e' == max, il massimo,
        // allora il massimo potrebbe cambiare e va ricalcolato
        if (n == this.max)
            resetMax();
            
        return n;
    }

    // EREDITA' Il metodo top() e' ereditato, non deve essere riscritto:
    //leggere l'elemento in cima alla pila non cambia il max della pila

    // OVERRIDE del metodo di scrittura
    public void scriviOutput() {
        super.scriviOutput();
        System.out.println( " || max = " + this.max);
    }
}
