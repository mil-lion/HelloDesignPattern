/*
 * File:    TestXml.java
 * Project: HelloDesignPattern
 * Date:    14 дек. 2019 г. 00:18:56
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2019 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.creational.builder;

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

            // print to out
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.transform(new DOMSource(xmlDoc), new StreamResult(System.out));

        } catch (ParserConfigurationException | TransformerException | TransformerFactoryConfigurationError ex) {
            System.err.println("Error: " + ex.getMessage());
        }
    }

}
