package jemma.org.osgi.service.zigbee;

/**
 * Callback for managing response to ZDPFrame sent by ZigBeeNode.invoke(int, int, ZDPFrame, ZDPHandler)
 * @author Jinyong Fu <fu@ismb.it>
 *
 */
public interface ZDPHandler {
	/**
	 * Notifies the result (success or failure) of the call. This method is invoked by the entity that registered the ZigBeeNode, and it is expected that only the ZigBee Base Driver register it.
	 * @param clusterId
	 * @param frame
	 * @param e
	 */
	void zdoResponse(int clusterId, ZDPFrame frame, Exception e);

}
