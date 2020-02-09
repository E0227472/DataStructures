package com.datastructures.tries;

import java.util.HashMap;
/*
Map stores the characters and the corresponding node.
Each TrieNode HashMap can store multiple characters and TrieNode
*/
public class TrieNode {
    private final int ALPHABET_SIZE = 26;

    // array index = Character value stored; value = node

   private TrieNode[] children = new TrieNode[ALPHABET_SIZE];

    // isEndOfWord is true if the node represents
    // end of a word
    private boolean isEndOfWord;

    public TrieNode[] getChildren() {
        return children;
    }

    public void setChildren(TrieNode[] children) {
        this.children = children;
    }

    public boolean isEndOfWord() {
        return isEndOfWord;
    }

    public void setEndOfWord(boolean endOfWord) {
        isEndOfWord = endOfWord;
    }

    TrieNode(){
        isEndOfWord = false;
        for (int i = 0; i < ALPHABET_SIZE; i++)
            children[i] = null;
    }
}
