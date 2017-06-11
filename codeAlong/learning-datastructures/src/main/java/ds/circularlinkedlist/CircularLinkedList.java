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
public class CircularLinkedList
{
    private Node first;
    private Node last;

    public CircularLinkedList()
    {
        this.first = null;
        this.last = null;
    }
    
    public void insertFirst(int data){
        Node newNode = new Node();
        newNode.data = data;
        
        if(iseEmpty()){
            last = newNode;
        }
        newNode.next = first; //newNode --> old first
        first = newNode;//first place
    }
    
    public void insertLast(int data){
      Node newNode = new Node();
      newNode.data = data;
      
      if(iseEmpty()){
          first = newNode;
      }else{
          last.next = newNode;//the next value of the last node will point to the new node
          last = newNode;//we make the new node we created be the last one in the list
      }
    }
    
    public int deleteFirst(){
        int temp = first.data;
        
        if (first.next == null)
        {
            last = null;
        }
        
        first = first.next;//first will point to old's next value (garbage collector fjerner når der mangler reference)
        return temp;
    }
    
    public void display(){
        System.out.println("List (first --> last)");
        Node current = first;
        while (current != null)
        {            
            current.displayNode();
            current = current.next;
        }
        System.out.println();
    }

    private boolean iseEmpty()
    {
        return (first == null);
    }
    
    
}
