/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queues;
import interfaces.PriorityQueue;
import java.util.NoSuchElementException;

/**
 *
 * @author Jmach
 */
public class PriorityQueues<T> implements PriorityQueue<Comparable<T>>
{

    @Override
    public void enqueue(Comparable<T> item)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Comparable<T> dequeue() throws NoSuchElementException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Comparable<T> peek() throws NoSuchElementException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int size()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
