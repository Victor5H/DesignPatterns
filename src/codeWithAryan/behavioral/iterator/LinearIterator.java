package codeWithAryan.behavioral.iterator;

public class LinearIterator<T> implements Iterator<T>{
    private final T[] arr;
    private int ind;
    LinearIterator(T []arr){
        this.arr = arr;
        ind=0;
    }
    @Override
    public T next() {
        return arr[ind++];

    }

    @Override
    public boolean hasNext() {
        return ind != arr.length;
    }
}
