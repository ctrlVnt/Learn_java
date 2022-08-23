// FrazioneDemo.java (esperimenti su frazioni)
public class FrazioneDemo {
    public static void main(String[] args) {
        Frazione t = new Frazione(2,3);
        Frazione u = new Frazione(1,6);
        Frazione v = new Frazione(1,6);
        // t = 2/3, u = 1/6, v = 1/6

        System.out.println("t, u, v valgono:");
        t.scriviOutput();
        u.scriviOutput();
        v.scriviOutput();

        // t+u+v = (2/3)+(1/6)+(1/6) = (4/6)+(1/6)+(1/6) = 6/6 =1
        System.out.println("t+u+v deve fare 1:");
        Frazione w = (t.somma(u)).somma(v);
        w.scriviOutput();

        // t*u*v= (2*1*1)/(3*6*6)= 2/108 = 1/54
        System.out.println("t*u*v deve fare (1/54)");
        Frazione z = (t.prodotto(u)).prodotto(v);
        z.scriviOutput();
    }
}

