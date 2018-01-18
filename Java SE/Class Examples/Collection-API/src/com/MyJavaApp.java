package com;

import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;

/*
 *  In java App,
 *  
 *  If any values ( configuration / messages ) often gets change
 *  dont hard code.
 *  
 *  prob :
 *  -----
 *  	--> difficult to change in future.
 *  	--. Need to repeat whole build cycle.
 *  
 *   Soln :
 *   -----
 *   
 *    use '.properties' file
 *    
 *    
 *   e.g:
 *   -----
 *   
 *     --> File config/paths
 *     --> Login credintials
 *     --> Error Messages
 *     --> Locale Messages
 *     
 * 
 */

public class MyJavaApp {

	public static void main(String[] args) {

		// String trName = "praveen"; // hard Code

		//
		ResourceBundle resource = null;
		resource = ResourceBundle.getBundle("mydata");

		String trName = resource.getString("java.trainer.name");
		String traddress = resource.getString("trainer.address");

		System.out.println("Current Trainer :" + trName);
		System.out.println(traddress);

		// ----------------------------------

		ResourceBundle langResource = null;
		langResource = ResourceBundle.getBundle("mesages", Locale.FRANCE);

		String msg = langResource.getString("welcome.msg");
		System.out.println(msg);

	}
}
