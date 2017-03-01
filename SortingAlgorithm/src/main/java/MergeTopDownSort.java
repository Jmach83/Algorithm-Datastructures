/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jmach
 */
public class MergeTopDownSort
{

    public int[] divideArray(int[] arr)
    {
        if (arr.length == 1)
        {
            return arr;
        }

        int[] l1 = new int[arr.length / 2];
        int[] l2 = new int[arr.length - l1.length];

        for (int i = 0; i < l1.length; i++)
        {
            l1[i] = arr[i];
        }
        for (int i = arr.length / 2 + 1; i < arr.length; i++)
        {
            int j = 0;
            l2[j] = arr[i];
            j++;
        }

        l1 = divideArray(l1);
        l2 = divideArray(l2);

        return mergeSortTopDownSort(l1, l2);

    }

    private int[] mergeSortTopDownSort(int[] l1, int[] l2)
    {
        int[] l3 = new int[l1.length + l2.length];

        int j = 0; //l2
        int k = 0; //l1
        int i = 0; //l3

        while (l1.length - 1 >= k && l2.length - 1 >= j)
        {

            if (l1[k] > l2[j])
            {
                l3[k] = l2[j];
                j++;
                i++;
            } else
            {
                l3[i] = l1[k];
                k++;
                i++;
            }

        }

        while (l1.length - 1 >= k)
        {

            l3[i] = l1[k];
            k++;
            i++;

        }

        while (l2.length - 1 >= j)
        {

            l3[i] = l2[j];
            j++;
            i++;
            
        }

        return l3;
    }

}
