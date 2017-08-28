import java.io.IOException;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@SuppressWarnings("serial")
@WebServlet("/Login")
public class Login extends HttpServlet implements Servlet {
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException {
		
		
		String uname=req.getParameter("uname");
		
		String pwd=req.getParameter("pwd");
		
		if(uname.equals("niit") && pwd.equals("niit123"))
		{
			//HttpSession session=req.getSession();
			//session.setAttribute("username", uname);
			
		res.sendRedirect("welcome.html");
		}
		else
		{
			res.sendRedirect("login.html");
		}
		
	}
}
	