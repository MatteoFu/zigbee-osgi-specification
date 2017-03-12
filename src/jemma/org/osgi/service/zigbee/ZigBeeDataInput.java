package jemma.org.osgi.service.zigbee;

/**
 * The ZigBeeDataInput interface is designed for converting a series of bytes in java data types.
 * @author Jinyong Fu <fu@ismb.it>
 *
 */
public interface ZigBeeDataInput {
	/**
	 * Read a byte from the DataInput Stream.
	 * @return the byte read from the data input.
	 * @throws IOException - If an I/O error occurs.
	 * @throws EOFException - When the end of the input has been reached and there are no more data to read.
	 */
	byte readByte() throws IOException;
	/**
	 * Read an an integer of the specified size.
	 * @param size
	 * @return the integer read.
	 * @throws IOException - If an I/O error occurs.
	 * @throws EOFException - When the end of the input has been reached and there are no more data to read.
	 */
	int readInt(int size) throws IOException;
	/**
	 * Read a certain amount of bytes and returns a long.
	 * @param size
	 * @return the long resulting from the bytes read.
	 * @throws IOException - If an I/O error occurs.
	 * @throws EOFException - if there are not at least size bytes left on the data input.
	 */
	long readLong(int size) throws IOException;
	/**
	 * Returns a decoded float
	 * @param size
	 * @return a decoded float
	 * @throws IOException - If an I/O error occurs.
	 * @throws EOFException - if there are not at least size bytes left on the data input.
	 */
	float readFloat(int size) throws IOException;
	/**
	 * 
	 * @return a decoded double.
	 * @throws IOException
	 * @throws EOFException - if there are not at least size 8 bytes left on the data input.
	 */
	double readDouble() throws IOException;
	/**
	 * Read the specified amount of bytes from the underlying stream and return a copy of them. 
	 * If the number of available bytes is less than the requested len, it throws an EOFException
	 * @param len
	 * @return return a copy of the byte contained in the stream
	 * @throws IOException
	 * @throws EOFException - if there are not at least len bytes left on the data input.
	 */
	byte[] readBytes(int len) throws IOException;
	

}
