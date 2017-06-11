/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adt;

/**
 *
 * @author Jmach
 */
public class Counter
{
    private String name;
    private int value;

    public Counter(String name)
    {
        value = 0;
        this.name = name;
    }
    
    public void increment(){
        value++;
    }
    
    public int getCurrentValue(){
        return value;
    }

    @Override
    public String toString()
    {
        return "name: " + name + " value: " + value;
    }
    
    
    
    
    
}
