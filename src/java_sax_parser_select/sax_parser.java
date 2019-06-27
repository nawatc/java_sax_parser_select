package java_sax_parser_select;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;

public class sax_parser {
  public static void main(String argv[]) {

    try {

	File fXmlFile = new File("C:\\Users\\Red\\Desktop\\region_daily_forecast.xml");
	DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	Document doc = dBuilder.parse(fXmlFile);
	
	doc.getDocumentElement().normalize();

	System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
			
	NodeList nList = doc.getElementsByTagName("channel");
			
	System.out.println("----------------------------");

	for (int temp = 0; temp < nList.getLength(); temp++) {

		Node nNode = nList.item(temp);
				
		System.out.println("\nCurrent Element :" + nNode.getNodeName());
				
		if (nNode.getNodeType() == Node.ELEMENT_NODE) {

			Element eElement = (Element) nNode;

			System.out.println("title : " + eElement.getElementsByTagName("title").item(0).getTextContent());
			System.out.println("link : " + eElement.getElementsByTagName("link").item(0).getTextContent());
			System.out.println("description : " + eElement.getElementsByTagName("description").item(0).getTextContent());
			System.out.println("language : " + eElement.getElementsByTagName("language").item(0).getTextContent());
			System.out.println("copyright : " + eElement.getElementsByTagName("copyright").item(0).getTextContent());

		}
	}
	
	System.out.println("----------------------------");
	
	NodeList nList_2 = doc.getElementsByTagName("item");
	
	for (int temp = 0; temp < nList_2.getLength(); temp++) {

		Node nNode = nList_2.item(temp);
				
		System.out.println("\nCurrent Element :" + nNode.getNodeName());
				
		if (nNode.getNodeType() == Node.ELEMENT_NODE) {

			Element eElement = (Element) nNode;

			System.out.println("title : " + eElement.getElementsByTagName("title").item(0).getTextContent());
			System.out.println("guid : " + eElement.getElementsByTagName("guid").item(0).getTextContent());
			System.out.println("description : " + eElement.getElementsByTagName("description").item(0).getTextContent());

		}
	}
	
	
	
    } catch (Exception e) {
	e.printStackTrace();
    }
  }

}