// TestList.java

public class TestList {
    public static void main(String[] args) {
        ListExt a = new ListExt();

        for (int i = 20; i >= 0; i--)
            a.add(0, i);

        System.out.println();
        System.out.println(" Lista a={0,...,20} :");
        for (Integer s : a)
            System.out.println(s);
        System.out.println();

        ListExt b = new ListExt();
        for (int i = 10; i >= 0; i--)
            b.add(0, i);
            
        System.out.println( " Lista b={0,...,10} :");
        for (Integer o : b)
            System.out.println(o);
        System.out.println();

        System.out.println(" a.compareTo(b) = " + a.compareTo(b) );
        System.out.println(" b.compareTo(a) = " + b.compareTo(a) );
        b.set(7, 100);
        System.out.println(" Nuova Lista b con b_7 = 100 :");
        for (Integer o : b)
            System.out.println(o);
        System.out.println();

        System.out.println(" a.compareTo(b) = " + a.compareTo(b) );
        System.out.println(" b.compareTo(a) = " + b.compareTo(a) );
    }
}
