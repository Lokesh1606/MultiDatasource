package LearnAndBasics.LEC1;

public class Trie {

    Trie links[] = new Trie[26];
    boolean flag = false;
    int count = 1;

    boolean containsKey(char ch ){
        return links[ch -'a'] == null;
    }

    Trie getNode(char ch){
        return links[ch -'a'];
    }
    void put(char ch, Trie trie){
        links[ch -'a'] = trie;
    }
    public boolean isEnd(){
        return flag;
    }
}
