public class Label<K,V extends Comparable<V>> implements Comparable<Label<K,V>> {
    private  final K key;
    private final V value;
    public Label(K key, V value) {
        this.key = key;
        this.value = value;
    }
    public K getKey() {
        return key;
    }
    public V getValue() {
        return value;
    }
    @Override
    public boolean equals(Object obj)  {
        Label<?, ?> other = (Label<?, ?>) obj;
        if ((obj instanceof Label) && (this.value.equals(other.getValue()))) {
            return true;
        }
        else {
            return false;
        }
    }
    @Override
    public int compareTo(Label<K, V> other) {
        return this.value.compareTo(other.getValue());
            
    }
}