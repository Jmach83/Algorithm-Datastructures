/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author Jmach
 */
public interface Stack<T>
{
    void push(T item);
    T pop();
    T peek();
    int size();
    default boolean isEmpty() {return size() == 0; }        
}
