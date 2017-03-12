package jemma.org.osgi.service.zigbee;

/**
 * This interface models the ZigBee Cluster Library Frame.
 * @author Jinyong Fu <fu@ismb.it>
 *
 */
public interface ZCLFrame {
	/**
	 * 
	 * @return Returns the ZCLFrame header.
	 */
	ZCLHeader getHeader();
	/**
	 * 
	 * @return Returns a byte array containing the raw ZCL frame, suitable to be sent on the wire.
	 */
	byte[] getBytes();
	/**
	 * 
	 * @return a DataInput for the payload of the ZCLFrame. 
	 * @throws IllegalStateException - if the InputStream is not available.
	 */
	ZigBeeDataInput getDataInput();
	
}
