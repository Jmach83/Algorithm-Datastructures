/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tables;

import interfaces.Graph;
import java.util.Collection;
import interfaces.Graph;
import java.io.PrintStream;
import interfaces.Graph;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Jmach
 */
public class LinkedGraph<D, W> implements Graph<D, W>
{
    private Collection<Vertex<D, W>> vertices = new ArrayList(); //arraylist til vertices.
    
    public LinkedGraph(D... data) { //constructor til LinkedGraph så der laves en liste af vertices.
        addVertex(data);
    }
    
    @Override
    public void addVertex(D... data)
    {
        for (D d : data) {
            vertices.add(new LinkedVertex(d));
        } 
    }

    @Override
    public void addEdge(W weight, Vertex<D, W> tail, Vertex<D, W> head, boolean directed) //forhold med nodes
    {
        Edge<D, W> edge = new LinkedEdge(weight, head);
        LinkedVertex t = (LinkedVertex) tail;
        t.addEdge(edge);
        if(directed) {
            addEdge(weight, head, tail, false);
        }
        
    }

    @Override
    public Collection<Vertex<D, W>> getVertices()
    {
         return vertices;
    }

    @Override
    public Collection<Edge<D, W>> getEdges()
    {
        List<Edge<D,W>> edges = new ArrayList();
        for (Vertex<D,W> v : vertices) {
            for(Edge<D,W> e : v.getAdjacentEdges()) {
                edges.add(e);
            }
        }  
        return edges;
    }

    @Override
    public Vertex<D, W> vertexOf(D data) {
        for (Vertex<D,W> v : vertices)  {
            if(v.getData().equals(data)) {
                return v;
            }
        }
        return null;
    }


    @Override
    public Collection<Edge<D, W>> getEdgesFrom(Vertex<D, W> vertex) {
        return vertex.getAdjacentEdges();
    }
    
    private class LinkedVertex implements Vertex<D, W> {
        
        private D data;
        private Collection<Edge<D, W>> adjacentEdges = new LinkedList();
        
        public LinkedVertex(D data) { // contructor til linkedlist af edges.
            this.data = data;
        }

        @Override
        public D getData() {
          return data;
        }

        @Override
        public Collection<Edge<D, W>> getAdjacentEdges() {
            return adjacentEdges;
        }
        
        public void addEdge(Edge<D, W> edge) {
            adjacentEdges.add(edge);
        }
        
    }
    
    private class LinkedEdge implements Edge<D, W> { //Detajler om edge
        
        private W weight;
        private Vertex<D,W> headVertex;
        
        public LinkedEdge(W weight, Vertex<D, W> headVertex) {
            this.weight = weight;
            this.headVertex = headVertex;
        }

        @Override
        public W getWeight() {
            return weight;
        }

        @Override
        public Vertex<D, W> getHeadVertex() {
            return headVertex;
        }
        
        
        
    }
    
}
