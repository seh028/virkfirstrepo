package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class log4jdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger log=LogManager.getLogger(log4jdemo.class.getName());
			log.debug("i am debugging");
			log.error("i am error");
			log.info("success");
			log.fatal("FATAL");
			log.debug("i am debug");
//			ERROR ERROR
					}
		

	

}
