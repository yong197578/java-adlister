import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

@WebServlet(name = "pizzaOrderServlet", urlPatterns = "/pizza-order")
public class PizzaOrder extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        req.getRequestDispatcher("/pizzaOrder.jsp").forward(req, res);
    }
    protected void doPost(HttpServletRequest req, HttpServletResponse rep) throws IOException{
        String crust = req.getParameter(("pizzaCrust"));
        //this is for checkbox
        String topping = Arrays.toString(req.getParameterValues(("topping")));
        String address = req.getParameter(("address"));
        System.out.println(crust);
        System.out.println(topping);
        System.out.println(address);
    }
}
