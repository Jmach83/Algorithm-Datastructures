/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlists;

/**
 *
 * @author Jmach
 */
public class App
{
    public static void main(String[] args)
    {
        Node nodeA = new Node();
        nodeA.data = 4;
        
        Node nodeB = new Node();
        nodeA.data = 3;
        
        Node nodeC = new Node();
        nodeA.data = 7;
        
        Node nodeD = new Node();
        nodeA.data = 8;
        
        nodeA.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;
        
        System.out.println(listLength(nodeA));
        System.out.println(listLength(nodeB));
        
        
    }
    
    public static int listLength(Node aNode){
        int length = 0;
        Node currentNode = aNode;
        
        while(currentNode != null){
            length++;
            currentNode = currentNode.next;            
        }
       
        return length;
    }
}
