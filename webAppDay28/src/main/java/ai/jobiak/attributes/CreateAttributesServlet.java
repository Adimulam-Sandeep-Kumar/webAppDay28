package ai.jobiak.attributes;

import java.io.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CreateAttributesServlet
 */
@WebServlet("/get")
public class CreateAttributesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateAttributesServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();//.append("Served at: ").append(request.getContextPath());
		
		ServletContext context = getServletContext();	//the context will be alive till the application is running on server
		context.setAttribute("dbName", "MySql");		//the context attributes will be available to all servlets and jsps in an application
		context.setAttribute("dbVersion", "8.0.28");	//these attributes will be in memory till the application is running-global scope or application scope
		
		request.setAttribute("jdk", "17.01");	//will be alive till the request is in progress on server side
		request.setAttribute("os", "Windows 10");	//they are lost once the response is sent to client
		
		RequestDispatcher dispatcher = context.getRequestDispatcher("/get1");
		dispatcher.forward(request, response);
		
		//dispatcher.include(request,response)
		
		
	}

}
