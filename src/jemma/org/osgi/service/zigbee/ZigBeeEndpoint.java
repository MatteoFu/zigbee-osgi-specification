package jemma.org.osgi.service.zigbee;

import java.math.BigInteger;

/**
 * This interface represents a ZigBee EndPoint. A ZigBeeEndpoint must be registered as a OSGi service with ZigBeeNode.
 * IEEE_ADDRESS, and ZigBeeEndpoint.ENDPOINT_ID properties.
 * @author Jinyong Fu <fu@ismb.it>
 *
 */
public interface ZigBeeEndpoint {
	/**
	 * Key of the String property containing the EndPoint Address of the device. It is mandatory property for this service
	 */
	public static final String ENDPOINT_ID = "zigbee.endpoint.id";
	/**
	 * Key of the String property containing the profile id implemented by the device. It is mandatory property for this service
	 */
	public static final String PROFILE_ID = "zigbee.device.profile.id";
	/**
	 * Key of String containing the ZigBeeHost's pid.
	 */
	public static final String HOST_PID = "zigbee.endpoint.host.pid";
	/**
	 * Key of the String property containing the DeviceId of the device 
	 * It is mandatory property for this service
	 */
	public static final String DEVICE_ID = "zigbee.device.id";
	/**
	 * Key of the String property containing the DeviceVersion of the device
	 * It is mandatory property for this service
	 */
	public static final String DEVICE_VERSION = "zigbee.device.version";
	/**
	 * Key of the int array of containing the ids of each input cluster
	 * It is mandatory property for this service
	 */
	public static final String INPUT_CLUSTERS = "zigbee.endpoint.clusters.input";
	/**
	 * Key of the int array of containing the ids of each output cluster
	 * It is mandatory property for this service
	 */
	public static final String OUTPUT_CLUSTERS = "zigbee.endpoint.clusters.output";
	/**
	 * Key of the String property mentioning that an endpoint is an exported one or not. It is an optional property for this service.
	 */
	public static final String ZIGBEE_EXPORT = "zigbee.export";
	/**
	 * Constant used by all ZigBee devices indicating the device category. It is a mandatory property for this service.
	 */
	public static final String DEVICE_CATEGORY = "ZigBee";
	/**
	 * 
	 * @return identifier of the endpoint represented by this object, value ranges from 1 to 240.
	 */
	short getId();
	/**
	 * 
	 * @return BigInteger getNodeAddress()
	 */
	BigInteger getNodeAddress();
	/**
	 * 
	 * @param handler
	 */
	void getSimpleDescriptor(ZigBeeHandler handler);
	/**
	 * 
	 * @return An array of servers(inputs) clusters, returns an empty array if it does not provide any server cluster.
	 */
	ZCLCluster[] getServerClusters();
	/**
	 * 
	 * @param serverClusterId
	 * @return the server(input) cluster identified by id, or null if the given id is not listed in the simple descriptor
	 */
	ZCLCluster getServerCluster(int serverClusterId);
	/**
	 * 
	 * @return An array of clients(outputs) clusters, returns an empty array if does not provides any clients clusters.
	 */
	ZCLCluster[] getClientClusters();
	/**
	 * 
	 * @param clientClusterId
	 * @return the client(output) cluster identified by id, or null if the given id is not listed in the simple descriptor
	 */
	ZCLCluster getClientCluster(int clientClusterId);
	/**
	 * This method modify the Binding Table of physical device by adding the following entry: this.getNodeAddress(), this.getId(), clusterId, device.getNodeAddress(), device.getId()
	 * @param servicePid
	 * @param clusterId
	 * @param handler
	 */
	void bind(String servicePid, int clusterId, ZigBeeHandler handler);
	/**
	 * This method modify the Binding Table of physical device by removing the entry if exists: this.getNodeAddress(), this.getId(), clusterId, device.getNodeAddress(), device.getId()
	 * @param servicePid
	 * @param clusterId
	 * @param handler
	 */
	void unbind(String servicePid, int clusterId, ZigBeeHandler handler);
	/**
	 * This method is used to get details about problems when an error occurs during exporting an endpoint
	 * @param e
	 */
	void notExported(ZigBeeException e);
	/**
	 * This method is used to get bound endpoints (identified by their service PIDs).
	 * @param clusterId
	 * @param handler
	 */
	void getBoundEndPoints(int clusterId, ZigBeeHandler handler);
	
	
	

}
