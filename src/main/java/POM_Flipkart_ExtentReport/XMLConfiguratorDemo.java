package Demo1;


import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class XMLConfiguratorDemo {

	static Logger logger =   Logger.getLogger(XMLConfiguratorDemo.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			DOMConfigurator.configure(".\\src\\main\\java\\Config\\log4j.xml");
			
			logger.debug("This is debug msg");
			logger.info("This is info msg");
			logger.warn("This is warn msg");		
			logger.error("This is error msg");
			logger.fatal("This is fatel msg");
		
	}

}
