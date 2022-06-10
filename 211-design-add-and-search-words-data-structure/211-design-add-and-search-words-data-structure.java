class TrieNode{
    Map<Character, TrieNode> children = new HashMap<>();
    boolean isWord = false;
    public TrieNode(){}
}
class WordDictionary {
    TrieNode root;

    public WordDictionary() {
        root = new TrieNode();
    }
    
    public void addWord(String word) {
        TrieNode node = root; 
        for(Character c : word.toCharArray()){
            if(!node.children.containsKey(c))
                node.children.put(c, new TrieNode());
            node = node.children.get(c);
        }
        node.isWord = true;
    }
    
    public boolean search(String word) {
        return searchWord(root,word);
    }
    
    private boolean searchWord(TrieNode node,String word){
        
        for(int i=0;i<word.length();i++){
            char c = word.charAt(i);
            if(!node.children.containsKey(c)){
                if(c=='.'){
                    for(char x : node.children.keySet()){
                        TrieNode child = node.children.get(x);
                        if(searchWord(child, word.substring(i+1)))return true;
                    }
                }
                return false;
            } else
                node = node.children.get(c);
        }
        return node.isWord;
    }

}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */