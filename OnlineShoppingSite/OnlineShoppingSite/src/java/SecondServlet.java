/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import static org.apache.coyote.http11.Constants.a;

/**
 *
 * @author aa
 */
public class SecondServlet extends HttpServlet {
private static final long serialVersionUID = 1L;

        protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            // TODO output your page here. You may use following sample code. */
           out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>  <script type=\"text/javascript\">\n" +
                "function Redirect()\n" +
                        "{\n" +
                    "    window.location=\"http://localhost:8084/session/home.html\";\n" +
                             "}\n" +
                         
                          "setTimeout('Redirect()',10);\n" +
                                "</script>  <style>\n" +
"\n" +
"\n" +
"h2{\n" +
"    text-align:center;\n" +
"}\n" +
"\n" +
"\n" +
"</style>");
                               
                         
                          out.println("</head>");
                          out.println("<body>");
                            
                              out.println("</body>");
                             out.println("</html>");
        }
    }

    /**
     * @see HttpServlet#HttpServlet()
     */
    public SecondServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		process(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		process(request,response);
	}
	protected void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		String name = request.getParameter("fname");
		String pwd = request.getParameter("pass");
                DBHandler db = new DBHandler();
                 personDTO p= new personDTO();
		p = db.getrecord(name,pwd);
                HttpSession mySession = request.getSession(true);
	        mySession.setAttribute("name", name);
               
		  if(name.equals("izma") && pwd.equals("izu@005Strange" ) || name.equals("ansha") && pwd.equals("chemistry420" ) )
                  {
                RequestDispatcher  rd = request.getRequestDispatcher("admin.jsp");
			rd.forward(request,response);
                       
                  }
                 else if(p.getEmail()!=null){
			
			processRequest(request, response);
                }
                      else{RequestDispatcher r = request.getRequestDispatcher("index.html");
                      pw.write("<h2 style= text-align:center;color:blue>Failed to Login</h2>");
			pw.write("<h2 style= text-align:center;color:blue>Enter correct name and password</h2>");
		        r.include(request, response);
			
			
		}
		
			
			
			
		}
	}
	
    

