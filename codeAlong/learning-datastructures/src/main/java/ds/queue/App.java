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
public class App
{
    public static void main(String[] args)
    {
        Queue myQue = new Queue(5);
        myQue.insert(100);
        myQue.insert(1000);
        myQue.insert(14);
        myQue.insert(12);
        myQue.insert(44);
        myQue.insert(1);
        myQue.insert(2);
        myQue.insert(3);
        myQue.view();
    }
}
