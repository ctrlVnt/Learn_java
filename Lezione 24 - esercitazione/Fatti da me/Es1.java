abstract class Tree<T> {
    public abstract Tree<T> detach(T x);
    public abstract String toString();
}

class Leaf<T> extends Tree<T> {
    public Tree<T> detach(T x) {
        return null;
    }
    public String toString() {
        return "()";
    }
}
class Branch<T> extends Tree<T> {
    private T elem;
    private Tree<T> left;
    private Tree<T> right;
    public Branch(T elem, Tree<T> left, Tree<T> right)
    {this.elem = elem;this.left = left;this.right = right;}
    public Tree<T> detach(T x) {
        if ()
            return new Leaf<T>();
        if (left != null)
            return left.detach(x);
        else
            return right.detach(x);
    }
    public String toString() {
        return "(" + elem + "," + left + "," + right + ")";
    }
}

public class Es1 {
    public static void main(String[] args) {
        Leaf<Integer> l = new Leaf<Integer>();
        Tree<Integer> t;

        t = new Branch<Integer>(2, l, new Branch<Integer>(-3, new Branch<Integer>(1, l, l), l));
        System.out.println(t);

        t = t.detach(-3);
        System.out.println(t);
    }
}
