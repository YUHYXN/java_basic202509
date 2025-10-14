package etc.generic.good;

public class MultiBox<K, V> {   // 멀티 제네릭
    private K key;
    private V value;

    public void put(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public V get(K key) {
        return value;
    }
}
