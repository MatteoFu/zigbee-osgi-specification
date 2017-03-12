package jemma.org.osgi.service.zigbee;

/**
 * This interface provides information about the attribute, like its ZCL attribute ID, if it manufacturer specific and about its data type.
 * 
 * @author Jinyong Fu <fu@ismb.it>
 *
 */
public interface ZCLAttributeInfo {
	/**
	 * Property key for the optional attribute id of a ZigBee Event Listener.
	 */
	public static final String ID = "zigbee.attribute.id";
	/**
	 * 
	 * @return true if and only if this attribute is related to a Manufacturer extension
	 */
	boolean isManufacturerSpecific();
	/**
	 * 
	 * @return the Manufacturer code that defined this attribute, if the attribute does not belong to any manufacture extension then it returns -1
	 */
	int getManufacturerCode();
	/**
	 * 
	 * @return the attribute identifier (i.e. the attribute's ID)
	 */
	int getId();
	/**
	 * 
	 * @return the Attribute data type. It may be null if the data type is not retrievable (issue with read attribute and discover attributes commands).
	 */
	ZCLDataTypeDescription getDataType();
	
	
}
