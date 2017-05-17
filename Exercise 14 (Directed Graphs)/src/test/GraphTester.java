package test;

import model.GraphDataInterface;
import model.LinkedListBasedDirectedGraphData;
import model.Vertex;

public class GraphTester {

	public static void main(String[] args) {
		//GraphDataInterface<String> graph = new AdjacencyMatrixBasedNonDirectedGraphData<String>();
		GraphDataInterface<String> graph = new LinkedListBasedDirectedGraphData<String>();
		Vertex<String> tom = new Vertex<String>("Tom", "Tom");
		Vertex<String> fred = new Vertex<String>("Fred", "Fred");
		Vertex<String> sue = new Vertex<String>("Sue", "Sue");
		Vertex<String> ben = new Vertex<String>("Ben", "Ben");
		Vertex<String> amy = new Vertex<String>("Amy", "Amy");
		
		graph.addVertex(tom);
		graph.addVertex(fred);
		graph.addVertex(sue);
		graph.addVertex(ben);
		graph.addVertex(amy);
		
		graph.addEdge(tom,  amy, 3);
		graph.addEdge(tom,  fred, 5);
		graph.addEdge(tom,  ben, 1);
		graph.addEdge(amy,  ben, 6);
		graph.addEdge(amy,  sue, 8);
		graph.addEdge(fred,  sue, 2);
		graph.addEdge(sue,  ben, 2);
		
		System.out.println(graph);
		graph.removeEdge(tom,  fred);
		System.out.println(graph);
		System.out.println("Is there an edge between Sue and Amy? ");
		System.out.println(graph.hasEdge(sue,  amy));
		
		System.out.println();
		System.out.println("Removing edge between Sue and Amy.");
		graph.removeEdge(sue,  amy);
		System.out.println();
		System.out.println("Is there an edge between Sue and Amy? ");
		System.out.println(graph.hasEdge(sue,  amy));
		
	}

}
