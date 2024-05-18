package Lr10.Example2;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import java.io.File;
import java.util.Objects;
import java.util.Scanner;

public class Task_1_1 {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

//          Создание корневого файла
            Document doc = docBuilder.newDocument();
            Element rootElement = doc.createElement("list");
            doc.appendChild(rootElement);

            Scanner in = new Scanner(System.in);

            // Добавление нового сотрудника
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

//          Добавление первого предмета
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

//          Добавление второй книги
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
            javax.xml.transform.TransformerFactory tf = javax.xml.transform.TransformerFactory.newInstance();
            javax.xml.transform.Transformer transformer = tf.newTransformer();
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(OutputKeys.STANDALONE, "yes");
            transformer.setOutputProperty(OutputKeys.INDENT, "no");
            javax.xml.transform.dom.DOMSource sourse = new javax.xml.transform.dom.DOMSource(doc);
            javax.xml.transform.stream.StreamResult result =
                    new javax.xml.transform.stream.StreamResult(new File("src/Lr10/Example2/example123.xml"));
            transformer.transform(sourse, result);

            System.out.println("XML-файл успешно создан!");
        } catch (Exception pce) {
            pce.printStackTrace();
        }
    }
}
