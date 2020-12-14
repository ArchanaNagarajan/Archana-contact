

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/view")
public class View extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		 response.setContentType("text/html");

		    PrintWriter out = response.getWriter();
			  
			try {
				request.getRequestDispatcher("main.html").include(request, response);
			} catch (ServletException e) {
				e.printStackTrace();
			}
			
		    String name = request.getParameter("name");
		    
		    switch(name) {
		    
		    case "Arav":
		    	 out.write(" Contact name: "+ name+"<br>" );
		    	 out.write("Mobile number: 9823124090 <br>");
		    	 break;
		    case "Kalai":
		    	 out.write(" Contact name: "+ name+"<br>" );
		    	 out.write("Mobile number: 8122909340 <br>");
		    	 break;
		    case "Janani":
		    	 out.write(" Contact name: "+ name+"<br>" );
		    	 out.write("Mobile number: 7358682689 <br>");
		    	 break;
		    case "Nagarajan":
		    	out.write(" Contact name: "+ name+"<br>" );
		    	 out.write("Mobile number: 9444722270 <br>");
		    	 break;
		    case "Deepiha":
		    	out.write(" Contact name: "+ name+"<br>" );
		    	 out.write("Mobile number: 9054678321 <br>");
		    	 break;
		    default:
		    	out.write("The name doesnot exists");
		    }
		     
	}

}
