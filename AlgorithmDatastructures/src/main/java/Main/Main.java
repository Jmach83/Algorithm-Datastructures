package Main;


import queues.Queues;
import java.util.Arrays;
import sun.misc.Queue;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author Jmach
 */
public class Main
{
    public static void main(String[] args)
    {
//        RandomArray createArray = new RandomArray();
//        MergeTopDownSort merge = new MergeTopDownSort();
        
        
//        int[] arr1 = createArray.createFillArray(100000);
//        int[] arr2 = createArray.createFillArray(100000);
//        int[] arr3 = createArray.createFillArray(10);
        
//        System.out.println(Arrays.toString(arr3));
        
        
//        System.out.println(Arrays.toString(merge.divideArray(arr3)));
        
          Queues arr = new Queues(10);
          
          for (int i = 0; i < 10; i++)
        {
            arr.enqueue(i);
        }
          
          System.out.println(arr.peek());
          System.out.println(arr.dequeue());
          System.out.println(arr.peek());
          arr.enqueue(12);
          System.out.println(arr.peek());
        
        
        
    }
}
