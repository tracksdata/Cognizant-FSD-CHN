package com;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class MySessionListener implements HttpSessionListener {

	static int count=0;
	
    public void sessionCreated(HttpSessionEvent hsv)  { 
         
    	hsv.getSession().getServletContext().setAttribute("userCount", ++count);
    	
    }

    public void sessionDestroyed(HttpSessionEvent hsv)  { 
        
    	hsv.getSession().getServletContext().setAttribute("userCount", --count);
    	
    }
	
}
