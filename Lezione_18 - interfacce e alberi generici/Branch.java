// alberi non vuoti

public class Branch<T extends Comparable<T>> extends Tree<T> {
    private T elem;
    Tree<T> left;
    Tree<T> right;
    
    public Branch(T elem, Tree<T> left, Tree<T> right) {
        this.elem = elem;
        this.left = left;
        this.right = right;
    }
    
    public boolean empty() { return false; }

    public boolean contains(T x) {
        int c = x.compareTo(elem);
        if (c == 0) // x == elem
            return true;
        else if (c < 0) // x < elem
            return left.contains(x);
        else // c > 0, x > elem
            return right.contains(x);
    }

    public T max() {
        if (right.empty())
            return elem;
        else // right non vuoto
            return right.max();
    }

    public Tree<T> insert(T x) {
        int c = x.compareTo(elem);
        if (c < 0) { // x < elem
            left = left.insert(x);
        } else if (c > 0) { // x > elem
            right = right.insert(x);
        }
        // se c=0 allora x = elem e non inserisco x
        return this;
    }

    public Tree<T> remove(T x) {
        int c = x.compareTo(elem);
        if (c < 0) { // x < elem
            left = left.remove(x);
            return this;
        } else if (c > 0) { //x > elem
            right = right.remove(x);
            return this;
        } else { // x = elem *
            if (left.empty())
                return right; // resta solo right
            else if (right.empty())
                return left; // resta solo left
            else { // sia left che right non sono vuoti
                elem = left.max(); // rimpiazzo elem con il massimo a sinistra
                left.remove(elem); // rimuovo elem da left
                return this;
            }
        }
    }

    protected void scriviOutput(String prefix, String root, String left, String right) {
        this.left.scriviOutput(prefix + left, "   /", "  ", "  ¦");
        System.out.println(prefix + root + "[" + elem + "]");
        this.right.scriviOutput(prefix + right, "   \\", "  ¦", "  ");
    }
}

