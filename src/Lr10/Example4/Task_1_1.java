package Lr10.Example4;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

import java.io.FileWriter;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.List;

public class Task_1_1 {
    public static void main(String[] args) {
        try {
            var path = "src/Lr10/Example4/news.json";
            JSONObject list = new JSONObject();
            JSONArray newsArray = new JSONArray();

//            var url = "https://lenta123123123123.ru";
            var url = "https://lenta.ru";


            try {
                Document doc = Jsoup.connect(url).get(); // Получаем HML-код страницы

                Elements newsParent = doc.select("div.topnews"); // Извлекаем список новостей
                List<Node> nodes = newsParent.get(0).childNodes();
                int columnCounter = 0;
                int newscounter = 0;
                while (newscounter < 10) { // Выводим последние 10 новостей
                    var newsLinks = (((Element) nodes.get(columnCounter)).getElementsByTag("a"));
                    for (int i = 0; i < newsLinks.size(); i++) {
                        var newsCard = newsLinks.get(i);
                        var text = newsCard.text();
                        var link = url + newsCard.attr("href");

                        JSONObject news = new JSONObject();
                        news.put("text", text);
                        news.put("link", link);
                        newsArray.add(news);

                        newscounter += 1;
                    }
                    columnCounter += 1;
                }
                list.put("news", newsArray);
                try (FileWriter file = new FileWriter(path)) {
                    file.write(list.toJSONString());
                    System.out.println("JSON файл '" + path + "' с новостями успешно создан!");
                } catch (Exception e) {
                    e.printStackTrace();
                }

            } catch (UnknownHostException e) {
                System.out.println("Неизвестный сайт: " + e.getMessage());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
