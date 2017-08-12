/**
 * 
 */
package roadgraph;

import java.util.HashSet;

import geography.GeographicPoint;

/**
 * @author Jure Koren
 *
 */
public class MapNode {
	private GeographicPoint coords;
	private HashSet<MapEdge> edges = new HashSet<MapEdge>();;
	private String nodeName;
	
	public GeographicPoint getCoords() {
		return coords;
	}
	public void setCoords(GeographicPoint coords) {
		this.coords = coords;
	}
	public HashSet<MapEdge> getEdges() {
		return edges;
	}
	public void setEdges(HashSet<MapEdge> edges) {
		this.edges = edges;
	}
	public String getNodeName() {
		return nodeName;
	}
	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
	}
	
	// empty node
	public MapNode() {
		super();
	}
	
	/**
	 * @param coords
	 */
	public MapNode(GeographicPoint coords) {
		super();
		this.coords = coords;
	}
	
	public void addEdge(MapEdge edge) {
		//System.out.println("MapNode.addEdge: add edge to my list...");
		edges.add(edge);
	}
	
	@Override
	public String toString() {
		return "MapNode [coords=" + coords + ", nodeName=" + nodeName + "]";
	}
	
	
	
	
}
