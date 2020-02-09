package com.datastructures.tries;

public class TrieImplementation {

    public static void main(String...args) {
        Trie trie = new Trie(new TrieNode());

        trie.insert("programming");
        trie.insert("program");
        trie.insert("apple");

        System.out.println(trie.find("progr"));



    }
}
