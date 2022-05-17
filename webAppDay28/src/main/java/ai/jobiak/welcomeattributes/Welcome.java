package ai.jobiak.welcomeattributes;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Welcome
 */
@WebServlet("/get4")
public class Welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Welcome() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userName = "root";
		String password = "admin";
		String url ="jdbc:mysql://localhost:3306/sandeep";
		PrintWriter out = response.getWriter();
		

		String user = request.getParameter("name");
		
		try {
			
		Class.forName("com.mysql.cj.jdbc.Driver");	
		Connection con = DriverManager.getConnection(url,userName,password);
		
		String query = "select * from mailapp where mailfrom=?";
		PreparedStatement pst = con.prepareStatement(query);
		pst.setString(1,user);
		
		ResultSet rs = pst.executeQuery();
		
		if(rs.next()) {
			
			
		}
		
		
		} catch (SQLException | ClassNotFoundException e) {
		e.printStackTrace();
	}

	}   
}
