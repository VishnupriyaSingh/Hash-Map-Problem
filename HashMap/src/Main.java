public class Main {
    public static void main(String[] args) {
        MyHashTable<String> hashTable = new MyHashTable<>();
        String sentence = "To be or not to be";
        String[] words = sentence.toLowerCase().split("\\s+");

        for (String word : words) {
            hashTable.add(word);
        }

        for (String word : words) {
            System.out.println("Frequency of '" + word + "': " + hashTable.get(word));
        }
    }
}