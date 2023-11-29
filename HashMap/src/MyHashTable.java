public class MyHashTable<K> {
    private MyLinkedList<K>[] bucketArray;
    private int numBuckets;

    public MyHashTable() {
        numBuckets = 20;
        bucketArray = new MyLinkedList[numBuckets];
        for (int i = 0; i < numBuckets; i++) {
            bucketArray[i] = new MyLinkedList<>();
        }
    }

    private int getBucketIndex(K key) {
        int hashCode = key.hashCode();
        int index = Math.abs(hashCode) % numBuckets;
        return index;
    }

    public void add(K key) {
        int bucketIndex = getBucketIndex(key);
        bucketArray[bucketIndex].add(key);
    }

    public void remove(K key) {
        int bucketIndex = getBucketIndex(key);
        bucketArray[bucketIndex].remove(key);
    }

    public int get(K key) {
        int bucketIndex = getBucketIndex(key);
        return bucketArray[bucketIndex].get(key);
    }
}