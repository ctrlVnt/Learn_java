public class TestNode {

    public static void main (String[]args){
        System.out.println("creo 4 situazioni, i risultati devono essere:");
        System.out.println("true");
        System.out.println("false");
        System.out.println("true");
        System.out.println("false");
        System.out.println("-------------------------------------------");
        Node<Integer> a = new Node<Integer>(2, null);
        Node<Integer> b = new Node<Integer>(12, null);
        Node<Integer> c = new Node<Integer>(89, null);
        Node<Integer> d = new Node<Integer>(0, null);
        a = new Node<>(4, a);
        a = new Node<>(6, a);
        a = new Node<>(8, a);
        a = new Node<>(3, a);
        a = new Node<>(6, a);
        a = new Node<>(6, a);
        a = new Node<>(1, a);
        a = new Node<>(0, a);
        a = new Node<>(2, a);
        System.out.print("a = ");
        a.stampa();
        b = new Node<>(5, b);
        b = new Node<>(7, b);
        b = new Node<>(9, b);
        b = new Node<>(0, b);
        b = new Node<>(5, b);
        b = new Node<>(2, b);
        b = new Node<>(0, b);
        b = new Node<>(1, b);
        b = new Node<>(2, b);
        System.out.print("b = ");
        b.stampa();
        c = new Node<>(0, c);
        c = new Node<>(5, c);
        c = new Node<>(34, c);
        System.out.print("c = ");
        c.stampa();

        System.out.println("d = {0, null}");

        System.out.println("a in comune b: " + inComune(a, b));

        System.out.println("a in comune c: " + inComune(a, c));

        System.out.println("b in comune c: " + inComune(b, c));

        System.out.println("d in comune c: " + inComune(d, c));

    }

    public static <T> boolean inComune(Node<T> p, Node<T> q){
        if (p == null || q == null)
            return false;
        return p.getElem().equals(q.getElem()) || inComune(p.getNode(), q.getNode());
    }

}
