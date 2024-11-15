package IMPORTANT;
import java.util.HashMap;

class LRUCache {

    // Doubly Linked List Node class
    static class Node {
        int key, value;
        Node prev, next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private int capacity;
    private HashMap<Integer, Node> cache;
    private Node head, tail;

    // Constructor
    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new HashMap<>();

        // Create dummy head and tail nodes
        head = new Node(-1, -1);
        tail = new Node(-1, -1);

        // Connect head and tail to each other
        head.next = tail;
        tail.prev = head;
    }

    // Move a node to the front (head) of the linked list
    private void moveToFront(Node node) {
        remove(node);
        add(node);
    }

    // Remove a node from the doubly linked list
    private void remove(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    // Add a node to the front (head) of the doubly linked list
    private void add(Node node) {
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;
    }

    // Get value from cache
    public int get(int key) {
        if (!cache.containsKey(key)) {
            return -1; // Return -1 if the key is not present in the cache
        }

        // Move the accessed node to the front (head)
        Node node = cache.get(key);
        moveToFront(node);

        return node.value;
    }

    // Put a key-value pair into the cache
    public void put(int key, int value) {
        if (cache.containsKey(key)) {
            // Update the value of the existing key and move it to the front
            Node node = cache.get(key);
            node.value = value;
            moveToFront(node);
        } else {
            // If the cache exceeds capacity, remove the least recently used item
            if (cache.size() == capacity) {
                // Remove the node from the tail (LRU node)
                Node lru = tail.prev;
                cache.remove(lru.key);
                remove(lru);
            }

            // Add the new node to the front (head)
            Node newNode = new Node(key, value);
            cache.put(key, newNode);
            add(newNode);
        }
    }
}

public class LRU {
    public static void main(String[] args) {
        // Create an LRU Cache with capacity 2
        LRUCache cache = new LRUCache(2);

        cache.put(1, 1); // Cache = {1=1}
        cache.put(2, 2); // Cache = {1=1, 2=2}
        System.out.println(cache.get(1)); // Returns 1, Cache = {2=2, 1=1}

        cache.put(3, 3); // Removes key 2, Cache = {1=1, 3=3}
        System.out.println(cache.get(2)); // Returns -1 (not found)

        cache.put(4, 4); // Removes key 1, Cache = {3=3, 4=4}
        System.out.println(cache.get(1)); // Returns -1 (not found)
        System.out.println(cache.get(3)); // Returns 3
        System.out.println(cache.get(4)); // Returns 4
    }

    /*
Explanation:
Data Structures:

A HashMap (cache) stores the key-value pairs for fast access.
A Doubly Linked List is used to maintain the order of access. The head represents the most recently used node, and the tail represents the least recently used node.
Operations:

put(key, value):
If the key exists, update the value and move it to the front of the list.
If the key doesn't exist and the cache is full, remove the least recently used (LRU) node (i.e., the node just before the tail), and then add the new node to the front.
get(key):
If the key exists, return the value and move the corresponding node to the front of the list.
If the key doesn't exist, return -1.
Efficiency:

Both get and put operations are O(1) because we can access the HashMap in constant time and move nodes in the doubly linked list in constant time.
 */
}
