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
<title>Post Answer</title>
</head>
<body>
   
    
<%     int QID = Integer.parseInt(request.getParameter("qid"));
    out.print(""+QID);
     String login_id = (String)session.getAttribute("login_id");
         String answer = request.getParameter("answers");
       
            if(!login_id.equals(null))
            {               
                post pAns=new post();
                pAns.postA(QID, login_id, answer);
                     
            }
           
            getServletContext().getRequestDispatcher("/Discussion.jsp").forward(request, response);
%>
</body>
</html>