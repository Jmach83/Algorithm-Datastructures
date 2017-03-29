package sorting;


import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jmach
 */
public class RandomArray
{
    private int[] arr;
    
    public int[] createFillArray(int size)
    {
        arr = new int[size];

        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = new Random().nextInt(10000);
        }

        return arr;
    }
    
}
