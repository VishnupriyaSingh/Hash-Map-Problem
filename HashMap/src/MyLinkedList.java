public class MyLinkedList<K> {
    MyMapNode<K, Integer> head;

    public MyLinkedList() {
        head = null;
    }

    public void add(K key) {
        MyMapNode<K, Integer> newNode = new MyMapNode<>(key, 1);
        if (head == null) {
            head = newNode;
        } else {
            MyMapNode<K, Integer> temp = head;
            while (temp.next != null) {
                if (temp.key.equals(key)) {
                    temp.value = temp.value + 1;
                    return;
                }
                temp = temp.next;
            }

            if (temp.key.equals(key)) {
                temp.value = temp.value + 1;
            } else {
                temp.next = newNode;
            }
        }
    }

    public int get(K key) {
        MyMapNode<K, Integer> temp = head;
        while (temp != null) {
            if (temp.key.equals(key)) {
                return temp.value;
            }
            temp = temp.next;
        }
        return 0;
    }
}