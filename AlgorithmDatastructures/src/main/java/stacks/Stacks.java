/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stacks;
import interfaces.Stack;
/**
 *
 * @author Jmach
 */
public class Stacks<T> implements Stack<T>
{
    int top;
    T[] stack;
    
    public Stacks(int size)
    {
        stack = (T[]) new Object[size];
    }
    

    @Override
    public void push(T item)
    {
        stack[top++] = item;
    }

    @Override
    public T pop()
    {
        return stack[top--];
    }

    @Override
    public T peek()
    {
        return stack[top];
    }
    
    @Override
    public int size()
    {
        return top;
    }

    
}
