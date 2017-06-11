/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds.doublelinkedlist;

/**
 *
 * @author Jmach
 */
public class App {
    public static void main(String[] args) {
        DoublyLinkedList theList = new DoublyLinkedList();
        theList.insertFirst(22);
        theList.insertFirst(44);
        theList.insertFirst(66);
        theList.insertLast(11);
        theList.insertLast(33);
        theList.insertLast(55);
        theList.displayForward();
        theList.displayBackwards();
        theList.deleteFirst();
        theList.deleteLast();
        theList.deleteKey(11);
        theList.displayForward();
        theList.insertAfter(22, 77);
        theList.insertAfter(33, 88);
        theList.displayBackwards();
        
    }
}
