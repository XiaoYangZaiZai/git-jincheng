package com.ityang.test;


import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import java.util.List;

public class DemoTest {
    @Test
    public void test1() throws DocumentException {
        SAXReader reader = new SAXReader();
        Document document = reader.read(DemoTest.class.getClassLoader().getResourceAsStream("xml/reader.xml"));
        List<Node> nodes = document.selectNodes("//student/id");
        for (Node node : nodes) {
            Element idEL= (Element) node;
            System.out.println(idEL.getText());
        }

    }
}
