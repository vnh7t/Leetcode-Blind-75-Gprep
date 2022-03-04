class TrieNode{
    Map<Character,TrieNode> alpha;
    boolean isLast;
    public TrieNode(){
        alpha=new HashMap<Character,TrieNode>();
        isLast=false;
    }
}
class Trie {
    TrieNode root;
    public Trie() {
        root=new TrieNode();
    }
    
    public void insert(String word) {
        TrieNode curr=root;
        for (int i=0;i<word.length();i++)
        {
            if(!curr.alpha.containsKey(word.charAt(i))){
                curr.alpha.put(word.charAt(i),new TrieNode());
            }
            curr=curr.alpha.get(word.charAt(i));
        }
        curr.isLast=true;
    }
    
    public boolean search(String word) {
        
        TrieNode curr=root;
        for (int i=0;i<word.length();i++)
        {
            if(!curr.alpha.containsKey(word.charAt(i))){
                return false;
            }
            curr=curr.alpha.get(word.charAt(i));
        }
       return curr.isLast==true;
    }
    
    public boolean startsWith(String prefix) {
        TrieNode  curr=root;
        for (int i=0;i<prefix.length();i++)
        {
            if(!curr.alpha.containsKey(prefix.charAt(i))){
                return false;
            }
            curr=curr.alpha.get(prefix.charAt(i));
        }
       return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
