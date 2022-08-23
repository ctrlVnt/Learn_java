public class Node <T>{

    private Node<T> nodo;
    private T elem;

    public Node(T elem, Node<T> next){
        this.nodo = next;
        this.elem = elem;
    }

    public T getElem(){
        return elem;
    }

    public Node<T> getNode(){
        return this.nodo;
    }

    public void setElem(T elem){
        this.elem = elem;
    }

    public void setNodo(Node<T> nodo){
        this.nodo = nodo;
    }

    public void stampa (){
        Node<T> p = nodo;
        System.out.print("{");
        while (p != null){
            System.out.print(p.getElem() + " ");
            p = p.getNode();
        }
        System.out.print("}");
        System.out.println();
    }
}
