package Lr10.Example2;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Task_1_2 {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
        var path = "src/Lr10/Example2/example123.xml";
        try {
            File inputFile = new File(path);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);

//             Create a new employee element
            Element newEmployee = doc.createElement("employee");
            Element office = doc.createElement("office");
            office.appendChild(doc.createTextNode("Пандора"));
            newEmployee.appendChild(office);
            Element name = doc.createElement("name");
            name.appendChild(doc.createTextNode("Иван"));
            newEmployee.appendChild(name);
            Element experience = doc.createElement("experience");
            experience.appendChild(doc.createTextNode("5"));
            newEmployee.appendChild(experience);

//             Add the new employee element to the list
            doc.getDocumentElement().appendChild(newEmployee);

            doc.getDocumentElement().normalize();
            System.out.println("Корневой элемент: " + doc.getDocumentElement().getNodeName());
            NodeList nodeList = doc.getElementsByTagName("employee");
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

            // Настраиваем стрим для послед. фильтрации элементов
            Stream<Node> nodeStream = IntStream.range(0, nodeList.getLength()).mapToObj(nodeList::item);
            List<Element> filteredEmployee = nodeStream
                    .filter(node -> node.getNodeType() == Node.ELEMENT_NODE)
                    .map(node -> (Element) node)
                    .filter(element -> {
                        String name1 = element.getElementsByTagName("name").item(0).getTextContent();
                        String experience1 = element.getElementsByTagName("experience").item(0).getTextContent();
                        return name1.equalsIgnoreCase("Сафронова А.П.") && experience1.equals("3.5");
                    }).toList();


            // Выводим все найденные фильтром элементы
            for (int i = 0; i < filteredEmployee.size(); i++) {
                Node node = filteredEmployee.get(i);
                System.out.println("\nНАЙДЕННЫЙ ЭЛЕМЕНТ:" + node.getNodeName());
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

//             Save the updated XML file
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();

            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(OutputKeys.STANDALONE, "yes");
            transformer.setOutputProperty(OutputKeys.INDENT, "no");
            transformer.transform(source, result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}