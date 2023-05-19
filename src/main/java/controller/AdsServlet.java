package controller;

import dao.Ads;
import dao.DaoFactory;
import model.Ad;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name="controller.AdsServlet", urlPatterns = "/ads")
public class AdsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Ad> allAds = DaoFactory.getAdsDao().all();
        req.setAttribute("allAds", allAds);

        req.getRequestDispatcher("/ads/index.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        long id = Long.parseLong(req.getParameter("id"));
        long userId = Long.parseLong(req.getParameter("userId"));
        String title = req.getParameter("title");
        String description = req.getParameter("description");

        Ad newAd = new Ad(id, userId, title, description);

        DaoFactory.getAdsDao().insert(newAd);

        resp.sendRedirect("/ads");
    }
}
