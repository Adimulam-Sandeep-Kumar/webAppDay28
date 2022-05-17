package ai.jobiak.attributes;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ReadAttributesServlet
 */
@WebServlet("/get1")
public class ReadAttributesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReadAttributesServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();//.append("Served at: ").append(request.getContextPath());
		ServletContext context = getServletContext();
		out.println("DB NAME"+"_"+context.getAttribute("dbName"));
		out.println("DB VERSION"+"_"+context.getAttribute("dbVersion"));
		out.println("JDK Version"+"_"+request.getAttribute("jdk"));
		out.println("Platform"+"_"+request.getAttribute("os"));
		
	}

}
