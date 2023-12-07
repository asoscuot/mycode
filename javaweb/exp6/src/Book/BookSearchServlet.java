package Book;
import conn.Dao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/BookSearchServlet")
public class BookSearchServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        String bookName = request.getParameter("bookName");

        Dao dao = new Dao();
        Connection con = dao.connection();
        boolean found = false;
        try {

            String query = "SELECT * FROM books WHERE BookName LIKE ?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, "%" + bookName + "%");
            ResultSet rs = pst.executeQuery();

            List<Book> searchResults = new ArrayList<>();

            while (rs.next()) {
                found=true;
                int bookID = rs.getInt("BookId");
                String name = rs.getString("BooKName");
                double price = rs.getDouble("BookPrice");

                out.println("Book ID: " + bookID + "<br>");
                out.println("Book Name: " + name + "<br>");
                out.println("Book Price: " + price + "<br><br>");

                searchResults.add(new Book(bookID, name, price));

                out.println("<form action=\"AddToCartServlet\" method=\"post\">");
                out.println("<input type=\"hidden\" name=\"bookID\" value=\"" + bookID + "\">");
                out.println("<input type=\"submit\" value=\"Add to Cart\">");
                out.println("</form><br>");
            }

            if (!found){
                out.println("抱歉，本店没有此书！");
            }

            request.getSession().setAttribute("searchResults", searchResults);

            con.close();
        } catch (Exception e) {
            out.println(e);
        }
    }
}
