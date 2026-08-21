public class Trie {
    public TrieNode root;
    Trie(){
        root=new TrieNode();
    }
    public void insert(String word){
        TrieNode curr=root;
        for (int i = 0; i < word.length(); i++) {
            char c=word.charAt(i);
            int index=c-'a';
            if(curr.children[index]==null){
                curr.children[index]=new TrieNode();
            }
            curr=curr.children[index];
        }
        curr.isEndofWord=true;
    }
    public boolean search(String word){
        TrieNode curr=root;
        for (int i = 0; i < word.length(); i++) {
            int index=word.charAt(i)-'a';
            if(curr.children[index]==null){
                return false;
            }
            curr=curr.children[index];
        }
        return curr.isEndofWord;
    }
    public boolean startsWith(String word){
        TrieNode curr=root;
        for (int i = 0; i < word.length(); i++) {
            int index=word.charAt(i)-'a';
            if(curr.children[index]==null){
                return false;
            }
            curr=curr.children[index];
        }
        return true;
    }
}
class TrieNode{
    TrieNode[] children;
    boolean isEndofWord;
    TrieNode(){
        children=new TrieNode[26];
        isEndofWord=false;
    }
}
