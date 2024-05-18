package Lr10.Example2;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Task_1_3 {
    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);
        var path = "src/Lr10/Example2/example123.xml";
        try {
            File inputFile = new File(path);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);

            doc.getDocumentElement().normalize();
            System.out.println("Корневой элемент: " + doc.getDocumentElement().getNodeName());
            NodeList nodeList = doc.getElementsByTagName("employee");

            int employeeIdx = nodeList.getLength() - 1;  // индекс последнего сотрудника добавленного
            Node employee = nodeList.item(employeeIdx);
            Node parentNode = employee.getParentNode();
            parentNode.removeChild(employee);

            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                System.out.println("\nТекущий элемент:" + node.getNodeName());
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    System.out.println("Депортамент: "
                            + element.getElementsByTagName("office").item(0)
                            .getTextContent());
                    System.out.println("ФИО сотрудника: "
                            + element.getElementsByTagName("name").item(0)
                            .getTextContent());
                    System.out.println("Стаж: "
                            + element.getElementsByTagName("experience").item(0)
                            .getTextContent());
                }
            }

            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(path);

            // Save the updated XML file
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();

            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(OutputKeys.STANDALONE, "yes");
            transformer.setOutputProperty(OutputKeys.INDENT, "no");
            transformer.transform(source, result);
        } catch (
                Exception e) {
            e.printStackTrace();
        }
    }
}