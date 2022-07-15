interface I {
    public void m1(J obj);
}

interface J {
    public void m2();
}

abstract class C implements I {
    public abstract void m1(J obj);
}

class D extends C implements J {
    public void m1(J obj) {
        if (this != obj) obj.m2(); System.out.println("D.m1");
    }

    public void m2(){
        System.out.println("D.m2");m1(this);
    }
}

public class Es2 {
    public static void main(String[]args){
        C obj4 = new D();
        obj4.m1(obj4);
    }
}


/*
* 1 - No, perché la classe D estende C che promette il metodo astratto m1; X
* 2 - No, perché non si può istanziare un tipo D all'interfaccia I considerando che essa non la implementa; X
* 3 - no, perché non si può istanziare una classe astratta; X
* 4 - No, perché la classe D non implementa il tipo J; V
*/