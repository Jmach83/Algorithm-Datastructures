package sorting;


import java.util.Arrays;
import org.apache.commons.lang.time.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jmach
 */
public class InsertionSort
{

    StopWatch stopWatch = new StopWatch();

    public void insertionSort(int[] arr)
    {
        int holePosition;
        int valueToInsert;

        System.out.println("---------------Insertion sort--------------------");
        System.out.println("Unsortet: " + Arrays.toString(arr));

        stopWatch.start();
        for (int i = 1; i < arr.length; i++)
        {
            valueToInsert = arr[i];
            holePosition = i;

            while (holePosition > 0 && arr[holePosition - 1] > valueToInsert)
            {
                arr[holePosition] = arr[holePosition - 1];
                holePosition = holePosition - 1;
            }

            arr[holePosition] = valueToInsert;
        }
        stopWatch.stop();
        System.out.println("Sortet: " + Arrays.toString(arr));
        System.out.println("Time elapsed: " + stopWatch.getTime());
        stopWatch.reset();
    }

}
