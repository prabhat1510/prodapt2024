package sessionmgmtexample.servlet.sessionexample;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginSessionServlet")
public class LoginFormSessionServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

			RequestDispatcher rd = getServletContext().getRequestDispatcher("/loginsession.html");
			rd.forward(request, response);


	}

}