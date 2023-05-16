import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HelloWorldServlet", urlPatterns = {"/hello", "/counts"})
public class HelloWorldServlet extends HttpServlet {

    private int count;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        String name = req.getParameter("name");
        String reset = req.getParameter("reset");

        //http://localhost:8080/counts?reset=true&name=Yong
        if(reset != null && reset.equals("true")){
            count =0;
            out.println("<h1>Reset Completed</h1>");
        }
        //http://localhost:8080/name=Yong
        if (name == null){
            name = "World!";
        }
        out.println("<h1>Hello! " + name  + "!<h1>");

        //http://localhost:8080/counts?name=Yong
        if (req.getServletPath().equals("/count")) {
            count++;
            out.println("<h1>Count: " + count + "</h1>");
        }

    }
}
