// Figura.java

// Graphics = a class of awt, consisting of graphical objects
// JFrame = a class of swing, including window
// with border + title + close-iconify button

// FIGURA = oggetti con un metodo "draw" per disegnare una figura
// in un oggetto grafico g. Uguale all’unione di tutte le classi di figure.
// Ci consente di definire vettori di figure prese da
// classi diverse e di disegnarle usando un unico comando.

import java.awt.*; // Abstract Window Toolkit (finestre grafiche)
// import javax.swing.*; // estensione di AWT per interfacce grafiche

public class Figura {
    // Dichiariamo il metodo di disegno draw ma lo definiamo vuoto:
    // serve solo per ricordarci di definire un metodo draw in ogni
    // sotto-classe della classe Figura.
    public void draw(Graphics g) {}
}