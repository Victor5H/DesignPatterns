package codeWithAryan.behavioral.iterator;

public class ReverseIterator <T> implements Iterator<T>{
    private final T[] arr;
    private int ind;
    ReverseIterator(T []arr){
        this.arr = arr;
        ind= arr.length-1;
    }
    @Override
    public T next() {
        return arr[ind--];

    }

    @Override
    public boolean hasNext() {
        return ind >=0;
    }
}
