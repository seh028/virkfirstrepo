package alpha;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class demo1 {

		private static Logger log=LogManager.getLogger(demo1.class.getName());
		public static void main(String[] args) {
			// TODO Auto-generated method stub
				int a=1;
				int b=2;
				int Sum =a+b;
				
					log.debug("i am debugging");
					log.error("i am error");
					log.info("success");
					log.fatal("FATAL");
					
	}

}
