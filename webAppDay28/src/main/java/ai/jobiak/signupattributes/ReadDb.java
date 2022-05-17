package ai.jobiak.signupattributes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ReadDb
 */
@WebServlet("/get3")
public class ReadDb extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReadDb() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		ServletContext context = getServletContext();
		out.println("FNAME"+"_"+context.getAttribute("fname"));
		out.println("EMAIL"+"_"+context.getAttribute("email"));
		out.println("MOBILE"+"_"+context.getAttribute("mobile"));
		out.println("FNAME"+"_"+request.getAttribute("fname"));
		out.println("EMAIL"+"_"+request.getAttribute("email"));
		out.println("MOBILE"+"_"+request.getAttribute("mobile"));		
		
	}

}
