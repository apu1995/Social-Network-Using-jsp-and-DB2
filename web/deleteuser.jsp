<%@page import="control.UpdateDB"%>
<%      String login_id= (String)session.getAttribute("login_id");
        System.out.println(login_id);
        UpdateDB n = new UpdateDB();
        n.delete_user1(login_id);
        response.sendRedirect("index.html");
    %>