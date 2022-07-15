// DynamicStackDemo.java (test della classe DynamicStack)

public class DynamicStackDemo {
    public static void main(String[] args) {
        System.out.println();
        System.out.println( "Costruisco la pila P = {3, 5, 7, 9, 11}");

        DynamicStack P = new DynamicStack();
        P.push(3);
        P.push(5);
        P.push(7);
        P.push(9);
        P.push(11);
        P.scriviOutput();

        System.out.println();
        System.out.println( "Estraggo gli ultimi 3 elementi inseriti: 11, 9, 7");
        System.out.println( P.pop() );
        System.out.println( P.pop() );
        System.out.println( P.pop() );

        System.out.println();
        System.out.println("Leggo l'elemento in cima alla pila senza estrarlo:");
        System.out.println( P.top() );

        System.out.println();
        System.out.println( "Stampo quel che resta: P={3, 5}" );
        P.scriviOutput();

        System.out.println();
        System.out.println( "Costruisco una pila Q={1,2,3,4,5,6,7,8,9,10}" );
        DynamicStack Q = new DynamicStack(10);
        Q.scriviOutput();
        System.out.println();
    }
}
