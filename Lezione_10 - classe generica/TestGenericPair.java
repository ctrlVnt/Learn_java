// TestGenericPair.java

public class TestGenericPair {
    public static <T,S> GenericPair<S,T> inv(GenericPair<T,S> p) {
        return new GenericPair<S,T> ( p.getSecond(), p.getFirst() );
    }

    public static void main(String[] args) {
        GenericPair<String,Integer> p = new GenericPair<>("pluto", 1);

        System.out.println( "p = " + p );
        System.out.println( "inv(p) = " + inv(p) );
        System.out.println( "p non cambia: " + p);

        //Dato che inv() e' un metodo statico, al di fuori della sua classe
        //deve venire chiamato come: TestGenericPair.<String,Integer>inv(p);
    }
}

