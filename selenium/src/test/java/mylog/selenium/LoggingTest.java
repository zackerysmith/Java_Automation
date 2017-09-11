package mylog.selenium;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoggingTest {

public static final Logger log = Logger.getLogger(LoggingTest.class);
@BeforeTest
public void initialize() {
	
}
@Test
public void runme() {
	BasicConfigurator.configure();
	PropertyConfigurator.configure("E:\\JavaOnGitHub\\selenium\\Properties\\log4j.properties");
		log.info("Test Message");
		System.out.println("SYSO Added");
		System.out.println("simple add2");
	}

}