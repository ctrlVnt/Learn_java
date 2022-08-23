public class Es2 {
    public static void main (String[]args) {

    }

    public static void metodo (Node p){
        assert ver(p);
        while (p != null) {
            if (p.getElem() < 0 && p.getNext().getElem() > 0)
                p.setNext(p.getNext().getNext());
            p = p.getNext();
        }

        public static boolean ver (Node p){
            while (p != null){
                if(p.getNext() == null && p.getElem())
            }
        }
    }
    /* ciclando sul nodo p ricevuto in input, finchè questo non risulterà null, controlla se
    * l'elemento corrente è minore di zero e l'elemento successivo è maggiore di zero, nel caso
    * imposta il nodo successivo a quello dopo ancora, quindi elimina il successivo.
    * in pratica non possono esserci un nodo con elemento negatltandone unoivo e uno positivo vicini*/
}
