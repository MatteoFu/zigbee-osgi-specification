package jemma.org.osgi.service.zigbee;

/**
 * This interface represents an entry of the NeighborTableList 
 * @author Jinyong Fu <fu@ismb.it>
 *
 */
public interface ZigBeeLinkQuality {
	/**
	 * Constant value representing a parent relationship between current ZigBeeNode and the neighbor
	 */
	public static final int PARENT_NEIGHBOR = 240;
	/**
	 * Constant value representing a child relationship between current ZigBeeNode and the neighbor
	 */
	public static final int CHILD_NEIGHBOR = 241;
	/**
	 * Constant value representing a sibling relationship between current ZigBeeNode and the neighbor
	 */
	public static final int SIBLING_NEIGHBOR = 242;
	/**
	 * Constant value representing a others relationship between current ZigBeeNode and the neighbor
	 */
	public static final int OTHERS_NEIGHBOR = 243;
	/**
	 * Constant value representing a previous child relationship between current ZigBeeNode and the neighbor
	 */
	public static final int PREVIOUS_CHILD_NEIGHBOR = 244;
	/**
	 * 
	 * @return the Service.PID referring to the ZigBeeNode representing neighbor
	 */
	String getNeighbor();
	/**
	 * 
	 * @return the Link Quality Indicator estimated by ZigBeeNode returning this for communicating with ZigBeeNode identified by the getNeighbor()
	 */
	int getLQI();
	/**
	 * 
	 * @return the tree-depth of device
	 */
	int getDepth();
	/**
	 * 
	 * @return the relationship between ZigBeeNode returning this and the ZigBeeNode identified by the getNeighbor()
	 */
	int getRelationship();
	
	
}
