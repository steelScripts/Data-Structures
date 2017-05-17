package model;

import java.util.List;

public class FriendGraph<E> extends LinkedListBasedDirectedGraphData{
	public void addContact(Vertex<E> startingVertex, Vertex<E> endingVertex) {
		if(getVertexMap().containsKey(startingVertex) && getVertexMap().containsKey(endingVertex)) {
			WeightedLinkedVertex<> currEdgeWeight = new WeightedLinkedVertex<>(endingVertex);
			startingVertexEdgeList.add(new WeightedLinkedVertex<>(endingVertex, weight));
	}

}
