/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
//response.getOutputStream().flush();
//response.getOutputStream().close();

/**
 *
 * @author aa
 */
public class NewServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
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
                    "    window.location=\"http://localhost:8084/session/index.html\";\n" +
                             "}\n" +
                         "document.write(\"WELCOME TO OMEGA SHOPPING \");\n" +
                           "document.write(\"You have sucessfully created your account.\");\n" +
                          "document.write(\"You will be go to login page in 10 sec.\");\n" +
                          "setTimeout('Redirect()', 10000);\n" +
                                "</script>");
            
                         out.println("<title>hello</title>");            
                          out.println("</head>");
                          out.println("<body>");
                            
                              out.println("</body>");
                             out.println("</html>");
        }
    }

  
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
               
		//PrintWriter pw = response.getWriter();
       //       response.getOutputStream();
		String name = request.getParameter("fname");
		String pwd = request.getParameter("pass");
                String mail = request.getParameter("mail");
               //  pw.write("name is"+name);
                DBHandler db = new DBHandler();
              if(db.insertRecord(name,pwd,mail))
              {   
              processRequest(request, response);
              }
            
	
		
		
	}

}
