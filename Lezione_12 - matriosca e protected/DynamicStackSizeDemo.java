// DynamicStackSizeDemo.java

public class DynamicStackSizeDemo {
    public static void main(String[] args) {
        System.out.println( "Inizializzo la pila P = {-1}");
        
        DynamicStackSize P = new DynamicStackSize();
        
        P.push(-1);
        P.scriviOutput();
        System.out.println();

        System.out.println( "Costruisco la pila P = {-1,1,3,5,7,9,11}");
        P.push(1);
        P.push(3);
        P.push(5);
        P.push(7);
        P.push(9);
        P.push(11);
        P.scriviOutput();
        System.out.println();
        
        System.out.println("Estraggo 11, 9, 7. Leggo 5");
        System.out.println(" P.pop() = " + P.pop() );
        System.out.println(" P.pop() = " + P.pop() );
        System.out.println(" P.pop() = " + P.pop() );
        System.out.println(" P.top() = " + P.top() );
        System.out.println();

        System.out.println( "Stampo cio' che resta: P={-1,1,3,5}");
        P.scriviOutput();
    }
}

