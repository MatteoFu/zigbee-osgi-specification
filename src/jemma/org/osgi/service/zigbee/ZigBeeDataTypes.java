package jemma.org.osgi.service.zigbee;
/**
 * This interface contains the constants that are used internally by these API to represent the ZCL data types.
 * @author Jinyong Fu <fu@ismb.it>
 *
 */
public interface ZigBeeDataTypes {
	/**
	 * No Data Type The no data type is a special type to represent an attribute with no associated data.
	 */
	public static final short NO_DATA = 0;
	/**
	 * General Data (8, 16, 24, 32, 40, 48, 56 and 64-bit) This type has no rules about its use, 
	 * and may be used when a data element is needed but its use does not conform to any of the standard types.
	 */
	public static final short GENERAL_DATA_8 = 80;
	public static final short GENERAL_DATA_16 = 81;
	public static final short GENERAL_DATA_24 = 82;
	public static final short GENERAL_DATA_32 = 83;
	public static final short GENERAL_DATA_40 = 84; 
	public static final short GENERAL_DATA_48 = 85; 
	public static final short GENERAL_DATA_56 = 86; 
	public static final short GENERAL_DATA_64 = 87;
	/**
	 * Boolean The Boolean type represents a logical value, either FALSE (0x00) or TRUE (0x01).
	 * The value 0xff represents an invalid value of this type. All other values of this type are forbidden.
	 */
	public static final short BOOLEAN = 1;
	/**
	 * Bitmap (8, 16, 24, 32, 40, 48, 56 and 64-bit) The Bitmap type holds 8, 16, 24, 32, 40, 48, 56 or 64 logical values, 
	 * one per bit, depending on its length. There is no value that represents an invalid value of this type.
	 */
	public static final short BITMAP_8 = 88;
	public static final short BITMAP_16 = 89;
	public static final short BITMAP_24 = 90;
	public static final short BITMAP_32 = 91;
	public static final short BITMAP_40 = 92;
	public static final short BITMAP_48 = 93;
	public static final short BITMAP_56 = 94;
	public static final short BITMAP_64 = 95;
	/**
	 * Unsigned Integer (8, 16, 24, 32, 40, 48, 56 and 64-bit) This type represents an unsigned integer with a decimal range of 0 to 2^8-1, 
	 * 0 to 2^16-1, 0 to 2^24-1, 0 to 2^32-1, 0 to 2^40-1, 0 to 2^48-1, 0 to 2^56-1, or 0 to 2^64-1, depending on its length. 
	 * The values that represents an invalid value of this type are 0xff, 0xffff, 0xffffff, 0xffffffff, 0xffffffffff, 0xffffffffffff, 0xffffffffffffff and 0xffffffffffffffff respectively.
	 */
	public static final short UNSIGNED_INTEGER_8 = 96;
	public static final short UNSIGNED_INTEGER_16 = 97;
	public static final short UNSIGNED_INTEGER_24 = 98;
	public static final short UNSIGNED_INTEGER_32 = 99;
	public static final short UNSIGNED_INTEGER_40 = 100;
	public static final short UNSIGNED_INTEGER_48 = 101;
	public static final short UNSIGNED_INTEGER_56 = 102;
	public static final short UNSIGNED_INTEGER_64 = 103;
	/**
	 * Signed Integer (8, 16, 24, 32, 40, 48, 56 and 64-bit) This type represents a signed integer with a decimal range of -(2^7-1) to 2^7-1,
	 * - (2^15-1) to 2^15-1, -(2^23-1) to 2^23-1, -(2^31-1) to 2^31-1, - (2^39-1) to 2^39-1, -(2^47-1) to 2^47-1, -(2^55-1) to 2^55-1, or -(2^63-1) to 2^63-1, depending on its length. 
	 * The values that represents an invalid value of this type are 0x80, 0x8000, 0x800000, 0x80000000, 0x8000000000, 0x800000000000, 0x80000000000000 and 0x8000000000000000 respectively.
	 */
	public static final short SIGNED_INTEGER_8 = 224;
	public static final short SIGNED_INTEGER_16 = 225;
	public static final short SIGNED_INTEGER_24 = 226;
	public static final short SIGNED_INTEGER_32 = 227;
	public static final short SIGNED_INTEGER_40 = 228;
	public static final short SIGNED_INTEGER_48 = 229;
	public static final short SIGNED_INTEGER_56 = 230;
	public static final short SIGNED_INTEGER_64 = 231;
	/**
	 * Enumeration (8-bit, 16-bit) The Enumeration type represents an index into a lookup table to determine the final value. The values 0xff and 0xffff represent invalid values of the 8-bit and 16- bit types respectively.
	 */
	public static final short ENUMERATION_8 = 112;
	public static final short ENUMERATION_16 = 113;
	/**
	 * Semi-precision The ZigBee semi-precision number format is based on the IEEE 754 standard for binary floating-point arithmetic. This number format should be used very sparingly, when absolutely necessary, 
	 * keeping in mind the code and processing required supporting it. See reference on top of this class.
	 */
	public static final short FLOATING_SEMI = 248;
	/**
	 * Single Precision The format of the single precision data type is based on the IEEE 754 standard for binary floating-point arithmetic. This number format should be used very sparingly, when absolutely necessary, 
	 * keeping in mind the code and processing required supporting it. See reference on top of this class.
	 */
	public static final short FLOATING_SINGLE = 249;
	/**
	 * Double Precision The format of the double precision data type is based on the IEEE 754 standard for binary floating-point arithmetic. This number format should be used very sparingly, when absolutely necessary, 
	 * keeping in mind the code and processing required supporting it. See reference on top of this class.
	 */
	public static final short FLOATING_DOUBLE = 250;
	/**
	 * Octet String The octet string data type contains data in an application-defined format, not defined in this specification. See reference on top of this class.
	 */
	public static final short OCTET_STRING = 120;
	/**
	 * Character String The character string data type contains data octets encoding characters according to the language and character set field of the complex descriptor. See reference on top of this class.
	 */
	public static final short CHARACTER_STRING = 121;
	/**
	 * Long Octet String The long octet string data type contains data in an application-defined format, not defined in this specification. See reference on top of this class.
	 */
	public static final short LONG_OCTET_STRING = 122;
	/**
	 * Long Character String The long character string data type contains data octets encoding characters according to the language and character set field of the complex descriptor. See reference on top of this class.
	 */
	public static final short LONG_CHARACTER_STRING = 123;
	/**
	 * Array An array is an ordered sequence of zero or more elements, all of the same data type. This data type may be any ZCL defined data type, including array, structure, bag or set. The total nesting depth is limited to 15, 
	 * and may be further limited by any relevant profile or application. See reference on top of this class.
	 */
	public static final short ARRAY = 16;
	/**
	 * Structure A structure is an ordered sequence of elements, which may be of different data types. Each data type may be any ZCL defined data type, including array, structure, bag or set. The total nesting depth is limited to 15, 
	 * and may be further limited by any relevant profile or application. See reference on top of this class.
	 */
	public static final short STRUCTURE = 17;
	/**
	 * Set A set is a collection of elements with no associated order. Each element has the same data type, which may be any ZCL defined data type, including array, structure, bag or set. The nesting depth is limited to 15, 
	 * and may be further limited by any relevant profile or application. See reference on top of this class.
	 */
	public static final short SET = 18;
	/**
	 * Bag A bag behaves exactly the same as a set, except that the restriction that no two elements may have the same value is removed.
	 */
	public static final short BAG = 19;
	/**
	 * Time of Day The Time of Day data type shall be formatted as illustrated in spec. See reference on top of this class.
	 */
	public static final short TIME_OF_DAY = 2;
	/**
	 * Date The Time of day data type shall be formatted as illustrated in spec. See reference on top of this class.
	 */
	public static final short DATE = 3;
	/**
	 * UTCTime
	 */
	public static final short UTC_TIME = 4;
	/**
	 * Cluster ID This type represents a cluster identifier as defined in spec. See reference on top of this class.
	 */
	public static final short CLUSTER_ID = 5;
	/**
	 * Attribute ID This type represents an attribute identifier as defined in spec. See reference on top of this class.
	 */
	public static final short ATTRIBUTE_ID = 6;
	/**
	 * BACnet OID (Object Identifier)
	 */
	public static final short BACNET_OID = 7;
	/**
	 * IEEE Address The IEEE Address data type is a 64-bit IEEE address that is unique to every ZigBee device. A value of 0xffffffffffffffff indicates that the address is unknown.
	 */
	public static final short IEEE_ADDRESS = 8;
	/**
	 * 128-bit Security Key The 128-bit Security Key data type is for use in ZigBee security, and may take any 128-bit value.
	 */
	public static final short SECURITY_KEY_128 = 9;
	/**
	 * UNKNOWN = 0xff
	 */
	public static final short UNKNOWN = 255;
	
	
	
}
