package DAY11.SESSION3;

import java.util.HashMap;
import java.util.Map;

class LongestCommanPrefix {
    class TrieNode {
        public TrieNode current;
        Map<Character, TrieNode> children = new HashMap<>();
        boolean isEndOfWord = false;
    }

    private final TrieNode root = new TrieNode();

    private void insert(String word) {
        TrieNode current = root;
        for (char ch : word.toCharArray()) {
            current.children.putIfAbsent(ch, new TrieNode());
            current.current = current.children.get(ch);
        }
        current.isEndOfWord = true;
    }

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        for (String str : strs) {
            if (str.isEmpty()) {
                return "";
            }
            insert(str);
        }

        StringBuilder prefix = new StringBuilder();
        TrieNode current = root;

        while (current.children.size() == 1 && !current.isEndOfWord) {
            char nextChar = current.children.keySet().iterator().next();
            prefix.append(nextChar);
            current = current.children.get(nextChar);
        }

        return prefix.toString();
    }
}
