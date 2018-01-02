package Generics;

/**
 * 边界符
 */

public class Demo02 {

    public static void main(String[] args) {


    }


    public static <T extends Comparable<T>> int countGreaterThan(T[] anArray, T elem) {
        int count = 0;
        for (T e : anArray) {
            if (e.compareTo(elem) > 0) {
                ++count;
            }
        }
        return count;
    }


}


