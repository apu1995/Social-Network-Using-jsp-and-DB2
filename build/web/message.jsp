<%@page import="model.Chat"%>
<%@page import="model.Message"%>
<%@page import="control.UpdateDB"%>
<%@page import="model.User"%>
<%@page import="java.util.ArrayList"%>
<%@page import="control.DBConnect"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>MESSAGING</title>
</head>
<body>
    
<%
     String SID = (String)session.getAttribute("login_id");
	 String RID = request.getParameter("to");
         String message = request.getParameter("message");
            if(!RID.equals(null))
            {               
                    out.println(SID);
                     UpdateDB DbObj = new UpdateDB();
                     if(DbObj.send_message(SID , RID , message))
                     {          
                         
                           out.print("<alert>Message Successfully Sent</alert>");
                           getServletContext().getRequestDispatcher("/message.html").forward(request,response);
                     }
                     else
                    	 out.print("<script>alert(\"Something wrong happened...try again !!\");</script>");
            }
            else
            {
                out.print("<script>alert(\"Enter Reciever's Name\");</script>");
            }
            
%>
</body>
</html>