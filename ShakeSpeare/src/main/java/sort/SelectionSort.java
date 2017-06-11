/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort;

/**
 *O(n2)
 * søger hele resterende ikke sorteret array igennem og swapper med laveste
 */
public class SelectionSort
{
    public String[] selection(String[] arr)
    {
        
        for (int i = 0; i < arr.length - 1; i++)
        {
            int min = i;

            for (int j = i + 1; j < arr.length; j++) //finder mindste element af ikke sorteret del
            {
                if (arr[j].compareTo(arr[min]) < 0)
                {
                    min = j;
                }
            }
            if (min != i)   //swapper så mindste element bliver del af sortet del
            {
                String temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }

        return arr;
    }

 
}
