package tables;

import interfaces.Graph;
import interfaces.Graph.Edge;
import interfaces.Graph.Vertex;
import interfaces.Queue;
import queues.LinkedQueue;
import queues.Queues;
import java.util.HashSet;
import java.util.Set;

/**
 * Utility class for graph related functions.
 */
public class Graphs {
  
  public static <D,W> RootedTree<D,W> depthFirst(Graph<D,W> graph, Vertex<D,W> root) {
    Set<Vertex<D,W>> marked = new HashSet<>();
    RootedTree<D,W> edgesTo = new SimpleRootedTree<>(graph, root);
    
    // TODO: implement
    
    return edgesTo;
    }
  
  public static <D,W> RootedTree<D,W> breadthFirst(Graph<D,W> graph, Vertex<D,W> root) {
    Set<Vertex<D,W>> marked = new HashSet<>();
    Queue<Vertex<D,W>> queue = new LinkedQueue<>();
    RootedTree<D,W> edgesTo = new SimpleRootedTree<>(graph, root);
    
    // TODO: implement

    return edgesTo;
    }

  }
