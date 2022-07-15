// TestList.java
// Proviamo a costruire e stampare delle liste realizzate con la classe astratta List

public class TestList {
    public static void main(String[] args) {
        List a = new Nil();
        a = a.insert(10).insert(20);
        List b = a.insert(5);
        List c = b.insert(15);
        List d = c.insert(25);
        System.out.println( "\n d = " + d);
        
        System.out.println( "\nEsempi di unione di l={1,2} con m={3,4}:");

        List l = new Nil();
        l = l.insert(1).insert(2);

        List m = new Nil();
        m = m.insert(3).insert(4);

        System.out.println(" l.append(m) = " + l.append(m) );
        System.out.println(" m.append(l) = " + m.append(l) );
        System.out.println("(aggiungendo l e m in ordine diverso il risultato non cambia)");
    
        System.out.println("\nAggiungere due volte non cambia il risultato:");
        System.out.println(" m.append(l).append(l) = " + m.append(l).append(l));
    }
}
