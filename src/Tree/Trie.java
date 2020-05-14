package Tree;

public class Trie {
    class TrieNode{

        private boolean isEnd;
        TrieNode[] children;

        public TrieNode(){
            children = new TrieNode[26];
        }

        public boolean containsKey(char ch){
            return children[ch - 'a'] != null;
        }

        public TrieNode get(char c){
            return children[c - 'a'];
        }

        public void add(char c, TrieNode node){
            children[c - 'a'] = node;
        }

        public boolean isEnd(){
            return isEnd;
        }

        public void setEnd(){
            isEnd = true;
        }

    }

    TrieNode root;

    public Trie(){
        root = new TrieNode();
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode node = root;
        for(int i = 0; i < word.length(); i++){
            char currentChar = word.charAt(i);
            if(!node.containsKey(currentChar)){
                node.add(currentChar, new TrieNode());
            }
            node = node.get(currentChar);
        }
        node.setEnd();
    }

    private TrieNode searchPrefix(String word) {
        TrieNode node = root;
        for (int i = 0; i < word.length(); i++) {
            char curLetter = word.charAt(i);
            if (node.containsKey(curLetter)) {
                node = node.get(curLetter);
            } else {
                return null;
            }
        }
        return node;
    }

    // Returns if the word is in the trie.
    public boolean search(String word) {
        TrieNode node = searchPrefix(word);
        return node != null && node.isEnd();
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TrieNode node = searchPrefix(prefix);
        return node != null;
    }

}
