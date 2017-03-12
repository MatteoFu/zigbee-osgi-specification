package jemma.org.osgi.service.zigbee;
/**
 * This interface represents a ZDP frame.
 * @author Jinyong Fu <fu@ismb.it>
 *
 */
public interface ZDPFrame {
	/**
	 * Get (a copy of this ZDP) payload
	 * @return a copy of the payload
	 */
	byte[] getPayload();
	/**
	 * 
	 * @return an ZigBeeDataInput for the payload of the ZDPFrame. This method, in contrary to getPayload(), doesn't require to create a copy of the payload.
	 * @throws IllegalStateException
	 */
	ZigBeeDataInput getDataInput() throws IllegalStateException;
	
	
	
}
