package jemma.org.osgi.service.zigbee;

import java.io.IOException;

/**
 * This interface represents the machine that hosts the code to run a ZigBee device or client. This machine is, for example, the ZigBee chip/dongle that is controlled by the basedriver (below/under the OSGi execution environment).
 * ZigBeeHost is more than a ZigBeeNode.
 * It must be registered as a OSGi service.
 * @author Jinyong Fu <fu@ismb.it>
 *
 */
public interface ZigBeeHost extends ZigBeeNode {
	/**
	 * UNLIMITED_BROADCAST_RADIUS
	 */
	public static final short UNLIMITED_BROADCAST_RADIUS = 255;
	/**
	 * Starts the host. If the host is a Coordinator, then it can be started with or without PAN_ID and Extended PAN_ID (i.e. if no PAN_ID, and Extended PAN_ID are given, then they will be automatically generated and then added to the service properties). 
	 * If the host is a router, or an end device, then the host may start without a registered PAN_ID property; the property will be set when the host will find and join a ZigBee network. The host status must be persistent, i.e. if the host was started, 
	 * then the host must starts again when the bundle restarts. In addition, the values of channel, pan id, extended pan id, and host pid must remain the same.
	 * @throws Exception
	 */
	void start() throws Exception;
	/**
	 * Stops the host.
	 * @throws Exception
	 */
	void stop() throws Exception;
	/**
	 * Get the host's start/stop state.
	 * @return true if the host is started.
	 */
	boolean isStarted();
	/**
	 * Set the panId.
	 * @param panId
	 * @throws IllegalStateException
	 */
	void setPanId(int panId) throws IllegalStateException;
	/**
	 * Set the extendedPanId.
	 * @param extendedPanId
	 * @throws IllegalStateException
	 */
	void setExtendedPanId(long extendedPanId) throws IllegalStateException;
	/**
	 * Indicates if a ZigBee device can join the network.
	 * @param duration
	 * @throws Exception
	 */
	void permitJoin(short duration) throws Exception;
	/**
	 * Sets the host logical node type. ZigBee defines three different types of node, coordinator(-> COORDINATOR), router( ROUTER) and end device( -> END_DEVICE)
	 * @param logicalNodeType
	 * @throws IllegalStateException
	 * @throws Exception
	 */
	void setLogicalType(short logicalNodeType) throws IllegalStateException, Exception;
	/**
	 * 
	 * @return The current network channel.
	 * @throws Exception
	 */
	int getChannel() throws Exception;
	/**
	 * Updates the network channel.
	 * @param channel
	 * @throws IllegalStateException
	 * @throws IOException
	 */
	void updateNetworkChannel(byte channel) throws IllegalStateException, IOException;
	/**
	 * 
	 * @return The currently configured channel mask.
	 * @throws Exception
	 */
	int getChannelMask() throws Exception;
	/**
	 * Set a new configured channel mask.
	 * @param mask
	 * @throws IllegalStateException
	 * @throws IOException
	 */
	void setChannelMask(int mask) throws IllegalStateException, IOException;
	/**
	 * The method forces a new scan. It checks that the ZigBeeNode services are still representing an available node on the network. 
	 * It also updates the whole representation of all nodes (endpoints, clusters, descriptors, attributes).
	 * @param handler
	 * @throws Exception
	 */
	void refreshNetwork(ZigBeeHandler handler) throws Exception;
	/**
	 * 
	 * @return The network security level, i.e. 0 if security is disabled, an int code if enabled.
	 * @throws Exception
	 */
	int getSecurityLevel() throws Exception;
	/**
	 * 
	 * @return The current preconfigured link key.
	 * @throws Exception
	 */
	String getPreconfiguredLinkKey() throws Exception;
	/**
	 * This method is used for creating a ZigBeeGroup service that has not yet been discovered by the ZigBee Base Driver or that does not exist on the ZigBee network yet.
	 * @param groupAddress
	 * @throws Exception
	 */
	void createGroupService(int groupAddress) throws Exception;
	/**
	 * Enable to broadcast a given frame on a given cluster.
	 * @param clusterID
	 * @param frame
	 * @param handler
	 */
	void broadcast(int clusterID, ZCLFrame frame, ZCLCommandHandler handler);
	/**
	 * Enable to broadcast a given frame on a given cluster.
	 * @param clusterID
	 * @param frame
	 * @param handler
	 * @param exportedServicePID
	 */
	void broadcast(int clusterID, ZCLFrame frame, ZCLCommandHandler handler, String exportedServicePID);
	/**
	 * 
	 * @return the current broadcastradius value.
	 */
	short getBroadcastRadius();
	/**
	 * By default the ZigBeeHost must use UNLIMITED_BROADCAST_RADIUS as default value for the broadcast
	 * @param broadcastRadius
	 * @throws IllegalArgumentException
	 * @throws IllegalStateException
	 */
	void setBroadcastRadius(short broadcastRadius) throws IllegalArgumentException, IllegalStateException;
	
	

}
