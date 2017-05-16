/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataStructure;

import java.io.PrintStream;

/**
 *
 * @author emmablomsterberg
 */
public class Trie {

    public static int SIZE = indexOf('Z') + 1;

    private String data = null;
    private int count = 0;
    private Trie[] tries = null;
    

    private static int indexOf(char letter) {
        return (int) (letter - 'A');
    }

    public void put(String word, String data, int d) {
        if (word.isEmpty()) {
            this.data = data;
        } else {
            char letter = word.charAt(0);
            int index = indexOf(letter);
            
            if (tries == null) {
                tries = new Trie[SIZE];
            }
            if (tries[index] == null) {
                tries[index] = new Trie();
            }
            if (d == data.length()) {
                T
            } 
            Trie trie = tries[index];
            trie.put(word.substring(1), data);
        }
    }

    public String get(String word) {
        if (word.isEmpty()) {
            return data;
        }
        if (tries == null) {
            return null;
        }
        char letter = word.charAt(0);
        int index = indexOf(letter);
        Trie trie = tries[index];
        if (trie == null) {
            return null;
        }
        return trie.get(word.substring(1));
    }

    public void print(PrintStream out) {
        if (data != null) {
            out.println(data);
        }
        if (tries != null) {
            for (Trie trie : tries) {
                if (trie == null) {
                    continue;
                }
                trie.print(out);
            }
        }
    }
    public static void main(String[] args) {
    Trie trie = new Trie();
    trie.put("ANNA", "ANNA");
    trie.put("ANNA", "ANNA");
    trie.put("ANDERS", "ANDERS");
    
    System.out.println(trie.get("ANNA"));
    System.out.println(trie.get("ANDERS"));
    System.out.println(trie.get("ANDERSINE"));
    
    trie.print(System.out);
    }
}
