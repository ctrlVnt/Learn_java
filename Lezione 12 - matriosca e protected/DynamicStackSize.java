// DynamicStackSize.java

public class DynamicStackSize extends DynamicStackMax {
    private int size;
    // Aggiunta all’INVARIANTE di classe:
    // "size" = numero elementi sullo stack

    // COSTRUTTORE: Dobbiamo quasi sempre definire un costruttore per le sottoclassi
    public DynamicStackSize() {
        super(); // invoco il costruttore della classe superiore
        this.size = 0;
    }

    // NUOVO metodo get per il nuovo campo size
    public int getSize() { return this.size; }

    // OVERRIDE del metodo push: inserimento elemento in cima alla pila
    public void push(int n) {
        super.push(n);
        this.size++;
    }

    // OVERRIDE del metodo pop: rimozione elemento dalla cima della pila
    public int pop(){
        assert !empty();
        this.size--; //aggiorno il numero degli elementi
        return super.pop(); // invoco il metodo pop() della classe superiore
    }

    // EREDITA' top() viene ereditato e non deve essere riscritto:
    // leggere l'elemento in cima alla pila non cambia il size della pila

    // OVERRIDE del metodo di scrittura
    public void scriviOutput() {
        super.scriviOutput();
        System.out.println( " || size = " + this.size);
    }
}
