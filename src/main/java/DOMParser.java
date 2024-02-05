import java.io.File;
import java.nio.file.Paths;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DOMParser {
    public static void main(String[] args){
        try {
            // 파일 경로
            File stocks = new File(Paths.get("").toAbsolutePath()+"/src/main/java/수두.xml");
            // 파일 읽기
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(stocks);
            doc.getDocumentElement().normalize();

            System.out.println("파일출력");

            // 읽어들인 파일 불러오기
            NodeList nodes = doc.getElementsByTagName("Record");
            for (int k = 0; k < nodes.getLength(); k++) {
                Node node = nodes.item(k);

                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    System.out.println("1월: " + getValue("COLUMN2", element));
                    System.out.println("2월: " + getValue("COLUMN3", element));
                    System.out.println("3월: " + getValue("COLUMN4", element));
                    System.out.println("4월: " + getValue("COLUMN5", element));
                    System.out.println("5월: " + getValue("COLUMN6", element));
                    System.out.println("6월: " + getValue("COLUMN7", element));
                    System.out.println("7월: " + getValue("COLUMN8", element));
                    System.out.println("8월: " + getValue("COLUMN9", element));
                    System.out.println("9월: " + getValue("COLUMN10", element));
                    System.out.println("10월: " + getValue("COLUMN11", element));
                    System.out.println("11월: " + getValue("COLUMN12", element));
                    System.out.println("12월: " + getValue("COLUMN13", element));

                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static String getValue(String tag, Element element) {
        NodeList nodes = element.getElementsByTagName(tag).item(0).getChildNodes();
        Node node = (Node) nodes.item(0);
        return node.getNodeValue();
    }
}
