package model;

/**
 * This class defines a Vertex object to be used in graph structures.
 * It consists of a String label used to identifiy this vertex on a 
 * graph and it containes a generic element that is the data object to be 
 * stored in this vertex.
 * @author tpolk
 *
 * @param <E>
 */
public class Vertex<E> {
	/***** CLASS VARIABLES **************************************************/
	private String idLabel = null;
	private E element = null;

	/***** GETTERS AND SETTERS **********************************************/
	public String getIdLabel() {
		return idLabel;
	}
	public E getElement() {
		return element;
	}
	
	/***** CONSTRUCTORS *****************************************************/
	public Vertex(String idLabel, E element){
		this.idLabel = idLabel;
		this.element = element;
	}
	/***** METHODS **********************************************************/
	@Override
	public String toString() {
		StringBuffer buf = new StringBuffer();
		buf.append("Label: ");
		buf.append(getIdLabel());
		buf.append("\n");
		buf.append(getElement().toString());
		return buf.toString();
	}
}
