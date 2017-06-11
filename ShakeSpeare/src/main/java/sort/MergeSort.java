/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort;

/**
 *0(log n)
 * Top down merge, deler array indtil basecase(array længde 1)
 * samler til større array igen hvert skridt ved at sammenligne element
 */
public class MergeSort
{
    public String[] mergeSorting(String[] arr)
    {

        if (arr.length >= 2) 
        {
            String[] left = new String[arr.length / 2];    //halvere array
            String[] right = new String[arr.length - arr.length / 2];

            for (int i = 0; i < left.length; i++) //kopier elementer over i array left og right
            {
                left[i] = arr[i];
            }
            for (int i = 0; i < right.length; i++)
            {
                right[i] = arr[i + arr.length / 2]; //starter midt i array da det er højre
            }

            mergeSorting(left); //recursive - kalder sig selv og deler hver halvdel igen
            mergeSorting(right);

            merge(arr, left, right); // sorter og samler array
        }
        return arr;
    }

    private static void merge(String[] result, String[] left, String[] right)
    {
        int i1 = 0; //index for de 2 arrays der skal samles   2     
        int i2 = 0;//2
        for (int i = 0; i < result.length; i++) //result er det oprindelige array, som bliver overskrevet med det der bliver sorteret
        {
            if (i2 >= right.length || (i1 < left.length
                    && left[i1].compareToIgnoreCase(right[i2]) < 0))
            {
                result[i] = left[i1];
                i1++;
            } else
            {
                result[i] = right[i2];
                i2++;
            }
        }
    }
}
