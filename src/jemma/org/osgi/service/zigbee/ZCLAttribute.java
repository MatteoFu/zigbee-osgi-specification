package jemma.org.osgi.service.zigbee;

/**
 * This interface represents a ZCL Cluster
 * 
 * @author Jinyong Fu <fu@ismb.it>
 *
 */
public interface ZCLAttribute extends ZCLAttributeInfo {
	/**
	 * Property key for the optional attribute id of a ZigBee Event Listener
	 */
	public static final String ID = "zigbee.attribute.id";
	/**
	 * 
	 * @param handler
	 * Gets the current value of the attribute.
	 */
	void getValue(ZigBeeHandler handler);
	/**
	 * 
	 * @param value
	 * @param handler
	 * Sets the current value of the attribute.
	 */
	void setValue(Object value, ZigBeeHandler handler);
}
