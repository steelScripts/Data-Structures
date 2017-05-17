package model;

public class WeightedLinkedVertex<E> {
	/*****Class Variables*****/
	public Vertex<E> vertex = null;
	public int edgeWeight = 0;
	
	/*****Getters/Setters*****/
	public Vertex<E> getVertex(){
		return this.vertex;
	}
	public int getEdgeWeight(){
		return this.edgeWeight;
	}
	
	/*****Constructor******/
	public WeightedLinkedVertex(Vertex<E> v, int weight){
		this.vertex = v;
		this.edgeWeight = weight;
	}
}
