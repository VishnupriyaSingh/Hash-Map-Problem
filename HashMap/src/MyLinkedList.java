public class MyLinkedList<K> {
    MyMapNode<K, Integer> head;

    public void add(K key) {
        if (head == null) {
            head = new MyMapNode<>(key, 1);
            return;
        }

        MyMapNode<K, Integer> current = head;
        while (current.next != null) {
            if (current.key.equals(key)) {
                current.value += 1;
                return;
            }
            current = current.next;
        }

        if (current.key.equals(key)) {
            current.value += 1;
        } else {
            current.next = new MyMapNode<>(key, 1);
        }
    }

    public boolean remove(K key) {
        if (head == null)
            return false;
        if (head.key.equals(key)) {
            head = head.next;
            return true;
        }

        MyMapNode<K, Integer> current = head;
        while (current.next != null) {
            if (current.next.key.equals(key)) {
                current.next = current.next.next;
                return true;
            }
            current = current.next;
        }

        return false;
    }

    public int get(K key) {
        MyMapNode<K, Integer> current = head;
        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }
        return 0;
    }
}