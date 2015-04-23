package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import control.DBConnect;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("                <link rel=\"stylesheet\" type=\"text/css\" href=\"discussion.css\">\n");
      out.write("\t\t\t\t<link href='http://fonts.googleapis.com/css?family=Open+Sans+Condensed:300' rel='stylesheet' type='text/css'>\n");
      out.write("\t</head>\n");
      out.write("\t<body>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t");

				try
                                {
                                    DBConnect db=new DBConnect();
                                    String n2 =(String)session.getAttribute("login_id");
                                    String qSQL="select * from message where rid='"+n2+"'";
                                    db.pstmt=db.conn.prepareStatement(qSQL);
                                    db.rs=db.pstmt.executeQuery();
				}
                                catch(Exception e)
				{
								
				}
			
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<div id=\"nav\">\n");
      out.write("\t\t\t\t\t\t\t\t<div id=\"nav_wrapper\">\n");
      out.write("\t\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"home.jsp\">Home</a></li><li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"discussion.jsp\">Discussions</a></li><li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\">Notifications</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t");

										while(db.rs.next())
										{	
											<li>out.print(""+db.rs.getString("message"))</li>
										}
									
      out.write("\n");
      out.write("                                  \n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"message.html\">Send Message</a></li><li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"\">Settings<img src=\"arrow.png\" id=\"circle\" /></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"updatep.jsp\">Edit Profile</a></li><li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"logout.jsp\">Logout</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("                            ");

                                try
                                {
                                    
                                    DBConnect db=new DBConnect();
                                    String n =(String)session.getAttribute("login_id");
                                    String qSQL= "select * from user2 where login_id='"+n+"'";
                                    db.pstmt=db.conn.prepareStatement(qSQL);
                                    db.rs=db.pstmt.executeQuery();
                                    while(db.rs.next())
                                    {
                              
      out.write("\n");
      out.write("}       \n");
      out.write("\t\t\t\t\t<table class=\"table-fill\">\n");
      out.write("\t\t\t\t\t<tbody class=\"table-hover\">\n");
      out.write("\t\t\t\t\t<tr>\n");
      out.write("                                            <td class=\"text-left\">Name</td>\n");
      out.write("                                            <td class=\"text-left\">");
out.println(db.rs.getString("first_name")+" "+db.rs.getString("last_name"));
      out.write("</td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t<tr>\n");
      out.write("                                            <td class=\"text-left\">User-ID</td>\n");
      out.write("                                            <td class=\"text-left\">");
out.println(db.rs.getString("login_id")+"</h4>"); 
      out.write("</td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t<tr>\n");
      out.write("                                            <td class=\"text-left\">Branch</td>\n");
      out.write("                                            <td class=\"text-left\">");
 out.println(db.rs.getString("branch")+"</h4>");
      out.write("</td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t<tr>\n");
      out.write("                                            <td class=\"text-left\">Roll Number</td>\n");
      out.write("                                            <td class=\"text-left\">");
 out.println(db.rs.getString("rollno")+"</h4>");
      out.write("</td>\n");
      out.write("\t\t\t\t\t<\\tr>\n");
      out.write("\t\t\t\t\t<tr>\n");
      out.write("                                            <td class=\"text-left\">Gender</td>\n");
      out.write("                                            <td class=\"text-left\">");
 out.println(db.rs.getString("gender")+"</h4>");
      out.write("</td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t<tr>\n");
      out.write("                                            <td class=\"text-left\">Mobile Number</td>\n");
      out.write("                                            <td class=\"text-left\">");
 out.println(db.rs.getString("mobileno")+"</h4>");
      out.write("</td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t<tr>\n");
      out.write("                                            <td class=\"text-left\">Roll Number</td>\n");
      out.write("                                            <td class=\"text-left\">");
 out.println(db.rs.getString("house")+"</h4>");
      out.write("</td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t<tr>\n");
      out.write("                                            <td class=\"text-left\">House</td>\n");
      out.write("                                            <td class=\"text-left\">");
 out.println(db.rs.getString("date_of_birth")+"</h4>");
      out.write("</td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t<tr>\n");
      out.write("                                            <td class=\"text-left\">Home Town</td>\n");
      out.write("                                            <td class=\"text-left\">");
 out.println(db.rs.getString("home_town")+"</h4>");
      out.write("</td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td class=\"text-left\">About</td>\n");
      out.write("                                            <td class=\"text-left\">");
 out.println(db.rs.getString("about")+"</h4>");
      out.write("</td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t<tr>\n");
      out.write("                                            <td class=\"text-left\">Hostel</td>\n");
      out.write("                                            <td class=\"text-left\">");
 out.println(db.rs.getString("hostel")+"</h4>");
      out.write("</td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                             <td class=\"text-left\">Education</td>\n");
      out.write("                                            <td class=\"text-left\">");
 out.println(db.rs.getString("education")+"</h4><br>");
      out.write("</td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t</tbody>\n");
      out.write("\t\t\t\t\t</table>\n");
      out.write("                        ");

				}
								}
                                catch(Exception e)
                                {
                                    out.print(""+e);
                                }
                        
      out.write("\n");
      out.write("                        \n");
      out.write("                        </div>\n");
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
