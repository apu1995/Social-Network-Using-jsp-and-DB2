package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Discussion;
import model.Question;
import java.util.ArrayList;
import control.DBConnect;

public final class Discussion_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("    <title>Insert title here</title>\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"discussion.css\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"main.css\">\n");
      out.write("\t\t<link href=\"style_1.css\" type=\"text/css\" rel=\"stylesheet\"/>\n");
      out.write("    <link href='http://fonts.googleapis.com/css?family=Open+Sans+Condensed:300' rel='stylesheet' type='text/css'>\n");
      out.write("    <style>\n");
      out.write("        #paddings\n");
      out.write("        {\n");
      out.write("            margin-top:100px;\n");
      out.write("            margin-bottom: 10px;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div id=\"nav\">\n");
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
      out.write("    <div id=\"paddings\">\n");
      out.write("        \n");
      out.write("    </div>\n");

                DBConnect db1= new DBConnect();
                Discussion dis= new Discussion();
                ArrayList<Question> a1 = new ArrayList<Question>();
                a1 = dis.fetch();
                int i; //returns arraylist of questions.
                out.println("<center>");
                out.println("<a href=\"PostQues.html\"><button>Post Question</button></a>");
                Question a = new Question();
                for(i=0;i<a1.size();i++)
                {   
                    a=a1.get(i);
                    out.println("<div id=\"question\">"+a.getQuestion() + "<div id=\"left\">" + a.getlogin_id() + "</div ><a href=\"PostAnswer.jsp\"><button type='submit' name=\"qid\" value="+a.getQID()+">Post Answer</button></a>"+"</div>");
                    String aSQL="select user_id,answer from answer where qid="+a.getQID();
                    db1.pstmt=db1.conn.prepareStatement(aSQL);
                    db1.rs=db1.pstmt.executeQuery();
                    while(db1.rs.next())
	 		{
	 			out.println("<div id=\"answer\">"+db1.rs.getString("answer")+"<div id=\"left\">" + a.getlogin_id() + "</div>"+"</div>");
	 		}
             }
               out.println("</center>");

      out.write("\n");
      out.write("<div id=\"bottom\">\n");
      out.write("\t\t\t\t<a href=\"about.html\">About us</a><br>\n");
      out.write("\t\t\t\tLNM Institute of Information Technology\n");
      out.write("\t\t\t</div>\n");
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
