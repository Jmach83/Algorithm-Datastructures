/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.NoSuchElementException;

/**
 *
 * @author Jmach
 */
public interface Queue<T>
{
    void enqueue(T item);
    T dequeue() throws NoSuchElementException;
    T peek() throws NoSuchElementException;
    int size();
    default boolean isEmpty() {return size() == 0; }
}
