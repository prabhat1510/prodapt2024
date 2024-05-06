package httpsessionservletexample.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/")
public class LoginFormSessionServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//response.setContentType("text/html");
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/loginsession.jsp");
		rd.forward(request, response);
		/**
		 * //Get the encoded URL string String encodedURL =
		 * response.encodeRedirectURL("loginsession.html");
		 * response.sendRedirect(encodedURL);
		 **/

	}

}