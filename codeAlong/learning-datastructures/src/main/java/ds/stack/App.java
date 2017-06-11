/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds.stack;

/**
 *
 * @author Jmach
 */
public class App
{

    public static void main(String[] args)
    {
        Stack theStack = new Stack(3);
//        theStack.push(20);
//        theStack.push(40);
//        theStack.push(60);
//        theStack.push(80);
//        theStack.push(100);

        while (!theStack.isEmpty())
        {
            long value = theStack.pop();
            System.out.println(value);
        }

        reverseString("Hello");

    }

    public static String reverseString(String str)
    {
        Stack charStack = new Stack(str.length());
        String reverse = "";
        for (int i = 0; i < str.length(); i++)
        {
            charStack.push(str.charAt(i));
        }
        while (!charStack.isEmpty())
        {
            reverse = reverse + charStack.pop();
        }
            System.out.println(reverse);
        return str;
    }
}
