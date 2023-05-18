import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet (name="incorrectGuess", urlPatterns = "/incorrect")
public class LoseGuess extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        req.setAttribute("message", "You Lost!");
        req.getRequestDispatcher("/winOrLose.jsp").forward(req, res);
    }
}
