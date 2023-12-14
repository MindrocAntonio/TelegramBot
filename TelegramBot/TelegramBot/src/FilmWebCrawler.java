import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class FilmWebCrawler {

    public static void crawlAndStoreData(String chatId) {
        String url = "https://www.film.it/film/film-a-z/";

        // Informazioni di connessione al database
        String dbUrl = "jdbc:mysql://localhost/movies";
        String dbUser = "utente";
        String dbPassword = "password";

        try {
            Connection connection = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
            Document document = Jsoup.connect(url).get();

            Elements filmElements = document.select("div.film-card");

            for (Element filmElement : filmElements) {
                String title = filmElement.select("h2.film-title").text().trim();
                String genre = filmElement.select("span.film-genre").text().trim();
                String year = filmElement.select("span.film-year").text().trim();

                String query = "INSERT INTO movies (titolo, genere, anno) VALUES (?, ?, ?)";
                try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                    preparedStatement.setString(1, title);
                    preparedStatement.setString(2, genre);
                    preparedStatement.setString(3, year);
                    preparedStatement.executeUpdate();
                }
            }

            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
