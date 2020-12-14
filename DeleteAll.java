

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DeleteAll
 */
@WebServlet("/DeleteAll")
public class DeleteAll extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		try {
			request.getRequestDispatcher("main.html").include(request, response);
		} catch (ServletException e) {
			e.printStackTrace();
		}
		
	
  		ViewAll.contact.clear();
  		 
	}

}
