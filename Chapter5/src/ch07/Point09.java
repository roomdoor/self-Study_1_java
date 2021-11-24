package ch07;

public class Point09<T, V> {
    T x;
    V y;

    Point09(T x, V y) {
        this.x = x;
        this.y = y;
    }

    public T getX() {
        return x;
    }

    public V getY() {
        return y;
    }
}
