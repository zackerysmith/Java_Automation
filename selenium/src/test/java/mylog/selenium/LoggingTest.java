package mylog.selenium;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoggingTest {

private static final Logger log = Logger.getLogger(LoggingTest.class);
@BeforeTest
public void initialize() {
	
}
@Test
public void runme() {
	BasicConfigurator.configure();
	PropertyConfigurator.configure("Properties/log4j.properties");
		log.info("Sucessful CI");
		log.debug("new Debug");
		log.debug("added chrome notification");
	}

}