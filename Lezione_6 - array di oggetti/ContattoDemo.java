// ContattoDemo.java

public class ContattoDemo {
    //controllo i metodi della classe Contatto
    public static void main(String[] args) {
        Contatto a = new Contatto("Ciro", "ciro@unixyz.whatever");
        
        System.out.println("Contatto:");
        a.scriviOutput();

        System.out.println("Modifico nome:");
        a.setNome("Pippo");
        a.scriviOutput();

        System.out.println("Modifico email:");
        a.setEmail("pippo@torino.blah");
        a.scriviOutput();
    }
}

