package codeWithAryan.behavioral.iterator;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Integer []arr =new Integer[]{1,2,3,4,5,6,7};

        LinearIterator<Integer> iterator = new LinearIterator<>(arr);
        ReverseIterator<Integer> reverseIterator = new ReverseIterator<>(arr);
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("-----");
        while (reverseIterator.hasNext()){
            System.out.println(reverseIterator.next());
        }
        RandomIterator<Integer> randomIterator = new RandomIterator<>(arr);
        System.out.println("-----");
        while (randomIterator.hasNext()){
            System.out.println(randomIterator.next());
        }
    }
}
