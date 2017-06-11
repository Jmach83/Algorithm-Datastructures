/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataStructure;

/**
 *
 * @author emmablomsterberg
 */
public class ArraySymbolTable<Key, Value> {

    private Key[] keys;
    private Integer[] values;
    private int n = 0;

    private int startSize = 1;

    public ArraySymbolTable() {
        keys = (Key[]) new Object[startSize];
        values = new Integer[startSize];
    }

    public int size() {
        return n;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    private void resize(int size) {     //resize bliver kaldt i put
        Key[] tempkey = (Key[]) new Object[size];
        Integer[] tempval = new Integer[size];

        for (int i = 0; i < n; i++) {
            tempkey[i] = keys[i];
        }

        for (int i = 0; i < n; i++) {
            tempval[i] = values[i];
        }

        keys = tempkey;
        values = tempval;

    }

    public void put(Key key) {

        for (int i = 0; i < n; i++) {

            if (key.equals(keys[i])) { //finder key hvis den eksistere og tælle value op

                values[i]++;

            }
        }
        if (n >= values.length) { //hvis array values er fyldt, dobbler det op

            resize(2 * n);
        } else {                    // tilføjer key og value hvis key ikke eksistere
            values[n] = 1;
            keys[n] = key;
            n++;
        }
    }

    public String print() {
        String result = "";
        for (int i = 0; i < n; i++) {

            result += "Key: " + keys[i] + "|  Value: " + values[i] + " \n";
        }
        return result;
    }

}
