

public class trie{
    static class Node{
        Node children[] = new Node[26];
        boolean eow = false;
        Node(){
            for(int i = 0;i<26;i++){
                children[i] = null;
            }
        }
    }
    public static Node root = new Node();
    public static void insert(String word){ // O(L) where L is the length of the word
        Node curr = root;
        for(int i = 0; i<word.length();i++){
            int idx = word.charAt(i) - 'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;

    }
    public static boolean search(String word){ // O(L) where L is the length of the word
        Node curr = root;
        for(int i = 0;i<word.length();i++){
            int a = word.charAt(i) - 'a';
             if(curr.children[a] == null){
                return false;
             }
             curr = curr.children[a];
        }
        return curr.eow == true;

    }
    public static void main(String[] args) {
        String[] words = {"the","a","there","their","any","thee"};
        for(int i = 0;i<words.length;i++){
            insert(words[i]);
        }

        String key = "thee";
        if(search(key)){
            System.out.println("Found");
        } else{
            System.out.println("Not Found");
        }
    }
}