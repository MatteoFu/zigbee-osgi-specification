package jemma.org.osgi.service.zigbee;

public class ZigBeeException extends RuntimeException {
	
	public static final int OSGI_EXISTING_ID = 48;
	public static final int OSGI_MULTIPLE_HOSTS = 49;
	/**
	 * This error code is used if the ZigBee error returned is not covered by this API specification.
	 */
	public static final int UNKNOWN_ERROR = -1;
	/**
	 * The error code associated to this exception
	 */
	protected final int errorCode;
	/**
	 * The actual error code returned by the ZigBee node.
	 */
	protected final int zigBeeErrorCode;
	/**
	 * Create a ZigBeeException containing only a description, but no error codes. 
	 * If issued on this exeption the getErrorCode() and getZigBeeErrorCode() methods return the UNKNOWN_ERROR constant.
	 * @param errorDesc
	 */
	public ZigBeeException(String errorDesc){
		super(errorDesc);
		this.errorCode = 0;
		this.zigBeeErrorCode = 0;
	}
	/**
	 * Create a ZigBeeException containing a specific errorCode. 
	 * Using this constructor with errorCode set to UNKNOWN_ERROR is equivalent to call ZigBeeException(String).
	 * @param errorCode
	 * @param errorDesc
	 */
	public ZigBeeException(int errorCode, String errorDesc){
		super(errorDesc);
		this.errorCode = errorCode;
		this.zigBeeErrorCode = 0;

	}
	/**
	 * Create a ZigBeeException containing a specific errorCode or zigBeeErrorCode. 
	 * Using this constructor with both the errorCode and zigBeeErrorCode set to UNKNOWN_ERROR is equivalent to call ZigBeeException(String).
	 * @param errorCode
	 * @param zigBeeErrorCode
	 * @param errorDesc
	 */
	public ZigBeeException(int errorCode, int zigBeeErrorCode, String errorDesc){
		super(errorDesc);
		this.errorCode = errorCode;
		this.zigBeeErrorCode = zigBeeErrorCode;
	}
	/**
	 * 
	 * @return One of the error codes defined above. If the returned error code is UNKNOWN_ERROR and the hasZigbeeErrorCode() returns true then the getZigBeeErrorCode() provides the actual ZigBee error code returned by the device.
	 */
	public int getZigBeeErrorCode(){
		
	}
	/**
	 * 
	 * @return the error code.
	 */
	public int getErrorCode(){
		
	}
	/**
	 * 
	 * @return true if the ZigBeeException convey also the actual error code returned by the ZigBee stack.
	 */
	public boolean hasZigbeeErrorCode(){
		
	};
	
	
}
