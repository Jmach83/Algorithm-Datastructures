/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algo.linearsearch;

/**
 *
 * @author Jmach
 */
public class LinearSearch {
    
    public int linearSearch(int[] a, int x){
        for (int i = 0; i < a.length; i++) {
            if(a[i] == x){
                return i;
            }            
        }
        return -1;
    }
}
