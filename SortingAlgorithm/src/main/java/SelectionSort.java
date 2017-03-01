
import java.util.Arrays;
import org.apache.commons.lang.time.StopWatch;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jmach
 */
public class SelectionSort
{

    StopWatch stopWatch = new StopWatch();

    public void selectionSort(int[] arr)
    {
        System.out.println("---------------Selection sort--------------------");
        System.out.println("Unsortet: " + Arrays.toString(arr));

        stopWatch.start();
        for (int i = 0; i < arr.length - 1; i++)
        {
            int min = i;

            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr[j] < arr[min])
                {
                    min = j;
                }
            }
            if (min != i)
            {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }

        stopWatch.stop();
        System.out.println("Sortet: " + Arrays.toString(arr));
        System.out.println("Time elapsed: " + stopWatch.getTime());
        stopWatch.reset();

    }
}
