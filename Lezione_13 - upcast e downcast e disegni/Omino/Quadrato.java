// Quadrato.java quadrato: un possibile oggetto "disegnabile"
// Definiamo Quadrato come una sotto-classe di Figura
 
import java.awt.*; // Abstract Window Toolkit
// import javax.swing.*; // estensione di AWT per interfacce grafiche

public class Quadrato extends Figura {
    // Un quadrato e' definito dal suo lato
    private int lato;
    private int raggio;

    // COSTRUTTORE di un quadrato
    public Quadrato(int lato, int raggio) {
        this.lato = lato;
        this.raggio = raggio;
    }

    // OVERRIDE: ri-definiamo il metodo draw (per ora vuoto)
    // per disegnare una figura nel caso di un quadrato.

    // Scegliamo che il quadrato sia centrato nell'origine
    // Scegliamo il colore arancio per le prossime linee in g

    public void draw(Graphics g) {
        g.setColor(Color.black);
        g.drawLine( 0, this.raggio, 0, this.lato + this.raggio);
        g.drawLine(0, this.raggio, -this.lato / 2, this.lato);
        g.drawLine(0, this.raggio, this.lato / 2, this.lato);
        g.drawLine(0, (this.raggio + this.lato), -this.lato / 2, (this.raggio + this.lato + (this.lato / 2)));
        g.drawLine(0, (this.raggio + this.lato),this.lato / 2, (this.raggio + this.lato + (this.lato / 2)));
    }
}
