/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds.queue;

/**
 *
 * @author Jmach
 */
public class Queue
{
    private int maxSize; 
    private long[] queArray;
    private int front;
    private int rear;
    private int nItems;
    
    public Queue(int size){
        this.maxSize = size;
        this.queArray = new long[size];
        front = 0;
        rear = -1;
        nItems = 0;
    }
    
    public void insert(long j){
        if(rear == maxSize -1){
            rear = -1;
        }
        
        rear++;
        queArray[rear] = j;
        nItems++;
    }
    
    public long remove(){ //remove item from the front of the queue
        long temp = queArray[front];
        front++;
        if (front == maxSize){
            front = 0;
        }
        
        nItems--;
        return temp;
    }
    
    public long peekFront(){
        return queArray[front];
    }
    
    public boolean isEmpty(){
        return (nItems == 0);
    }
    
    public boolean isFull(){
        return (nItems == 0);
    }
    
    public void view(){
        System.out.print("[ ");
        for(int i = 0; i <queArray.length; i++){
            System.out.print(queArray[i]+ " ");
        }
        System.out.println("]");
    }
}