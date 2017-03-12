package jemma.org.osgi.service.zigbee;

/**
 * This interface represents a listener to events from ZigBee Device nodes
 * @author Jinyong Fu <fu@ismb.it>
 *
 */
public interface ZCLEventListener {
	/**
	 * Property key for the optional attribute data type of an attribute reporting configuration record, cf.
	 */
	public static final String ATTRIBUTE_DATA_TYPE = "zigbee.attribute.datatype";
	/**
	 * Property key for the optional maximum interval, in seconds between issuing reports of the attribute.
	 */
	public static final String MIN_REPORT_INTERVAL = "zigbee.attribute.min.report.interval";
	/**
	 * Property key for the optional minimum interval, in seconds between issuing reports of the attribute.
	 */
	public static final String MAX_REPORT_INTERVAL = "zigbee.attribute.max.report.interval";
	/**
	 * Property key for the optional maximum change to the attribute that will result in a report being issued.
	 */
	public static final String REPORTABLE_CHANGE = "zigbee.attribute.reportable.change";
	/**
	 * Callback method that is invoked for received events. This method must be called asynchronously.
	 * @param event
	 */
	void notifyEvent(ZigBeeEvent event);
	/**
	 * Notifies a failure, i.e. when either a ZCLException.UNSUPPORTED_ATTRIBUTE, or a ZCLException.UNREPORTABLE_ATTRIBUTE, 
	 * or ZCLException.INVALID_VALUE, or ZCLException.INVALID_DATA_TYPE status occurs.
	 * @param e
	 */
	void onFailure(ZCLException e);
	/**
	 * TIMEOUT_PERIOD is sent from the attribute owner to the listening client to say that the intervalbetween reports may exceed MAX_INTERVAL.
	 * @param timeout
	 */
	void notifyTimeOut(int timeout);
	
}
