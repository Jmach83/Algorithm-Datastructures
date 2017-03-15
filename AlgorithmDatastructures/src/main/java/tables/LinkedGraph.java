/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tables;

import interfaces.Graph;
import java.util.Collection;; 

import interfaces.Graph;

/**
 *
 * @author Jmach
 */
public class LinkedGraph<D, W> implements Graph<D, W>
{

    @Override
    public void addVertex(D... data)
    {
        //Gemmes i node
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addEdge(W weight, Vertex<D, W> tail, Vertex<D, W> head, boolean directed)
    {
        //gemmes i node
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Collection<Vertex<D, W>> getVertices()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Collection<Edge<D, W>> getEdges()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
