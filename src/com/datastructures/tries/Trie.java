package com.datastructures.tries;

/*
Implementation of the trie data structure
*/
public class Trie {

    private TrieNode trieNode;

    public Trie(TrieNode trieNode) {
        this.trieNode = trieNode;
    }

    /*
    Each time new string inserted, start from the root node. Then check if the prefix is present.
    If prefix is not present (or same pattern), then treated as new string and new nodes created.
    */
    public void insert(String word) {
        int index;
        TrieNode current = trieNode; // root node

        for (int i = 0; i < word.length(); i++) {
            TrieNode[] trieNodes = current.getChildren();
            index = word.charAt(i) - 'a';

            if (trieNodes[index] == null) {
                trieNodes[index] = new TrieNode();
                current.setChildren(trieNodes);
            }


            current = trieNodes[index];
        }

        current.setEndOfWord(true);
    }

    public boolean find(String word) {
        TrieNode current = trieNode;
        int index;

        for (int level = 0; level < word.length(); level++) {
            index = word.charAt(level) - 'a';
            TrieNode[] trieNodes = trieNode.getChildren();

            if (trieNodes[index] == null) {
                return false;
            }

            trieNode = trieNodes[index];
        }

        return (trieNode != null && trieNode.isEndOfWord());
    }
}

