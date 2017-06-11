/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds.circularlinkedlist;

/**
 *
 * @author Jmach
 */
public class App
{
     public static void main(String[] args)
    {
        CircularLinkedList myList = new CircularLinkedList();
        myList.insertFirst(100);
        myList.insertFirst(50);
        myList.insertLast(99999);
        myList.insertFirst(99);
        myList.insertFirst(88);
        
        myList.display();
    }
}
