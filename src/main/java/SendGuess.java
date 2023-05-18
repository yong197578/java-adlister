import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;

@WebServlet(name="sendGuess", urlPatterns = "/guess")
public class SendGuess extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        req.getRequestDispatcher("/guess.jsp").forward(req, res);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        Random random = new Random();
        int randomNumber = random.nextInt(3) + 1;
        String guessParam = req.getParameter("guess");
        if (guessParam.isEmpty()) {
            res.sendRedirect("/guess");
        } else {
            int guessNum = Integer.parseInt(req.getParameter(("guess")));
            if (guessNum > 3 || guessNum == 0) {
                res.sendRedirect("/guess");
            } else {
                if (randomNumber == guessNum) {
                    res.sendRedirect(req.getContextPath() + "/correct");
                } else {
                    res.sendRedirect(req.getContextPath() + "/incorrect");
                }
            }
        }
    }
}
