/**
 * 
 */
package pong;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author Sebastian
 *
 */
public class Pong {

	/**
	 * @param args
	 */
	private static final Logger LOGGER = LogManager.getLogger(Pong.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hier entsteht Pong!");
		LOGGER.info("Info");
		LOGGER.debug("Debug");
		LOGGER.trace("Trace");
		LOGGER.error("Error");
	}
}
