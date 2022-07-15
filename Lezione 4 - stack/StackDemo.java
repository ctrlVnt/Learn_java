// StackDemo.java

public class StackDemo {
    public static void main(String[] args) {
        Stack s = new Stack(3);
        Stack t = new Stack(3);
        
        System.out.println("s e t sono stack con capacita' 3 entrambi vuoti");
        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println("s={10,20,30}, pieno, e diverso da t={} che e' vuoto:");
        System.out.println(" s.full() = " + s.full() );
        System.out.println(" s.empty() = " + s.empty() );
        System.out.println(" s.equals(t) = " + s.equals(t) );

        System.out.println("Eliminiamo uno alla volta gli elementi in s:");
        System.out.println(" s.pop() = " + s.pop());
        System.out.println(" s.pop() = " + s.pop());
        System.out.println(" s.pop() = " + s.pop());

        System.out.println("Adesso s e' vuoto, ed uguale a t");
        System.out.println(" s.full() = " + s.full());
        System.out.println(" s.empty() = " + s.empty());
        System.out.println(" s.equals(t) = " + s.equals(t));

        System.out.println("Impostiamo s={40,50} e t={40,60}: s e t diversi:");
        s.push(40); s.push(50);
        t.push(40); t.push(60);
        System.out.println(" s.full() = " + s.full());
        System.out.println(" s.empty() = " + s.empty());
        System.out.println(" s.equals(t) = " + s.equals(t));
    }
}