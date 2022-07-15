// DynamickStack.java

public class DynamicStack {
    private Node top;
    //ultimo nodo aggiunto alla pila. "null" se la pila e' vuota.

    //COSTRUTTORE di una pila P = {} vuota
    public DynamicStack() { this.top = null; }

    // controlla se la pila e' vuota
    public boolean empty() { return this.top==null; }

    //aggiunge in cima alla pila un nuovo nodo che contiene l'elemento x
    public void push(int x) { this.top = new Node(x, top); }

    // rimuove il nodo in cima alla pila e restituisce il suo contenuto
    public int pop() {
        assert !empty();
        int x = this.top.getElem();
        this.top = this.top.getNext(); //elimino l'ultimo nodo con contenuto x
        return x;
    }

    //leggo il contenuto del nodo in cima alla pila senza toglierlo
    public int top() {
        assert !empty();
        int x = top.getElem();
        return x;
    }

    // STAMPA: Per scorrere una pila usiamo una variabile di tipo nodo
    // che parte da top e procede all'indietro lungo la pila fino ad arrivare al nodo null
    public void scriviOutput() {
        Node temp = top; //partiamo dal nodo in cima alla pila

        while (temp != null) { //ci fermiamo quando temp arriva al nodo null
            System.out.println( " || " + temp.getElem() );
            temp = temp.getNext(); // passiamo al nodo successivo
        }
    }

    // COSTRUTTORE di una pila P = {1,...,n}, pila vuota se n<=0
    public DynamicStack(int n) {
        top = null;
        int i = 1;
        while (i <= n) { // aggiungo il nodo che contiene i
            top = new Node(i,top);
            i++;
        }
    }
}

