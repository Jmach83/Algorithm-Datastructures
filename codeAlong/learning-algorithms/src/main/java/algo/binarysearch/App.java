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
public class App {
    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        //System.out.println(bs.binarySearch(new int[] {1,2,3,4,7,9,12,18}, 33));
        System.out.println(recursiveBinarySearch(new int[] {1,2,3,4,7,9,12,18}, 0, 7, 12));
    }
    //p startindex, r slutindex, x element der skal findes, q "midt" index
    public static int recursiveBinarySearch(int[] a, int p, int r, int x){
        System.out.println("["+p+"..."+r+"]");
        if(p > r){
            return -1;
        }else{
            int q = (p+r)/2;
            if(a[q] == x){
                return q;
            }else if(a[q] > x){
                return recursiveBinarySearch(a, p, q-1, x);
            }else{
                return recursiveBinarySearch(a, q+1, r, x);
            }
        }
    }
}
