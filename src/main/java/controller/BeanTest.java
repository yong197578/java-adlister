package controller;

import models.Album;
import models.Author;
import models.Quote;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name="controller.BeanTest", urlPatterns = "/beantest")
public class BeanTest extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        'Michael Jackson', 'Thriller', 1982, 51.2, 'Pop, post-disco, funk, rock'
//        'AC/DC', 'Back in Black', 1980, 30.1, 'Hard rock'

        Album artist1 = new Album(1, "Michael Jackson", "Thriller", 51.2, 1982, "Pop");
        Album artist2 = new Album(2, "AC/DC", "Back in Black", 30.1, 1980, "Hard Rock");

        Author a1 = new Author(1, "Dogulas", "Adam");
        Author a2 = new Author(2, "Mark", "Twain");


        Quote q1 = new Quote(1, a1, "Java is awesome!");
        Quote q2 = new Quote(2, a2, "Java is hard!");
        Quote q3 = new Quote(3, a1, "What?");
        Quote q4 = new Quote(4, a2, "you heard me");

        List<Album> artists = new ArrayList<>();
        List<Author> authors = new ArrayList<>();
        List<Quote> quotes = new ArrayList<>();

        artists.add(artist1);
        artists.add(artist2);

        authors.add(a1);
        authors.add(a2);

        quotes.add(q1);
        quotes.add(q2);
        quotes.add(q3);
        quotes.add(q4);

        req.setAttribute("albums", artists);
        req.setAttribute("quotes", quotes);

        req.getRequestDispatcher("/beanTest.jsp").forward(req, resp);

    }
}
