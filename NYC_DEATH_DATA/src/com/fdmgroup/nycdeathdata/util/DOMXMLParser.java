package com.fdmgroup.nycdeathdata.util;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;

public class DOMXMLParser {

  public static void main(String argv[]) {

    try {

	File fXmlFile = new File("data.xml");
	DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	Document doc = dBuilder.parse(fXmlFile);
			
	//optional, but recommended
	//read this - http://stackoverflow.com/questions/13786607/normalization-in-dom-parsing-with-java-how-does-it-work
	doc.getDocumentElement().normalize();

	System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
			
	NodeList nList = doc.getElementsByTagName("row");
			
	System.out.println("----------------------------");

	for (int temp = 0; temp < nList.getLength(); temp++) {

		Node nNode = nList.item(temp);
				
		System.out.println("\nCurrent Element :" + nNode.getNodeName());
				
		if (nNode.getNodeType() == Node.ELEMENT_NODE) {

			Element eElement = (Element) nNode;
			String year = eElement.getElementsByTagName("year").item(0).getTextContent();
			String ethnicity = eElement.getElementsByTagName("ethnicity").item(0).getTextContent();
			String sex = eElement.getElementsByTagName("sex").item(0).getTextContent();
			String causeOfDeath = eElement.getElementsByTagName("cause_of_death").item(0).getTextContent();
			String count = eElement.getElementsByTagName("count").item(0).getTextContent();
			String percentage = eElement.getElementsByTagName("percent").item(0).getTextContent();
			
			LeadingCause leadingCause = new LeadingCause(Integer.parseInt(year), ethnicity,Sex.valueOf(sex), causeOfDeath, 
					Integer.parseInt(count), Double.parseDouble(percentage));
			LeadingCauseDAO.create(leadingCause);
			
			System.out.println("Year : " + eElement.getElementsByTagName("year").item(0).getTextContent());
			System.out.println("Ethnicity : " + eElement.getElementsByTagName("ethnicity").item(0).getTextContent());
			System.out.println("Sex: " + eElement.getElementsByTagName("sex").item(0).getTextContent());
			
			System.out.println("Cause of Death : " + eElement.getElementsByTagName("cause_of_death").item(0).getTextContent());
			System.out.println("Count : " + eElement.getElementsByTagName("count").item(0).getTextContent());
			System.out.println("Percentage : " + eElement.getElementsByTagName("percent").item(0).getTextContent());

		}
	}
	System.out.println("");
    } catch (Exception e) {
	e.printStackTrace();
    }
    
  }

}