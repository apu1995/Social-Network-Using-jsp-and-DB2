<%@page import="control.post"%>
<%@page import="control.UpdateDB"%>
<%@page import="model.User"%>
<%@page import="control.DBConnect"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Post Question</title>
</head>
<body>
<%
     String login_id = (String)session.getAttribute("login_id");
         String question = request.getParameter("Questions");
         if(!login_id.equals(null) && !question.equals(null))
        {               
            post pQues=new post(login_id,question);
        }
        else
        {
            out.println("<script>alert('Error Posting the Question');</script>");
        }
        getServletContext().getRequestDispatcher("/Discussion.jsp").forward(request, response);
%>
</body>
</html>