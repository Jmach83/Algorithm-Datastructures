/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.cphbusiness.algorithm.examples.queues;

import dk.cphbusiness.airport.template.Passenger;
import java.util.NoSuchElementException;

/**
 *
 * @author Jmach
 */
public class HeapQueue implements PriorityQueue<Passenger>
{

    private Passenger[] data;
    private int size = 0;

    public HeapQueue(int capacity)
    {
        this.data = new Passenger[capacity];
    }

    private int parentOf(int p)
    {
        return p / 2;
    }

    private int leftOf(int p)
    {
        return 2 * p;
    }

    private int rightOf(int p)
    {
        return 2 * p + 1;
    }

    @Override
    public void enqueue(Passenger passenger)
    {
        //data[0] index bruges til swap plads 
        int p = ++size;
        data[p] = passenger;
        int pp = parentOf(p);

        while (true)
        {

            if (pp == 0 || data[p].compareTo(data[pp]) > 0)
            {
                return;
            }
            data[0] = data[pp];     //refactor til en swap metode
            data[pp] = data[p];
            data[p] = data[0];
            p = pp;
            pp = parentOf(p);
        }
    }

    @Override
    public Passenger dequeue()
    {
        if (size == 0)
        {
            throw new NoSuchElementException();
        }

        Passenger result = data[1];

        data[0] = data[pp];     //refactor til en swap metode
        data[pp] = data[p];
        data[p] = data[0];
        p = pp;
        pp = parentOf(p);
        
        int n = 1;
        int c = 0;
        
        do {
            int l = leftOf(n);
            int r = rightOf(n);
            if(l > size){
                return result;
            }
            
            if(r > size) {
                c = l;
            } else if (data[l].compareTo(data[r]) < 0) {
                c = r;
            }
        }
        return result;

    }

    @Override
    public Passenger peek()
    {
        if (size == 0)
        {
            throw new NoSuchElementException();
        }

        Passenger result = data[1];
        return result;

    }

    @Override
    public int size()
    {
        return size;
    }

}