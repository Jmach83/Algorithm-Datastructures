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
public class LinkedQueue<T> implements Queue<T>
{

    private class Node
    {

        T data;
        Node next;

        public Node(T data, Node next)
        {
            this.data = data;
            this.next = next;
        }

    }

    Node head = null;
    Node tail = null;

    @Override
    public void enqueue(T item)
    {
        Node node = new Node(item, null);

        if (isEmpty())
        {
            head = node;
        } else
        {
            tail.next = node;

        }
        tail = node;
    }

    @Override
    public T dequeue() throws NoSuchElementException
    {
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        T item = head.data;
        
        if(tail == head){
            tail = null;
        }
        
        head = head.next;
        return item;
    }

    @Override
    public T peek() throws NoSuchElementException
    {
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        return head.data;
    }

    @Override
    public int size()
    {
        int size = 0;
        for(Node n = head; n != null; n = n.next){
            size++;
        }
        return size;
    }

}
