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
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Task_1 {
    public static void main(String[] args) {
        var path = "src/Lr10/Example2/employees.xml";  // путь до файла сохранения

        // 1. Создание файла с данными
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

            // Создание корневого файла
            Document doc = docBuilder.newDocument();
            Element rootElement = doc.createElement("list");
            doc.appendChild(rootElement);

            Scanner in = new Scanner(System.in);

            // Добавление нового элемента в цикле while из консоли
            while (true) {
                System.out.print("Введите Имя нового работника: ");
                String name = in.nextLine();
                if (Objects.equals(name, "выход")) {
                    break;
                }
                System.out.print("Введите Отдел: ");
                String office = in.nextLine();
                if (Objects.equals(office, "выход")) {
                    break;
                }
                System.out.print("Введите Стаж: ");
                String experience = in.nextLine();
                if (Objects.equals(experience, "выход")) {
                    break;
                }

                Element employee_ = doc.createElement("employee");
                rootElement.appendChild(employee_);

                Element office_ = doc.createElement("office");
                office_.appendChild(doc.createTextNode(office));
                employee_.appendChild(office_);

                Element name_ = doc.createElement("name");
                name_.appendChild(doc.createTextNode(name));
                employee_.appendChild(name_);

                Element experience_ = doc.createElement("experience");
                experience_.appendChild(doc.createTextNode(experience));
                employee_.appendChild(experience_);
            }

            // Добавление элементов вручную
            Element employee1 = doc.createElement("employee");
            rootElement.appendChild(employee1);

            Element office1 = doc.createElement("office");
            office1.appendChild(doc.createTextNode("Сопровождения ИТ продукта"));
            employee1.appendChild(office1);

            Element name1 = doc.createElement("name");
            name1.appendChild(doc.createTextNode("Сафронова А.П."));
            employee1.appendChild(name1);

            Element experience1 = doc.createElement("experience");
            experience1.appendChild(doc.createTextNode("3.5"));
            employee1.appendChild(experience1);


            Element employee2 = doc.createElement("employee");
            rootElement.appendChild(employee2);

            Element office2 = doc.createElement("office");
            office2.appendChild(doc.createTextNode("Data Science"));
            employee2.appendChild(office2);

            Element name2 = doc.createElement("name");
            name2.appendChild(doc.createTextNode("Поляков С.В."));
            employee2.appendChild(name2);

            Element experience2 = doc.createElement("experience");
            experience2.appendChild(doc.createTextNode("5"));
            employee2.appendChild(experience2);

            // Запись XML-файла
            doc.setXmlStandalone(true);
            doc.normalizeDocument();
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(OutputKeys.STANDALONE, "yes");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File(path));
            transformer.transform(source, result);

            System.out.println("XML-файл успешно создан!");
        } catch (Exception pce) {
            pce.printStackTrace();
        }

        // 2. Добавление в сущ. файл новых элементов
        try {
            File inputFile = new File(path);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);

            // Создание нового элемента
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

            // Добавление нового жлемента в список
            doc.getDocumentElement().appendChild(newEmployee);

            doc.getDocumentElement().normalize();
            System.out.println("Корневой элемент: " + doc.getDocumentElement().getNodeName());
            NodeList nodeList = doc.getElementsByTagName("employee");
            // вывод данных на экран
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

            // Запись XML-файла
            doc.setXmlStandalone(true);
            doc.normalizeDocument();
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(OutputKeys.STANDALONE, "yes");
            transformer.setOutputProperty(OutputKeys.INDENT, "no");
            transformer.transform(source, result);

            System.out.println("XML-файл после фильтрации успешно сохранен!");
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 3. Удаление элемента из готового файла
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

            // Запись XML-файла
            doc.setXmlStandalone(true);
            doc.normalizeDocument();
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(OutputKeys.STANDALONE, "yes");
            transformer.setOutputProperty(OutputKeys.INDENT, "no");
            transformer.transform(source, result);

            System.out.println("XML-файл после удаления сотрудника успешно сохранен!");

        } catch (
                Exception e) {
            e.printStackTrace();
        }

    }
}
