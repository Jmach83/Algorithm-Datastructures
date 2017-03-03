/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queues;

import interfaces.Queue;
import java.util.NoSuchElementException;

/**
 *
 * @author Jmach
 */
public class Queues<T> implements Queue<T>
{

    T[] arr;
    int head;
    int tail;
    int size;

    public Queues(int size)
    {
        arr = (T[]) new Object[size];
        head = 0;
        tail = 0;
        size = 0;
    }

    @Override
    public void enqueue(T item)
    {
        arr[tail++] = item;
    }

    @Override
    public T dequeue() throws NoSuchElementException
    {
        return arr[head++];
    }

    @Override
    public T peek() throws NoSuchElementException
    {
        return arr[head];
    }

    @Override
    public int size()
    {
        return tail - head;  
    }

}
