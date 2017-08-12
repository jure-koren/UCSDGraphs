/**
 * 
 */
package roadgraph;

/**
 * @author Jure Koren
 *
 */
public class MapEdge {
	private String name;
	private double length;
	private String type;
	private MapNode from;
	private MapNode to;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public MapNode getFrom() {
		return from;
	}
	public void setFrom(MapNode from) {
		this.from = from;
	}
	public MapNode getTo() {
		return to;
	}
	public void setTo(MapNode to) {
		this.to = to;
	}
	
	// empty edge
	public MapEdge() {
		super();
	}
	
	/**
	 * @param length
	 * @param type
	 * @param from
	 * @param to
	 */
	public MapEdge(String name, String type, double length, MapNode from, MapNode to) {
		super();
		this.name = name;
		this.length = length;
		this.type = type;
		this.from = from;
		this.to = to;
	}
	
	
	
	
}
