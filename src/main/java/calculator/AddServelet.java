package calculator;

import java.io.IOException;
import java.io.InvalidObjectException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

public class AddServelet extends HttpServlet

{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
	 int i = Integer.parseInt(req.getParameter("num1"));
	 int j = Integer.parseInt(req.getParameter("num2"));
	 
<<<<<<< HEAD
	 int k = i + j + 10;
=======
	 int k = i + j;
>>>>>>> 031be4c6c2f86f698f5b497b9cfeba0edeb29183
	 
	 PrintWriter out = res.getWriter();
	 
	 res.getWriter().println("the result is " + k);
	}
	
}
