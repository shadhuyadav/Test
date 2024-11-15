package DSA;
class TrieNode{
    TrieNode[] children =new TrieNode[26];
    boolean isEndOfWord=false;
}
public class Trie {
    private final TrieNode root=new TrieNode();
    //Trie :Builds a trie and performs insertion and searches, useful fo prefix matching
    public void insert(String word){
        TrieNode node =root;
        for(char c:word.toCharArray()){
            int index=c-'a';
            if(node.children[index]==null){
                node.children[index]=new TrieNode();
            }
            node =node.children[index];
        }
        node.isEndOfWord=true;
    }
    public boolean search(String word){
        TrieNode node=root;
        for(char c: word.toCharArray()){
            int index=c-'a';
            if(node.children[index]==null)return false;
            node=node.children[index];
        }
        return node.isEndOfWord;
    }
    public static void main(String args[]){

        Trie trie=new Trie();
        trie.insert("hello");
        System.out.println("Search for 'hello':"+trie.search("hello"));

        System.out.println("Search for 'world':"+trie.search("world"));

    }
}
