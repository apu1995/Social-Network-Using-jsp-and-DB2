package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import control.ValidateInput;
import control.UpdateDB;

public final class updatep_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("      ");
 
         String middle_name = request.getParameter("middle_name");
         String first_name = request.getParameter("first_name");
         String last_name = request.getParameter("last_name");
         String login_id = request.getParameter("login_id");
         String password = request.getParameter("password");
         String cpassword = request.getParameter("cpassword");
         String branch = request.getParameter("item");
         String rollno = request.getParameter("rollno");
         String gender = request.getParameter("item1");
         String mobileno = request.getParameter("mobileno");
         String house = request.getParameter("item2");
         String date_of_birth = request.getParameter("date_of_birth");
         String home_town = request.getParameter("home_town");
         String about = request.getParameter("about");
         String hostel = request.getParameter("hostel");
         String education = request.getParameter("education");
         String security_question = request.getParameter("security_question");
         String security_answer = request.getParameter("security_answer");
         if( true /*(first_name != null )  && (login_id != null) && (password != null) && (cpassword != null) && (rollno != null) && (branch!=null) && (gender != null) && (house!=null) && (mobileno != null) && (date_of_birth!=null) && (hostel != null) && (about != null)*/)
            {
              ValidateInput obj = new ValidateInput();
              if((obj.isalpha(first_name)) && (obj.isalpha(last_name))&& (obj.isbeta(rollno))&& (obj.isnum(mobileno))&& (obj.isbeta(hostel)))
             {
                 if(cpassword.equals(password))
                       //  password.equals(cpassword))
                 {
                     UpdateDB DbObj = new UpdateDB();
                     if(DbObj.create_user(login_id,first_name, middle_name, last_name, password, branch, rollno ,gender ,mobileno, house,date_of_birth,home_town,about,hostel,education))
                     {
                         request.setAttribute("msg","Successfully Updated");
                           getServletContext().getRequestDispatcher("/home.html").forward(request,response);
                        //out.print("<script>alert(\"You are successfully registered !!\");</script>");
                     }
                     else
                    	 out.print("<script>alert(\"Something wrong happened...try again !!\");</script>");
                 }
                 else
                 {
                     out.print("<script>alert(\"Confirm Password and Paaword do not match\");</script>");
                 }
             }
             else
                 {
                     out.print("<script>alert(\"Enter Fields correctly...!!\");</script>");
                 }
            }
         else
                 {
                    
                     out.print("<script>alert(\"Required Fields Left Blank\");</script>");
                 }
     
         
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
