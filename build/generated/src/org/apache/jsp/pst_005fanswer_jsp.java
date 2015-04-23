package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import control.post;
import control.UpdateDB;
import model.User;
import control.DBConnect;

public final class pst_005fanswer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<title>Post Answer</title>\n");
      out.write("\n");
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
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"page-container\">\n");
      out.write("                <form action=\"pst_answer.jsp\">\n");
      out.write("                        <h1>Post New Answer </h1><br>\n");
      out.write("                        <input type=\"textarea\" name=\"QID\" placeholder=\"Enter your Question Number\" /><br>\n");
      out.write("                        <input type=\"textarea\" name=\"answers\" placeholder=\"Enter your Answer\" /><br>\n");
      out.write("                        <button type=\"submit\">Post</button>\n");
      out.write("                       \n");
      out.write("                </form>   \n");
      out.write("                    <a href=\"discussion.jsp\"><button>Cancel</button> </a>                             \n");
      out.write("        </div>\n");
      out.write("    \n");
     int QID = Integer.parseInt(request.getParameter("qid"));
     String login_id = (String)session.getAttribute("login_id");
         String answer = request.getParameter("answers");
        //int QID = (Integer)session.getAttribute("QID");
         System.out.println("SOooo hoing..??? !! User"+login_id);
            if( true)
            {               
                post pAns=new post();
                pAns.postA(QID, login_id, answer);
                     
            }
            //out.println(login_id);
            getServletContext().getRequestDispatcher("/Discussion.jsp").forward(request, response);

      out.write("\n");
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
