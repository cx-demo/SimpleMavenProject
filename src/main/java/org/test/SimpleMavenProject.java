package org.test;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class SimpleMavenProject {

	static final Logger logger = Logger.getLogger(SimpleMavenProject.class);
	
	public static void main(String[] args) {
		
		//Configure logger
		BasicConfigurator.configure();
		logger.debug("Hello World!");
		logger.info("Info");
		logger.warn("warning!");
		logger.error("error");

	}
}
