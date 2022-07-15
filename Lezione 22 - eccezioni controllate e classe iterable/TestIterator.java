// TestIterator.java

// Possiamo usare il costrutto: for (Integer n : interval) { ... }

public class TestIterator{
    public static void main(String[] args) {
        System.out.println("p = {4,3,2,1}");
        Node p = new Node(1, null);
        p = new Node(2, p);
        p = new Node(3, p);
        p = new Node(4, p);
        
        System.out.println("q e' il terzo nodo di p");
        Node q = p.getNext().getNext(); //salto i primi 2 nodi di p

        System.out.println( "\n[p,q[ copre i primi due nodi di p");
        Interval interval = new Interval(p, q);
        System.out.println( "stampo [p,q[ = {4,3}");
        for (Integer n : interval)
            System.out.println(n);

        System.out.println( "\n [p,null[ = p");
        Interval interval2 = new Interval(p, null);
        System.out.println("stampo [p,null[ = p = {4,3,2,1}");
        for (Integer n : interval2)
            System.out.println(n);

        System.out.println("\n[p,p[ = {}");
        Interval interval3 = new Interval(p, p); 
        System.out.println("stampo [p,p[ = {}"); 
        for (Integer n : interval3)
            System.out.println(n);
    }
}