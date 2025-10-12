package codeWithAryan.behavioral.iterator;

import java.util.HashSet;
import java.util.Random;

public class RandomIterator<T> implements Iterator<T>{
    private T []arr;
    private HashSet<Integer> indexSet;
    private int currInd;
    private Random random;
    RandomIterator (T []arr){
        this.arr = arr;
        indexSet = new HashSet<>();
        random = new Random();
        currInd = random.nextInt(arr.length-1);
    }
    @Override
    public T next() {
        T ret =  arr[currInd];
        indexSet.add(currInd);
        int next = random.nextInt(arr.length-1);
        while ( indexSet.contains(next)){
            System.out.println("computing "+next);
            next = random.nextInt(arr.length-1);
        }
        currInd = next;
        return ret;
    }

    @Override
    public boolean hasNext() {
        System.out.println("indset size "+indexSet.size()+" arr lenght "+arr.length);
        if(indexSet.size()<arr.length-1) return true;
        return false;
    }
}
