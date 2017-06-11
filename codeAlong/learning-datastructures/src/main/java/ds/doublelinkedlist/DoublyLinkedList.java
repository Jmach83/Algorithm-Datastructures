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
public class DoublyLinkedList {

    private Node first;
    private Node last;

    public DoublyLinkedList() {
        this.first = null;
        this.last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(int data) {
        Node newNode = new Node();
        newNode.data = data;

        if (isEmpty()) {
            last = newNode;//if empty, last will refer to the new Node being created
        } else {
            first.previous = newNode;
        }

        newNode.next = first;//the new node's next field will point to the old first
        this.first = newNode;
    }

    public void insertLast(int data) {
        Node newNode = new Node();
        newNode.data = data;

        if (isEmpty()) {
            first = newNode;
        } else {
            last.next = newNode;//assigning old last to newNode
        }

        newNode.previous = last;//the old last will be the newnodes previous
        this.last = newNode;//the linkedlists last field should point to the new node
    }

    //assume non-empty list    
    public Node deleteFirst() {
        Node temp = first;
        if (first.next == null) {//there is only one item in list
            last = null;
        } else {
            first.next.previous = null;//we are assigning the reference of the node following the old first node to the
        }                              //first field in the linked list object

        first = first.next;
        return temp;//return the deleted old first node
    }

    //assume non-empty list
    public Node deleteLast() {
        Node temp = last;
        if (first.next == null) {//we only have one node in list
            last = null;
        } else {
            last.previous.next = null;//the last nodes previous nodes next field will point to null
        }

        last = last.previous;
        return temp;
    }

    //assume a non-empty list
    public boolean insertAfter(int key, int data) {
        Node current = first;//we start from the beginning of the list
        while (current.data != key) {//as long as we have not found the key in a particular node            
            current = current.next;
            if (current == null) {
                return false;
            }
        }

        Node newNode = new Node();
        newNode.data = data;

        if (current == last) {
            current.next = null;
            last = newNode;
        } else {
            newNode.next = current.next;//new nodes next field should point to node ahead of the crurrent node
            current.next.previous = newNode;// the node ahead of current its previous field should be new node
        }

        newNode.previous = current;
        current.next = newNode;

        return true;
    }

    //assumenon-empty list
    public Node deleteKey(int key) {
        Node current = first;//starrt from the beginning

        while (current.data != key) {
            current = current.next;
            if (current == null) {
                return null;
            }
        }

        if (current == first) {
            first = current.next;//make the first field point to the node following current since current will be deleted
        } else {
            
            current.previous.next = current.next;
        }
        
        if(current == last) {
            last = current.previous;
        }else{
            current.next.previous = current.previous;
        }

        return current;
    }
    
    public void displayForward(){
        System.out.print("List (first --> last)");
        Node current = first;//start from beginning
        while (current != null) {            
            current.displayNode();//call the display method of the node
            current = current.next;//move to the next node
        }
        System.out.println("");
    }
    
    public void displayBackwards(){
        System.out.print("List (last --> first)");
        Node current = last;//start from end
        while (current != null) {            
            current.displayNode();//call the display method of the node
            current = current.previous;//move to the next node
        }
        System.out.println("");
    }
}
