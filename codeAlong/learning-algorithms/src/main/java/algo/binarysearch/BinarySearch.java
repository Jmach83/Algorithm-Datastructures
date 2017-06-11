/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algo.binarysearch;

/**
 *
 * @author Jmach
 */
public class BinarySearch {
    
    public int binarySearch(int[] a, int x){
        int p = 0;
        int r = a.length-1;
        
        while (p <= r) {            
           int q = (p+r)/2;
           if(x < a[q]) r = q-1;
           else if(x > a[q]) p = q+1;
           else return q;
        }
        return -1;
    }
}
