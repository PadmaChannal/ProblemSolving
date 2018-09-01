// Implementing BFS. Reference Geeks for Geeks

import java.*;
import java.util.*;
public class GraphTraversalBFS {
	int v;
	LinkedList <Integer> adj[];
	// create a adjacency list for representing a Graph
	 GraphTraversalBFS (int V) {
		this.v = V;
		adj = new LinkedList[v];
		
		for(int i = 0; i<v; i++) {
			adj[i] = new LinkedList();
		}
	}
	 
	 // add edges
	 void addEdge(int v, int e) {
		 adj[v].add(e);
	 }
	 
	 // iterate through graph
	 void BFS (int n) {
		 
		 // mark visited
		 boolean visited[] = new boolean[v];
		 
		 // create a queue
		 LinkedList<Integer> queue = new LinkedList<Integer>();
		 
		 // add present to queue and mark it as visited
		visited[n] = true;
		queue.add(n);
		
		 
		 while(queue.size()!=0) {
			 n= queue.poll();
			 System.out.print(n + " ");
			 Iterator<Integer> i = adj[n].listIterator();
	            while (i.hasNext())
	            {
	                int s = i.next();
	                if (!visited[s])
	                {
	                    visited[s] = true;
	                    queue.add(s);
	                }
	            }
			 
		 }
	 }
	 
	
	public static void main(String[] args) {
		
		GraphTraversalBFS g = new GraphTraversalBFS(4);
		 
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
 
 
        g.BFS(2);
		
	}

}
