package main;

import java.io.IOException;
import java.util.Arrays;
import dataStructure.*;
import sort.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jmach
 */
public class Main
{

    public static void main(String[] args) throws IOException
    {
        InsertionSort insertion = new InsertionSort();
        SelectionSort selection = new SelectionSort();
        MergeSort merge = new MergeSort();
        StopWatch timer = new StopWatch();
        
        String[] shortWordArr = Reader.toStringArray("shakespearetext.txt", "[^A-Za-z]");
        String[] shortWordArr2 = Reader.toStringArray("shakespearetext.txt", "[^A-Za-z]");
        String[] longWordArr = Reader.toStringArray("shakespearetext 2.txt", "[^A-Za-z]");


//***********************************SORTING************************************
        
//System.out.println("selection"+Arrays.toString(selection.selection(shortWordArr)));

//System.out.println("insertion"+Arrays.toString(insertion.insertion(shortWordArr2)));

//merge.mergeSorting(shortWordArr2);
//System.out.println(Arrays.toString(shortWordArr2));
        


//****************************DATASTRUCTURE*************************************

//        LinkedSymbolTable<String, Integer> st = new LinkedSymbolTable<>();
//        for (int i = 0; i < shortWordArr.length; i++)
//        {
//            st.put(shortWordArr[i]);
//        }        
//        st.print();

//        ArraySymbolTable<String, Integer> ast = new ArraySymbolTable<>();//        
//        for (int i = 0; i < shortWordArr.length; i++) {
//            ast.put(shortWordArr[i]);
//        }
//        
//        System.out.println(ast.print());
//        System.out.println("size " + ast.size());

//        HashedSymbolTable<String, Integer> hash = new HashedSymbolTable<>();
//        for (int i = 0; i < shortWordArr2.length; i++) {
//            hash.put(shortWordArr2[i]);
//        }
//        
//        hash.print();




 //*****************************************************************************     
 
 
 
 
 
 
 
 

//        System.out.println(Arrays.toString(longWordArr));
//        
//        timer.stopWatch();
//        
//        System.out.println("Elapsed time: " + timer.elapsedTime());
//        
//        timer.stopWatch();
//        
//        System.out.println("Elapsed time: " + timer.elapsedTime());
//        
//        timer.stopWatch();
//        System.out.println("merge"+Arrays.toString(merge.mergeSorting(longWordArr)));
//        System.out.println("Elapsed time: " + timer.elapsedTime());
        


//        
    
//        
//        String[] arr2 = new String[3];
//        for (String word : arr) {
//            System.out.println(word.toUpperCase());
//        }
//         
//        String test = "test";
       // Trie2 trie = new Trie2();
        //for (int i = 0; i < longWordArr.length; i++) {
          //  trie.put(longWordArr[i].toUpperCase());
        //}
       
    }
}
