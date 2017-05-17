package model;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class LinkedListBasedDirectedGraphData<E> implements GraphDataInterface<E> {
	/********Class Variables********/
	private Map<Vertex<E>, List<WeightedLinkedVertex<E>>> vertexMap = null;
	
	/********Getters/Setters*******/
	public Map<Vertex<E>, List<WeightedLinkedVertex<E>>> getVertexMap() {
		if(vertexMap == null){
			vertexMap = new HashMap<Vertex<E>, List<WeightedLinkedVertex<E>>>();
		}
		return vertexMap;
	}
	

	@Override
	public void addVertex(Vertex<E> v) {
		// TODO Auto-generated method stub
		List<WeightedLinkedVertex<E>> edgeList = new LinkedList<WeightedLinkedVertex<E>>();
		getVertexMap().put(v, edgeList);
	}

	@Override
	public void removeVertex(Vertex<E> v) {
		// TODO Auto-generated method stub
		getVertexMap().remove(v);
		
		for(List<WeightedLinkedVertex<E>> edgeList : getVertexMap().values()) {
			for(WeightedLinkedVertex<E> wlv : edgeList) {
				removeEdge(wlv.getVertex(), v);
			}
		}			
		
	}

	@Override
	public void addEdge(Vertex<E> startingVertex, Vertex<E> endingVertex, int weight) {
		// TODO Auto-generated method stub
		if(getVertexMap().containsKey(startingVertex) && getVertexMap().containsKey(endingVertex)) {
			List<WeightedLinkedVertex<E>> startingVertexEdgeList = getVertexMap().get(startingVertex);
			startingVertexEdgeList.add(new WeightedLinkedVertex<>(endingVertex, weight));
			
			
		}
	}

	@Override
	public void removeEdge(Vertex<E> startingVertex, Vertex<E> endingVertex) {
		// TODO Auto-generated method stub
		if(getVertexMap().containsKey(startingVertex) && getVertexMap().containsKey(endingVertex)) {
			List<WeightedLinkedVertex<E>> edgeList = getVertexMap().get(startingVertex);
			boolean vertexFound = false;
			int index = 0;
			while(!vertexFound && index < edgeList.size()){
				if(endingVertex == edgeList.get(index).getVertex()) {
					vertexFound = true;
					edgeList.remove(index);
				}
				index++;
			}			
		}
			
	}

	@Override
	public boolean hasEdge(Vertex<E> startingVertex, Vertex<E> endingVertex) {
		// TODO Auto-generated method stub
		boolean hasEdge = false;
		if(getVertexMap().containsKey(startingVertex) && getVertexMap().containsKey(endingVertex)) {
			List<WeightedLinkedVertex<E>> edgeList = getVertexMap().get(startingVertex);
			int index = 0;
			while(!hasEdge && index < edgeList.size()){
				if(endingVertex == edgeList.get(index).getVertex()) {
					hasEdge = true;
				}
				
				index++;
			}
		}
		return hasEdge;
	}
	
	public String toString() {
		StringBuffer buf = new StringBuffer();
		buf.append("The graph has ");
		buf.append(getVertexMap().size());
		buf.append(" vertices:\n");
		int index = 0;
		for(Vertex<E> v : getVertexMap().keySet()){
			buf.append("Vertex ");
			buf.append(index);
			buf.append(":\n");
			buf.append(v.toString());
			buf.append("\n");
			buf.append("Edge list: ");
			buf.append(v.getIdLabel());
			buf.append("-->");
			for(WeightedLinkedVertex<E> wlv : getVertexMap().get(v)){
				buf.append(wlv.getVertex().getIdLabel());
				buf.append("(");
				buf.append(wlv.getEdgeWeight());
				buf.append(")");
				buf.append("-->");
			}
			buf.append("null");
			buf.append("\n\n");
			index++;
		}
		buf.append("\n\n");
		return buf.toString();

	}
}
