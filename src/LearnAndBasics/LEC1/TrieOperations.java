package LearnAndBasics.LEC1;

public class TrieOperations {
    private static Trie root;
    public TrieOperations() {
        root = new Trie();
    }

    public void insertWords(String word){
        Trie trie = root;
        for ( int i =0; i< word.length(); i++){
            if(trie.containsKey(word.charAt(i))){
                trie.put(word.charAt(i), new Trie());
            }
            trie = trie.getNode(word.charAt(i));
        }
        trie.flag = true;
    }

    public boolean search(String word){
        Trie node = root;

        for(int i =0;i< word.length();i++){
            if(node.containsKey(word.charAt(i))){
                return false;
            }
            node = node.getNode(word.charAt(i));
        }
        if(node.isEnd()){
            return true;
        }
        return false;
    }

    public boolean startWith(String word){
        Trie node = root;
        for(int i =0;i<word.length() ; i++){
            if(node.containsKey(word.charAt(i))){
                return false;
            }
            node = node.getNode(word.charAt(i));
        }

        return true;
    }

    public int distinctSubStrings(String values){

        int count = 1;

        for(int j = 0; j <values.length();j++){
            Trie node = root;
            for(int i = j;i< values.length(); i++){
                if(node.containsKey(values.charAt(i))){
                    node.put(values.charAt(i), new Trie());
                    count++;
                }
                node = node.getNode(values.charAt(i));
            }
        }
        return count;
    }
    public String longestCommonSubstring(String[] values){
        String result = "";

        for(String value : values){
            Trie node = root;
            for(int i =0;i<value.length(); i++){
                if(node.containsKey(value.charAt(i))){
                    node.put(value.charAt(i), new Trie());
                    node.count = 1;
                }else{
                    node.count = node.count +1;
                }
                node = node.getNode(value.charAt(i));
            }
        }

        for(String value : values){
            Trie node = root;
            result ="";
            for(int i =0;i<value.length(); i++){

                if(node.count == values.length){
                    result = result+ value.charAt(i);
                    System.out.println("came here "+result+" node count"+node.count);
                }
                node = node.getNode(value.charAt(i));
            }
        }
        return result;
    }
}
