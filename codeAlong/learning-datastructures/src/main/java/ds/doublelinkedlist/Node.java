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
public class Node
{
    public int data;
    public Node next;
    public Node previous;
    
    public void displayNode(){
        System.out.print("{"+data+"}");
    }
}
