package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import control.DBConnect;

public final class editProfile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Edit Profile</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Indie+Flower' rel='stylesheet' type='text/css'>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Indie+Flower' rel='stylesheet' type='text/css'>\n");
      out.write("        <link rel='stylesheet' href='http://fonts.googleapis.com/css?family=PT+Sans:400,700'>\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/reset.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/supersized.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/style.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Lato:300,400,700' rel='stylesheet' type='text/css' />\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/modernizr.custom.79639.js\"></script> \n");
      out.write("\t<noscript><link rel=\"stylesheet\" type=\"text/css\" href=\"css/noJS.css\" /></noscript>\n");
      out.write("    </head>\n");
      out.write("    ");

                                try
                                {
                                    
                                   DBConnect db=new DBConnect();
                                    String n ="rmaark@gmail.com";
                                    //String qSQL="select * from user2 where user_name ='"+ ${uname}+"'";

                                    String qSQL= "select * from user2 where login_id='"+n+"'";
                                    db.pstmt=db.conn.prepareStatement(qSQL);
                                    db.rs=db.pstmt.executeQuery();
                                    while(db.rs.next())
                            {       String first_name = db.rs.getString("first_name");
                                    String last_name = db.rs.getString("last_name");
                                    String login_id = db.rs.getString("login_id");
                                    String branch = db.rs.getString("branch");
                                    String rollno = db.rs.getString("rollno");
                                    String gender = db.rs.getString("gender");
                                    String mobileno = db.rs.getString("mobileno");
                                    String house = db.rs.getString("house");
                                    String date_of_birth = db.rs.getString("date_of_birth");
                                    String home_town = db.rs.getString("home_town");
                                    String about = db.rs.getString("about");
                                    String hostel = db.rs.getString("hostel");
                                    String education = db.rs.getString("education");
                        }
                                }
                                catch(Exception e)
                                {
                                    out.println(""+e);
                                }
 
      out.write("\n");
      out.write("    <body id=\"register\">\n");
      out.write("        <center>\n");
      out.write("        <div class=\"page-container\">\n");
      out.write("            <form method=\"post\" action=\"updatep.jsp\">\n");
      out.write("                        <h1>EDIT PROFILE</h1><br>\n");
      out.write("                        <input type=\"text\" name=\"login_id\" placeholder=\"Login ID\" /><br>\n");
      out.write("                        <input type=\"password\" name=\"password\" placeholder=\"Password\" /><br>\n");
      out.write("                        <input type=\"password\" name=\"cpassword\" placeholder=\"Re-enter Password\" /><br>\n");
      out.write("                        <input type=\"text\" name=\"first_name\" placeholder=\"First Name\" /><br>\n");
      out.write("                        <input type=\"text\" name=\"middle_name\" placeholder=\"Middle Name\" /><br>\n");
      out.write("                        <input type=\"text\" name=\"last_name\" placeholder=\"Last Name\" /><br>\n");
      out.write("                        <input type=\"text\" name=\"mobileno\" placeholder=\"Mobile Number\" /><br>\n");
      out.write("                        <input type=\"text\" name=\"about\" placeholder=\"About Me\" /><br>\n");
      out.write("                        <input type=\"text\" name=\"hostel\" placeholder=\"Hostel\" /><br>\n");
      out.write("                        <input type=\"text\" name=\"education\" placeholder=\"Education\" /><br>\n");
      out.write("                        <button type=\"submit\">Update</button>\n");
      out.write("                        <button type=\"reset\" id=\"bottom\" >Reset</button>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </center>\n");
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
