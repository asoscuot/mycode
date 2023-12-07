package Book;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;



@WebServlet("/AddToCartServlet")
public class AddToCartServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int bookID = Integer.parseInt(request.getParameter("bookID"));
        List<Book> cart = getCartFromSession(request.getSession());
        List<Book> searchResults = (List<Book>) request.getSession().getAttribute("searchResults");
        Book selectedBook = getBookById(searchResults, bookID);
        addToCart(cart, selectedBook);
        response.sendRedirect("bookSearch.jsp");
    }

    private List<Book> getCartFromSession(HttpSession session) {
        List<Book> cart = (List<Book>) session.getAttribute("cart");

        if (cart == null) {
            cart = new ArrayList<>();
            session.setAttribute("cart", cart);
        }

        return cart;
    }

    private Book getBookById(List<Book> searchResults, int bookID) {
        for (Book book : searchResults) {
            if (book.getId() == bookID) {
                return book;
            }
        }
        return null;
    }

    private void addToCart(List<Book> cart, Book book) {
        cart.add(book);
    }
}