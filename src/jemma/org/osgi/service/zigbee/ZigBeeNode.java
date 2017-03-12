package jemma.org.osgi.service.zigbee;

import java.math.BigInteger;

/**
 * This interface represents a ZigBee node, means a physical device that can communicate using the ZigBee protocol.
 * @author Jinyong Fu <fu@ismb.it>
 *
 */
public interface ZigBeeNode {
	/**
	 * Property key for the mandatory node IEEE Address representing node MAC address.
	 */
	public static final String IEEE_ADDRESS = "zigbee.node.ieee.address";
	/**
	 * Property key for the device logical type
	 */
	public static final String LOGICAL_TYPE = "zigbee.node.description.node.type";
	/**
	 * Property key for a manufacturer code that is allocated by the ZigBee Alliance, relating the manufacturer to the device.
	 */
	public static final String MANUFACTURER_CODE = "zigbee.node.description.manufacturer.code";
	/**
	 * Key of String containing the device node network PAN ID
	 */
	public static final String PAN_ID = "zigbee.node.pan.id";
	/**
	 * Key of String containing the device node network extended PAN ID.
	 */
	public static final String EXTENDED_PAN_ID = "zigbee.node.extended.pan.id";
	/**
	 * ZigBee power source, i.e. 3rd bit of "MAC Capabilities" in Node Descriptor. Set to 1 if the current power source is mains power, set to 0 otherwise.
	 */
	public static final String POWER_SOURCE = "zigbee.node.power.source";
	/**
	 * ZigBee receiver on when idle, i.e. 4th bit of "MAC Capabilities" in Node Descriptor. Set to 1 if the device does not disable its receiver to conserve power during idle periods, set to 0 otherwise.
	 */
	public static final String RECEIVER_ON_WHEN_IDLE = "zigbee.node.receiver.on.when.idle";
	/**
	 * The Node is a ZigBee End Device
	 */
	public static final short ZED = 1;
	/**
	 * The Node is a ZigBee Coordinator
	 */
	public static final short COORDINATOR = 2;
	/**
	 * 
	 * @return The ZigBee device node IEEE Address.
	 */
	BigInteger getIEEEAddress();
	/**
	 * 
	 * @return The ZigBee device node current network address.
	 */
	int getNetworkAddress();
	/**
	 * 
	 * @return The ZigBee Host OSGi service PID.
	 */
	String getHostPid();
	/**
	 * 
	 * @return The network Personal Area Network identifier(PAND ID)
	 */
	int getPanId();
	/**
	 * 
	 * @return The network Extended PAN identifier(EPID)
	 */
	BigInteger getExtendedPanId();
	/**
	 * 
	 * @return An array of embedded endpoints, returns an empty array if it does not provide any endpoint.
	 */
	ZigBeeEndpoint[] getEndpoints();
	/**
	 * 
	 * @param handler
	 */
	void getNodeDescriptor(ZigBeeHandler handler);
	/**
	 * 
	 * @param handler
	 */
	void getPowerDescriptor(ZigBeeHandler handler);
	/**
	 * 
	 * @param handler
	 */
	void getComplexDescriptor(ZigBeeHandler handler);
	/**
	 * 
	 * @param handler
	 */
	void getLinksQuality(ZigBeeHandler handler);
	/**
	 * 
	 * @param handler
	 */
	void getRoutingTable(ZigBeeHandler handler);
	/**
	 * Request to leave the network.
	 * @param handler
	 */
	void leave(ZigBeeHandler handler);
	/**
	 * Requests the device to leave the network.
	 * @param rejoin
	 * @param removeChildren
	 * @param handler
	 */
	void leave(boolean rejoin, boolean removeChildren, ZigBeeHandler handler);
	/**
	 * This method sends the ZDPFrame to this ZigBeeNode with the specified cluster id and it will expect a specific cluster as response to the request.
	 * @param clusterIdReq
	 * @param expectedClusterIdRsp
	 * @param message
	 * @param handler
	 */
	void invoke(int clusterIdReq, int expectedClusterIdRsp, ZDPFrame message, ZDPHandler handler);
	/**
	 * This method sends the ZDPFrame to this ZigBeeNode with the specified cluster id and it will expect a specific cluster as response to the request This method considers that the 0x8000 + clusterIdReq is the clusterId expected from messaged received for the message sent by this request.
	 * @param clusterIdReq
	 * @param message
	 * @param handler
	 */
	void invoke(int clusterIdReq, ZDPFrame message, ZDPHandler handler);
	/**
	 * Enable to broadcast a given frame of a specific cluster to all the ZigBeeEndpoint that are running on this node.
	 * @param clusterID
	 * @param frame
	 * @param handler
	 */
	void broadcast(int clusterID, ZCLFrame frame, ZCLCommandHandler handler);
	/**
	 * Enable to broadcast a given frame of a specific cluster to all the ZigBeeEndpoint that are running on this node from a specific exported endpoint.
	 * @param clusterID
	 * @param frame
	 * @param handler
	 * @param exportedServicePID
	 */
	void broadcast(int clusterID, ZCLFrame frame, ZCLCommandHandler handler, String exportedServicePID);
	/**
	 * 
	 * @param handler
	 */
	void getUserDescription(ZigBeeHandler handler);
	


}
