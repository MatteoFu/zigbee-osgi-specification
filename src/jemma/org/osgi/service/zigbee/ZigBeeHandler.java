package jemma.org.osgi.service.zigbee;

/**
 * ZigBeeHandler manages response of a request to the Base Driver
 * @author Jinyong Fu <fu@ismb.it>
 *
 */
public interface ZigBeeHandler {
	/**
	 * Notifies the success result of the call. This method is used when the handler command result is a success.
	 * @param response
	 */
	void onSuccess(Object response);
	/**
	 * Notifies the failure result of the call. This method is used when the handler command result is a failure.
	 * @param e
	 */
	void onFailure(Exception e);
}
