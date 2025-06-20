package Hashing;

import java.util.LinkedList;

class CustomHashMap<K, V> {
    private static final int INITIAL_SIZE = 16; // Default size
    private LinkedList<Entry<K, V>>[] buckets;

    // Entry class to store key-value pairs
    static class Entry<K, V> {
        K key;
        V value;

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    public CustomHashMap() {
        buckets = new LinkedList[INITIAL_SIZE];
        for (int i = 0; i < INITIAL_SIZE; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    // Hash function
    private int getBucketIndex(K key) {
        return Math.abs(key.hashCode() % INITIAL_SIZE);
    }

    // Insert or update a key-value pair
    public void put(K key, V value) {
        int index = getBucketIndex(key);
        for (Entry<K, V> entry : buckets[index]) {
            if (entry.key.equals(key)) {
                entry.value = value; // Update value if key exists
                return;
            }
        }
        buckets[index].add(new Entry<>(key, value));
    }

    // Get value by key
    public V get(K key) {
        int index = getBucketIndex(key);
        for (Entry<K, V> entry : buckets[index]) {
            if (entry.key.equals(key)) {
                return entry.value;
            }
        }
        return null; // Key not found
    }

    // Remove key-value pair
    public void remove(K key) {
        int index = getBucketIndex(key);
        buckets[index].removeIf(entry -> entry.key.equals(key));
    }

    // Check if key exists
    public boolean containsKey(K key) {
        return get(key) != null;
    }

    // Display HashMap contents
    public void display() {
        for (int i = 0; i < INITIAL_SIZE; i++) {
            for (Entry<K, V> entry : buckets[i]) {
                System.out.println(entry.key + " -> " + entry.value);
            }
        }
    }

    public static void main(String[] args) {
        CustomHashMap<String, Integer> map = new CustomHashMap<>();
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 28);

        System.out.println("Bob's Age: " + map.get("Bob")); // Output: 30
        System.out.println("Contains 'Alice'? " + map.containsKey("Alice")); // true
        
        map.remove("Charlie");
        System.out.println("After removing Charlie:");
        map.display();
    }
}
