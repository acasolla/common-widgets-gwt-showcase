package it.softphone.commons.gwt.showcase.client;

import java.io.BufferedReader;
import java.io.FileReader;

import org.apache.log4j.Logger;
import org.junit.Test;

public class UnitTests {
	
	private static final Logger logger = Logger.getLogger(UnitTests.class);
	
	@Test
	public void buildSourceAndStyle() throws Exception{
		
		String source = readFile("/Users/ale/workspace/eclipse/RD/common-widgets-gwt-parent/common-widgets-gwt-showcase/src/main/java/it/softphone/commons/gwt/showcase/client/CommonWidgetExample.java",
							"sbSource");
		logger.info(source);
				
		/*
		
		String style = readFile("/Users/ale/workspace/eclipse/RD/common-widgets-gwt-parent/common-widgets-gwt-showcase/src/main/java/it/softphone/commons/gwt/showcase/client/resources/css/showcaseCss.css",
				"sbStyle");
		logger.info(style);
		*/

	}
	

	public String readFile( String path, String sbName ) throws Exception{
	 BufferedReader br = new BufferedReader(new FileReader(path));
	    try {
	        StringBuilder sb = new StringBuilder();
	        sb.append(sbName).append(".append").append("(\"<pre>\");");
	        sb.append("\n");
	        sb.append(sbName).append(".append").append("(\"").append("\\n").append("\");");
	        sb.append("\n");
	        String line = br.readLine();

	        while (line != null) {
	        	sb.append(sbName).append(".append").append("(\"").append(line).append("\");");
	        	sb.append("\n");
	        	sb.append(sbName).append(".append").append("(\"").append("\\n").append("\");");
	        	sb.append("\n");
	            line = br.readLine();
	        }
	        sb.append(sbName).append(".append").append("(\"</pre>\");");
	        return sb.toString();
	    } finally {
	        br.close();
	    }
		    
	}
	
	
	
}
