<%@page import="java.util.Date"%>
<%@page import="java.sql.Timestamp"%>
<%@page import="control.ValidateInput"%>
<%@page import="control.UpdateDB"%>
<%@page import="model.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>create</title>
    </head>
    <body>
      <% 
         String middle_name = request.getParameter("middle_name");
         String first_name = request.getParameter("first_name");
         String last_name = request.getParameter("last_name");
         String login_id = request.getParameter("login_id");
         String password = request.getParameter("password");
         String cpassword = request.getParameter("cpassword");
         String branch = request.getParameter("branch");
         String rollno = request.getParameter("rollno");
         String gender = request.getParameter("gender");
         String mobileno = request.getParameter("mobileno");
         String house = request.getParameter("house");
         String date_of_birth = request.getParameter("date_of_birth");
         String home_town = request.getParameter("home_town");
         String about = request.getParameter("about");
         String hostel = request.getParameter("hostel");
         String education = request.getParameter("education");
         String security_q = request.getParameter("security_question");
         String security_a = request.getParameter("security_answer");
         if( true /*(first_name != null )  && (login_id != null) && (password != null) && (cpassword != null) && (rollno != null) && (branch!=null) && (gender != null) && (house!=null) && (mobileno != null) && (date_of_birth!=null) && (hostel != null) && (about != null)*/)
            {
              ValidateInput obj = new ValidateInput();
              if((obj.isalpha(first_name)) && (obj.isalpha(last_name))&& (obj.isbeta(rollno))&& (obj.isnum(mobileno))&& (obj.isbeta(hostel)))
             {
                 if(cpassword.equals(password))
                       //  password.equals(cpassword))
                 {
                     UpdateDB DbObj = new UpdateDB();
                     if(DbObj.create_user(login_id,first_name, middle_name, last_name, password, branch, rollno ,gender ,mobileno, house,date_of_birth,home_town,about,hostel,education,security_q , security_a))
                     {
                         request.setAttribute("msg","You are successfully registered !!");
                           getServletContext().getRequestDispatcher("/index.html").forward(request,response);
                        //out.print("<script>alert(\"You are successfully registered !!\");</script>");
                     }
                     else
                    	 out.print("<script>alert(\"Something wrong happened...try again !!\");</script>");
                 }
                 else
                 {
                     out.print("<script>alert(\"Confirm Password and Paaword do not match\");</script>");
                 }
             }
             else
                 {
                     out.print("<script>alert(\"Enter Fields correctly...!!\");</script>");
                 }
            }
         else
                 {
                    
                     out.print("<script>alert(\"Required Fields Left Blank\");</script>");
                 }
     
         %>   
</body>
</html>
