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
public class Trie2 {

    private static int R = 256; // radix
    private Node root;          // root of trie

    private static class Node {

        private Integer val = 0;
        private Node[] next = new Node[R];
    }

    public Integer get(String key) {
        Node x = get(root, key, 0);
        if (x == null) {
            return null;
        }
        return x.val;
    }

    private Node get(Node x, String key, int d) {  // Return value associated with key in the subtrie rooted at x.
        if (x == null) {
            return null;
        }
        if (d == key.length()) {
            return x;
        }
        char c = key.charAt(d); // Use dth key char to identify subtrie.
        return get(x.next[c], key, d + 1);
    }

    public void put(String key) {
        root = put(root, key, 1, 0);
    }

    private Node put(Node x, String key, int val, int d) {  // Change value associated with key if in subtrie rooted at x.
        if (x == null) {
            x = new Node();
        }
        if (d == key.length()) {
            x.val++;
            return x;
        }
        char c = key.charAt(d); // Use dth key char to identify subtrie.
        x.next[c] = put(x.next[c], key, val, d + 1);
        return x;
    }
    
    public void print(PrintStream out) {
        if (root.val != null) {
            out.println(root.val);
        }
        if (root.next != null) {
            for (Node node : root.next) {
                if (node == null) {
                    continue;
                }
                print(out);
            }
        }
    }
    
    public static void main(String[] args) {
    Trie2 trie = new Trie2();
    trie.put("ANNA");
    trie.put("ANNA");
    trie.put("ANDERS");
    
    System.out.println(trie.get("ANNA"));
    System.out.println(trie.get("ANDERS"));
    System.out.println(trie.get("ANDERSINE"));
    
    //trie.print(System.out);
    }
}

