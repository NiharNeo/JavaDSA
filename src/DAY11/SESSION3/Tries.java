package DAY11.SESSION3;

class TrieNode {
    TrieNode[] children;
    boolean isEnd;

    public TrieNode() {
        children = new TrieNode[26];
        isEnd = false;
    }
}

public class Tries {
    private TrieNode root;

    public Tries() {
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode current = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            int index = ch - 'a';

            if (current.children[index] == null) {
                current.children[index] = new TrieNode();
            }
            current = current.children[index];
        }
        current.isEnd = true;
    }

    public boolean search(String word) {
        TrieNode current = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            int index = ch - 'a';

            if (current.children[index] == null) {
                return false;
            }
            current = current.children[index];
        }
        return current.isEnd;
    }

    public boolean startsWith(String prefix) {
        TrieNode current = root;
        for (int i = 0; i < prefix.length(); i++) {
            char ch = prefix.charAt(i);
            int index = ch - 'a';

            if (current.children[index] == null) {
                return false;
            }
            current = current.children[index];
        }
        return true;

    }

    public static void main(String[] args) {
        Tries trie = new Tries();

        // Test Insertions
        trie.insert("apple");
        trie.insert("app");

        // Test Search Operations
        System.out.println("Search 'apple': " + trie.search("apple"));
        System.out.println("Search 'app': " + trie.search("app"));
        System.out.println("Search 'ap': " + trie.search("ap"));

        // Test Prefix Operations
        System.out.println("Starts with 'ap': " + trie.startsWith("ap"));
        System.out.println("Starts with 'bat': " + trie.startsWith("bat"));
    }
}
