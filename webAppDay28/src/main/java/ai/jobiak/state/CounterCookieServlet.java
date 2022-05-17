package ai.jobiak.state;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CounterCookieServlet
 */
@WebServlet("/get6")
public class CounterCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CounterCookieServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();//.append("Served at: ").append(request.getContextPath());	
		int count=1;
		int beginning=0;
		if(beginning==0) {
		Cookie counterCookie = new Cookie("visits",count+"");
		response.addCookie(counterCookie);
		beginning++;
		}
		Cookie cookies[]=request.getCookies();
		if(cookies!=null) {
		
		for(int i=0;i<cookies.length;i++) {
			
			if(cookies[i].getName().equals("visits")) {
			
				int cookieCounter = Integer.parseInt(cookies[i].getValue());
				count = ++cookieCounter;
			}			
		}
		Cookie counterCookie = new Cookie("visits",count+"");
		response.setContentType("text/html");
		response.addCookie(counterCookie);
		out.println("You have visited #times="+count);
		}
	}
}
