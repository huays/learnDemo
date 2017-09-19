package Generics;

/**
 * 泛型类 & 泛型方法
 */
public class Demo01 {

    public static void main(String[] args) {
//        Box<Integer> integerBox = new Box<>();
//        integerBox.setT(1);
//        System.out.println(integerBox.getT());
        Pair<Integer, String> p1 = new Pair<>(1, "java");
        Pair<Integer, String> p2 = new Pair<>(2, "python");
        System.out.println(Util.compare(p1, p2));
    }

}


class Box<T> {

    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}

class Pair<K, V> {

    private K key;

    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}


class Util {

    public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
        return p1.getKey().equals(p2.getKey()) &&
                p1.getValue().equals(p2.getValue());
    }
}


