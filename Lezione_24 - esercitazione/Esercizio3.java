class Node<T> {
    public T elem;
    public Node<T> next;
    
    public Node(T elem, Node<T> next) {
        this.elem = elem;
        this.next = next;
    }

    public static <T> void scriviOutput(Node<T> p) {
        while(p != null) {
            System.out.println(p.elem);
            p = p.next;
        }
    }

    public static <T extends Comparable<T>> boolean OK(Node<T> p, T x) {
        if (x == null)
            return false;

        while (p != null && x.compareTo(p.elem) < 0)
            p = p.next;

        return p != null;
    }

    public static <T extends Comparable<T>> void metodo(Node<T> p, T x) {
        while (x.compareTo(p.elem) < 0)
            p = p.next;
        p.next = null;
    }
}

public class Esercizio3 {
    public static void main(String[] args) {
        Node<Integer> p = new Node<>(30, new Node<>(20, new Node<>(10, null)));
        System.out.println("p=");
        Node.scriviOutput(p);

        System.out.println("\nOK(null,30)=" + Node.OK(null, 30)); // OK(null,30) = false
        System.out.println("\n OK(p,null)=" + Node.OK(p, null)); //OK(p,null) = false
        System.out.println("\n OK(p,10)=" + Node.OK(p,10)); // OK(p,10) = true
        System.out.println("applico metodo(p,10): p non cambia");
        Node.metodo(p, 10);
        Node.scriviOutput(p);

        System.out.println("\n OK(p,20)=" + Node.OK(p, 20)); // OK(p,20) = true
        System.out.println("applico metodo(p,20): ora p={30,20}");
        Node.metodo(p, 20);
        Node.scriviOutput(p);

        System.out.println("\n adesso OK(p,10)=" + Node.OK(p, 10)); // OK(p,10) = false
        System.out.println("se applico metodo(p,10) sollevo un'eccezione");
        
        // System.out.println("applico metodo(p)");
        // Node.metodo(p, 10);
        // System.out.println("p=");
        // Node.scriviOutput(p);
    }
}

