/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataStructure;

/**
 *
 * @author Jmach
 */
public class HashedSymbolTable<Key, Value> {

    private int kvPairs;
    private int tSize;
    private LinkedSymbolTable<Key, Value>[] st;
    
    public HashedSymbolTable() {
        this(997);
    }

    public HashedSymbolTable(int tSize) {   //angiver længde og initilisere st, og efterfølgende laver en liste i hvert st[index]
        this.tSize = tSize;
        st = (LinkedSymbolTable<Key, Value>[]) new LinkedSymbolTable[tSize];
        for (int i = 0; i < tSize; i++) {
            st[i] = new LinkedSymbolTable();
        }
    }

    private int hash(Key key) { //hash strategy
        return (key.hashCode() & 0x7fffffff) % tSize; //decides index for key
    }

    public Integer get(Key key) {
        return st[hash(key)].get(key); //går ind i st[index] som er hashed keys, og og finder key i den liste i st's index
    }

    public void put(Key key) { //samme som get bare at tilføje
        st[hash(key)].put(key);
    }
    
    public void print() {
        for (int i = 0; i < st.length; i++) {
           st[i].print();
        }
        
    }
    
}
