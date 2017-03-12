package jemma.org.osgi.service.zigbee;

/**
 * Manage response of a command request to the Base Driver
 * @author Jinyong Fu <fu@ismb.it>
 *
 */
public interface ZCLCommandHandler {
	/**
	 * Notifies the result (success or failure) of the call.
	 * @param frame
	 * @param e
	 */
	void notifyResponse(ZCLFrame frame, Exception e);
	
}
