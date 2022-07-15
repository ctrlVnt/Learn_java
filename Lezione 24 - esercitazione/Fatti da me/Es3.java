class Node<T> {
    public T elem;
    public Node<T> next;

    public Node(T elem, Node<T> next){
        this.elem=elem;
        this.next=next;
    }

    public T getElem() {
        return elem;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setElem(T elem) {
        this.elem=elem;
    }

    public void setNext(Node<T> next) {
        this.next=next;
    }

}
public class Esercizio3{
    public static <T extends Comparable<T>> void metodo(Node<T> p, T x){
        assert p != null;
        while (x.compareTo(p.getElem()) < 0)
            p = p.getNext();
        p.setNext(null);
    }
}

public class Es3 {
    public static void main(String[]args){

    }
}

/* compara ogni elemento del nodo generico P all'elemento generico x e elimina gli elementi minori di x; */