package com.fdmgroup.beardeddev.listeners;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import com.beardeddev.nycdeathdata.dao.LeadingCauseDAO;

/**
 * Application Lifecycle Listener implementation class StartUpXMLListener
 *
 */
@WebListener
public class StartUpXMLListener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public StartUpXMLListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent arg0)  { 
//		DOMXMLParser domxmlParser = new DOMXMLParser();
//		Collection<LeadingCause> leadingCauses = domxmlParser.buildDOMTree();
//		LeadingCauseDAO leadingCauseDAO = new LeadingCauseDAO();
//		leadingCauseDAO.createAll(leadingCauses);
    }
	
}
