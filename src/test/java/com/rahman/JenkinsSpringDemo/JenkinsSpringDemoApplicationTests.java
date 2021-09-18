package com.rahman.JenkinsSpringDemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsSpringDemoApplicationTests {

	public static Logger logger=(Logger) LoggerFactory.getLogger(JenkinsSpringDemoApplicationTests.class);
	
	@Test
	void contextLoads() {
		logger.info("Test Application Started.....");
		assertEquals(true,true);
	}

}
