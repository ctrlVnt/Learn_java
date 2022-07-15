// TestMiniIterator.java (controlliamo MiniLinkedList e MiniIterator)

public class TestMiniIterator {
    public static void main(String[] args) {
        // Costruisco una lista l = {9,8,7,6,5,4,3,2,1,0},
        // aggiungendo 0,1,2,3,4,5,6,7,8,9 sempre in posizione 0,
        // dunque ogni elemento davanti ai precedenti

        MiniLinkedList l = new MiniLinkedList();

        for (int i = 0; i < 10; i++)
            l.add(0, i);

        System.out.println("l.getSize() = " + l.getSize() );
        // Cancello l_7, cioe' il terzo elemento di l dal fondo: il 2
        System.out.println("Cancello l_7 = 2");
        System.out.println("l.remove(7) = " + l.remove(7) );
        System.out.println("l.getSize() = " + l.getSize() );

        // Stampo usando la classe MiniIterator per il puntatore della stampa
        MiniIterator iter = l.iterator();
        while ( iter.hasNext() )
            System.out.println( iter.next() );
    }
}

