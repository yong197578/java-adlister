import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet (name="viewColorServlet", urlPatterns = "/viewcolor")
public class ViewColor extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
//        String color = req.getParameter("color");
        req.getRequestDispatcher("/viewColor.jsp").forward(req, res);
    }
}
