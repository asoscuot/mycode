package Book;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/ViewCartServlet")
public class ViewCartServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        List<Book> cart = getCartFromSession(request.getSession());

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        out.println("<h2>Shopping Cart</h2>");

        if (cart.isEmpty()) {
            out.println("<p>Your shopping cart is empty.</p >");
        } else {
            for (Book book : cart) {
                int bookID = book.getId();
                String name = book.getName();
                double price = book.getPrice();

                out.println("<p>Book ID: " + bookID + "<br>");
                out.println("Book Name: " + name + "<br>");
                out.println("Book Price: " + price + "</p >");
                out.println("<a href=\"RemoveFromCartServlet?bookID=" + bookID + "\">Remove From Cart</a><br><br>");
            }
        }

        out.println("<a href=\"bookSearch.jsp\">Continue Shopping</a >");
    }
    private List<Book> getCartFromSession(HttpSession session) {
        List<Book> cart = (List<Book>) session.getAttribute("cart");

        if (cart == null) {
            cart = new ArrayList<>();
            session.setAttribute("cart", cart);
        }

        return cart;
    }
}




