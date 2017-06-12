/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort;

/**
 *O(n2)
 * Deler array op I et sortet(subarray) og unsortet del
 */

public class InsertionSort
{
       public String[] insertion(String[] arr)
    {
        int holePosition;   //starter som sidste position i sorted subarray
        String valueToInsert;   //det element der er tiltænk at lægges i det sorted array

        for (int i = 1; i < arr.length; i++)
        {
            valueToInsert = arr[i];
            holePosition = i;

            while (holePosition > 0 && arr[holePosition - 1].compareTo(valueToInsert) > 0) //sortere inde i sub array'et, arg -> precedes = pos, arg -> follow = neg
            {
                arr[holePosition] = arr[holePosition - 1];  //swapper string i array
                holePosition = holePosition - 1; //ændre index for holeposition
            }

            arr[holePosition] = valueToInsert; //valueToinsert lægges i arr[holePosition]  
        }

        return arr;

    }
}
