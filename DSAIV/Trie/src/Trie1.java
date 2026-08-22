public class Trie1 {
    public Trienode1 root;
    Trie1(){
        root=new Trienode1();
    }
    public void insert(String word){
        Trienode1 curr=root;
        for (int i = 0; i < word.length(); i++) {
            int index=word.charAt(i)-'a';
            if(curr.children[index]==null){
                curr.children[index]=new Trienode1();
            }
            curr=curr.children[index];
        }
        curr.isEndWith=true;

    }
    public boolean search(String word){
        Trienode1 curr=root;
        for (int i = 0; i < word.length(); i++) {
            int index=word.charAt(i)-'a';
            if(curr.children[index]==null){
                return false;
            }
            curr=curr.children[index];
        }
        return curr.isEndWith;
    }
    public boolean startsWith(String word){
        Trienode1 curr=root;
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
class Trienode1{
    Trienode1[] children;
    boolean isEndWith;
    Trienode1(){
        children=new Trienode1[26];
        isEndWith=false;
    }
}
