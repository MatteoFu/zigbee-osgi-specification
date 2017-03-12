package jemma.org.osgi.service.zigbee;


/**
 * This interface represents a ZCL Cluster
 * 
 * @author Jinyong Fu <fu@ismb.it>
 *
 */
public interface ZCLCluster {
	/**
	 * Property key for the optional cluster id. A ZigBee Event Listener service can announce for what ZigBee clusters it wants notifications.
	 */
	public static final String ID = "zigbee.cluster.id";
	/**
	 * Property key for the optional cluster domain. A ZigBee Event Listener service can announce for what ZigBee clusters domains it wants notifications.
	 */
	public static final String DOMAIN = "zigbee.cluster.domain";
	/**
	 * Property key for the optional cluster name. A ZigBee Event Listener service can announce for what ZigBee clusters it wants notifications.
	 */
	public static final String NAME = "zigbee.cluster.name";
	/**
	 * 
	 * @return the cluster identifier
	 */
	int getId();
	/**
	 * Get the cluster attribute identified corresponding to given attributeId.
	 * @param attributeId
	 * @param handler
	 */
	void getAttribute(int attributeId, ZigBeeHandler handler);
	/**
	 * Get the cluster attribute identified corresponding to given attributeId of a specific Manufacturer 
	 * or the standard attribute
	 * @param attributeId
	 * @param code
	 * @param handler
	 */
	void getAttribute(int attributeId, int code, ZigBeeHandler handler);
	/**
	 * Get an array of all this Cluster's Attributes. This method returns only standard attributes
	 * @param handler
	 */
	void getAttributes(ZigBeeHandler handler);
	/**
	 * Get an array of all this Cluster's Attributes. This method returns only standard attributes when using -1 as code 
	 * or vendor specific attribute when invoked with the proper code.
	 * @param code
	 * @param handler
	 */
	void getAttributes(int code, ZigBeeHandler handler);
	/**
	 * Read a list of attributes.
	 * @param attributes
	 * @param handler
	 * @throws NullPointerException, IllegalArgumentException
	 */
	void readAttributes(ZCLAttributeInfo[] attributes, ZigBeeHandler handler);
	/**
	 * Write a list of attributes.
	 * @param undivided
	 * @param attributesAndValues
	 * @param handler
	 * @throws IllegalArgumentException
	 */
	void writeAttributes(boolean undivided, Map attributesAndValues, ZigBeeHandler handler);
	/**
	 * Get an array of all the commandIds of the ZCLCluster.
	 * @param handler
	 */
	void getCommandIds(ZigBeeHandler handler);
	/**
	 * Invokes the action. The handler will provide the invocation response in an asynchronously way. 
	 * The source endpoint is not specified in this method call. To send the appropriate message on the network, 
	 * the base driver must generate a source endpoint. The latter must not correspond to any exported endpoint.
	 * @param frame
	 * @param handler
	 */
	void invoke(ZCLFrame frame, ZCLCommandHandler handler);
	/**
	 * This method is to be used by applications when the targeted device has to distinguish between source endpoints of the message.
	 * @param frame
	 * @param handler
	 * @param exportedServicePID
	 */
	void invoke(ZCLFrame frame, ZCLCommandHandler handler, String exportedServicePID)
	
}
