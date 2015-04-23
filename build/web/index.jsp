<%@page import="control.DBConnect"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import ="java.sql.*" %>
<%
    try
    {
        String login_id = request.getParameter("username");    
        String password = request.getParameter("password");
        DBConnect db=new DBConnect();
        db.rs = db.st.executeQuery("select login_id,password from user2 where login_id='" + login_id + "' and password='" + password + "'");
        if (db.rs.next()) 
        {
            session.setAttribute("login_id",login_id);
            getServletContext().getRequestDispatcher("/home_1.jsp").forward(request,response);
        } 
        else 
        {
            response.sendRedirect("index.html");
        }
    }
    catch(Exception e)
    {
        out.println(e+"");
        out.println("This is the exception.");
    }
    catch(Error e)
    {
        out.println(""+e);
        out.println("This is the error.");
    }
%>
