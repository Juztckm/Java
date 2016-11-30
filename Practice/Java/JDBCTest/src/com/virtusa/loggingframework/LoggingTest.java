package com.virtusa.loggingframework;

import java.io.IOException;
import org.apache.log4j.Appender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;

public class LoggingTest {

	static Logger log = Logger.getLogger(LoggingTest.class);
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		log.debug("This is a debug message");
		log.info("This is a info message");
		log.trace("This is a trace message");
		log.fatal("This is a fatal message");
		log.error("This is a error message");
		log.warn("This is a warn message");
	}
}