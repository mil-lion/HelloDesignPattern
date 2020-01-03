/*
 * File:    TestXml.java
 * Project: HelloDesignPattern
 * Date:    14 дек. 2019 г. 00:18:56
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2019 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.structural.composite;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author Igor Morenko <morenko at lionsoft.ru>
 */
public class TestXml {

    public static void main(String[] args) {

        try {
            // Builer ????
            DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();

            // Factory XML Node 
            Document xmlDoc = builder.newDocument();
            Element root = xmlDoc.createElement("root");
            xmlDoc.appendChild(root);
            Element test = (Element) root.appendChild(xmlDoc.createElement("test"));
            test.setAttribute("id", "1");
            test.appendChild(xmlDoc.createTextNode("Hello World!"));

            test = (Element) root.appendChild(xmlDoc.createElement("test"));
            test.setAttribute("id", "2");
            test.appendChild(xmlDoc.createTextNode("Hello Java!"));

            // print to out
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.transform(new DOMSource(xmlDoc), new StreamResult(System.out));

            System.out.println("\n#####");
            printNode(xmlDoc, 0);

        } catch (ParserConfigurationException | TransformerException | TransformerFactoryConfigurationError ex) {
            System.err.println("Error: " + ex.getMessage());
        }
    }

    private static void printNode(Node node, int level) {
        System.out.println("level: " + level);
        System.out.println("node type: " + node.getNodeType());
        System.out.println("node name: " + node.getNodeName());
        NodeList list = node.getChildNodes();
        for (int i = 0; i < list.getLength(); i++) {
            printNode(list.item(i), level + 1);
        }
    }

}
