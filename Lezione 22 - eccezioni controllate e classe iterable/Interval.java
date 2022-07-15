class Interval implements Iterable<Integer> {
    private Node first, last;
    
    public Interval(Node first, Node last) {
        this.first = first;
        this.last = last;
    }
    
    public IntervalIterator iterator() {
        return new IntervalIterator(first,last);
    }
}
