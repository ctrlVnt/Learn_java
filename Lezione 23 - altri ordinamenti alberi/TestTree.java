// TestTree

public class TestTree {
    public static void main(String[] args) {
        Tree t = new Branch(1,
                    new Branch(2, new Leaf(), new Leaf()),
                    new Branch(3, new Leaf(),
                        new Branch(72, new Leaf(),
                            new Branch(9, new Leaf(), new Leaf()) ) ) );

    System.out.println("\nL'albero t:\n\n" + t);
    System.out.println("\n\nVisita pre-order t:");
    t.preOrder();

    System.out.println("\n\nVisita in-order t:");
    t.inOrder();

    System.out.println("\n\nVisita post-order t:");
    t.postOrder();

    System.out.println("\n\nVisita per livelli t:");
    t.livello();

    System.out.println("\nFoglie per livello t:");
    for(int i = 0; i <= 5; i++)
        System.out.println("t.leavesAt(" + i + ") = " + t.leavesAt(i) );
    // risultato: foglie per livello = 0 0 3 1 2 0
    }
}

