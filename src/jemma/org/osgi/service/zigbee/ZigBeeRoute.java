package jemma.org.osgi.service.zigbee;

/**
 * This interface represents an entry of the RoutingTableList
 * @author Jinyong Fu <fu@ismb.it>
 *
 */
public interface ZigBeeRoute {
	/**
	 * Constant value representing an active route
	 */
	public static final int ACTIVE = 240;
	/**
	 * Constant value representing a route that is under discovery
	 */
	public static final int DISCOVERY_UNDERWAY = 241;
	/**
	 * Constant value representing a failed route discovery
	 */
	public static final int DISCOVERY_FAILED = 242;
	/**
	 * Constant value representing an inactive route
	 */
	public static final int INACTIVE = 243;
	/**
	 * Constant value representing a route which is under validation
	 */
	public static final int VALIDATION_UNDERWAY = 244;
	/**
	 * 
	 * @return the Service.PID of the ZigBeeNode as destination of this route entry
	 */
	String getDestination();
	/**
	 * 
	 * @return the Service.PID of the ZigBeeNode to send the data for reaching the destination
	 */
	String getNextHop();
	/**
	 * 
	 * @return 
the status of the RoutingLink as defined by ZigBee Specification: ACTIVE, DISCOVERY_UNDERWAY, DISCOVERY FAILED, INACTIVE, VALIDATION_UNDERDAY
	 */
	int getStatus();
	
	
}
