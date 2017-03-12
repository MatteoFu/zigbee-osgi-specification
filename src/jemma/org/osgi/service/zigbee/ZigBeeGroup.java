package jemma.org.osgi.service.zigbee;

/**
 * This interface represents a ZigBee Group
 * @author Jinyong Fu <fu@ismb.it>
 *
 */
public interface ZigBeeGroup {
	/**
	 * Key of the String containing the Group Address of the device.
	 * It is a mandatory property for this service.
	 */
	public static final String ID = "zigbee.group.id";
	/**
	 * 
	 * @return The 16bit group address.
	 */
	int getGroupAddress();
	/**
	 * This method is used for adding an Endpoint to a Group, it may be invoked on exported Endpoint or even on imported Endpoint.
	 * @param pid
	 * @param handler
	 * @throws APSException
	 * @throws ZCLException
	 */
	void joinGroup(String pid, ZigBeeHandler handler);
	/**
	 * This method is used for adding an Endpoint to a Group, it may be invoked on exported Endpoint or even on imported Endpoint.
	 * @param pid
	 * @param handler
	 * @throws APSException
	 * @throws ZCLException
	 */
	void leaveGroup(String pid, ZigBeeHandler handler);
	/**
	 * Invokes the action on a Group.
	 * @param clusterId
	 * @param frame
	 * @param handler
	 */
	void invoke(int clusterId, ZCLFrame frame, ZCLCommandHandler handler);
	/**
	 * This method is to be used by applications when the targeted device has to distinguish between source endpoints of the message.
	 * @param clusterId
	 * @param frame
	 * @param handler
	 * @param exportedServicePID
	 */
	void invoke(int clusterId, ZCLFrame frame, ZCLCommandHandler handler, String exportedServicePID);
	
	
}
