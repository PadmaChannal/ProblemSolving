// Reference : Geeks for geeks
import java.util.*;
import java.*;
//Constructing a Graph (Adjacency List--> Array of LinkedLists)
class Graph {
	int V;
	LinkedList<Integer> adj[];
	Graph(int v){
		this.V = v;
		adj = new LinkedList[V];
		for(int i = 0; i < v; i++) {
			adj[i] = new LinkedList();
		}
	}
	void addEdge(int v, int w) {
		adj[v].add(w);	
		
	}
	
	void DFS(int s)
    {
        // Initially mark all vertices as not visited
        Vector<Boolean> visited = new Vector<Boolean>(V);
        for (int i = 0; i < V; i++)
            visited.add(false);
 
        // Create a stack for DFS
        Stack<Integer> stack = new Stack<>();
         
        // Push the current source node
        stack.push(s);
         
        while(stack.empty() == false)
        {
            // Pop a vertex from stack and print it
            s = stack.peek();
            stack.pop();
             
            // Stack may contain same vertex twice. So
            // we need to print the popped item only
            // if it is not visited.
            if(visited.get(s) == false)
            {
                System.out.print(s + " ");
                visited.set(s, true);
            }
             
            // Get all adjacent vertices of the popped vertex s
            // If a adjacent has not been visited, then puah it
            // to the stack.
            Iterator<Integer> itr = adj[s].iterator();
             
            while (itr.hasNext()) 
            {
                int v = itr.next();
                if(!visited.get(v))
                    stack.push(v);
            }
             
        }
    }
	
}


public class GraphTraversalDFS {
	
	public static void main(String[] args) {
		
		Graph g = new Graph(4);
		 	g.addEdge(0, 1);
	        g.addEdge(0, 2);
	        g.addEdge(1, 2);
	        g.addEdge(2, 0);
	        g.addEdge(2, 3);
	        g.addEdge(3, 3);
	        
	        g.DFS(2);
	  
	        
	}
}

