/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds.trie;

import java.util.List;

/**
 *
 * @author Jmach
 */
public class App {
    public static void main(String[] args) {
        Trie trie = new Trie();
        
       trie.insert("adam");
       trie.insert("adr");
       trie.insert("adda");
       trie.insert("adada");
       trie.insert("adazzz");
       
       List<String> list = trie.allWordsWithPrefix("ada");
       
        for (String s : list) {
            System.out.println(s);
        }
        
        
    }
}
