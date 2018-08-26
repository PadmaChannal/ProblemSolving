// Given a directed graph - Design an algorithm to find whether there is route between nodes
import java.util.*;
import java.*;
public class RouteBetweenNodes {
	
	// create a graph
	int v;
	LinkedList<Integer> adl[];
	RouteBetweenNodes (int v){
		adl = new LinkedList[v];
		for(int i = 0; i < v; i++) {
			adl[i] = new LinkedList();
		}		
	}
	// add edges
	void addEge(int v, int e) {
		adl[v].add(e);
	}

	
}



