package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import control.DBConnect;

public final class home_005f1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<html>\n");
      out.write("\t<head>\n");
      out.write("\t\t<title>\n");
      out.write("\t\tindex\n");
      out.write("\t\t</title>\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"main.css\">\n");
      out.write("\t\t<link href=\"style_1.css\" type=\"text/css\" rel=\"stylesheet\"/>\n");
      out.write("                <style>\n");
      out.write("                    body\n");
      out.write("                    {\n");
      out.write("                        color:white;\n");
      out.write("                        text-decoration: none;\n");
      out.write("                    }\n");
      out.write("                </style>\n");
      out.write("                \n");
      out.write("\t</head>\n");
      out.write("\t<body >\n");
      out.write("\t\t    <div id=\"nav\">\n");
      out.write("\t\t\t<div id=\"nav_wrapper\">\n");
      out.write("\t\t\t<ul>\n");
      out.write("\t\t\t<li><a href=\"home_1.jsp\">Home</a></li><li>\n");
      out.write("\t\t\t<a href=\"Discussion.jsp\">Discussions</a></li><li>\n");
      out.write("\t\t\t<a href=\"#\">Notifications</a></li><li>\n");
      out.write("\t\t\t<a href=\"message.html\">Send Message</a></li><li>\n");
      out.write("\t\t\t<a href=\"#\">Settings<img src=\"arrow.png\" id=\"circle\" /></a>\n");
      out.write("\t\t\t\t<ul>\n");
      out.write("\t\t\t\t<li><a href=\"deleteuser.jsp\">Delete Account</a></li><li>\n");
      out.write("\t\t\t\t<a href=\"logout.jsp\">Logout</a></li>\n");
      out.write("\t\t\t\t</ul></ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\n");

    try
    {
                           
    DBConnect db=new DBConnect();
    String n =(String)session.getAttribute("login_id");
    String qSQL= "select * from user2 where login_id='"+n+"'";
    db.pstmt=db.conn.prepareStatement(qSQL);
    db.rs=db.pstmt.executeQuery();
        while(db.rs.next())
        {       
        out.println("<table class=\"table-fill\"><thead><tr><th class=\"text-left\">Profile</th><th class=\"text-left\"></th></tr></thead><tbody class=\"table-hover\">");
        out.println("<table class=\"table-fill\"><thead><tr><th class=\"text-left\">Profile</th><th class=\"text-left\"></th></tr></thead><tbody class=\"table-hover\">");
        out.println("<tr><td class=\"text-left\">Name</td><td class=\"text-left\">"+db.rs.getString("first_name")+" "+db.rs.getString("last_name")+"</td></tr>");
        out.println("<tr><td class=\"text-left\"> Login Id</td><td class=\"text-left\">"+db.rs.getString("login_id")+"</td></tr>");
        out.println("<tr><td class=\"text-left\"> Branch</td><td class=\"text-left\">"+db.rs.getString("branch")+"</td></tr>");
        out.println("<tr><td class=\"text-left\"> Roll No</td><td class=\"text-left\">"+db.rs.getString("rollno")+"</td></tr>");
        out.println("<tr><td class=\"text-left\"> Gender</td><td class=\"text-left\">"+db.rs.getString("gender")+"</td></tr>");
        out.println("<tr><td class=\"text-left\"> Mobile Number</td><td class=\"text-left\">"+db.rs.getString("mobileno")+"</td></tr>");
        out.println("<tr><td class=\"text-left\"> House</td><td class=\"text-left\">"+db.rs.getString("house")+"</td></tr>");
        out.println("<tr><td class=\"text-left\"> Date of Birth</td><td class=\"text-left\">"+db.rs.getString("date_of_birth")+"</td></tr>");
        out.println("<tr><td class=\"text-left\"> Home town</td><td class=\"text-left\">"+db.rs.getString("home_town")+"</td></tr>");
        out.println("<tr><td class=\"text-left\"> About</td><td class=\"text-left\">"+db.rs.getString("about")+"</td></tr>");
        out.println("<tr><td class=\"text-left\"> Hostel</td><td class=\"text-left\">"+db.rs.getString("hostel")+"</td></tr>");
        out.println("<tr><td class=\"text-left\"> Education</td><td class=\"text-left\">"+db.rs.getString("education")+"</td></tr><br>");
        out.println("<tr><td class=\"text-left\"> Education</td><td class=\"text-left\">"+db.rs.getString("education")+"</td></tr><br>");
        
        out.println("</tbody></table>");
        }
    }
    catch(Exception e)
    {
        out.println(""+e);
    }

      out.write("\n");
      out.write("                        \n");
      out.write("\n");
      out.write("<center>\n");
      out.write("\t\t\t<div id=\"bottom\">\n");
      out.write("\t\t\t\t<a href=\"about.html\">About us</a><br>\n");
      out.write("\t\t\t\tLNM Institute of Information Technology\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</center>\n");
      out.write("                        \n");
      out.write("</body>\n");
      out.write("</html>");
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
