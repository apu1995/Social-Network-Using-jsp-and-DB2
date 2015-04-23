<%@page import="model.Discussion"%>
<%@page import="model.Question"%>

<%@page import="java.util.ArrayList"%>
<%@page import="control.DBConnect"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Insert title here</title>
    <link rel="stylesheet" type="text/css" href="discussion.css">
    <link rel="stylesheet" type="text/css" href="main.css">
		<link href="style_1.css" type="text/css" rel="stylesheet"/>
    <link href='http://fonts.googleapis.com/css?family=Open+Sans+Condensed:300' rel='stylesheet' type='text/css'>
    <style>
        #paddings
        {
            margin-top:100px;
            margin-bottom: 10px;
        }
    </style>
</head>
<body background="chat.jpg">
    <div id="nav">
			<div id="nav_wrapper">
			<ul>
			<li><a href="home_1.jsp">Home</a></li><li>
			<a href="Discussion.jsp">Discussions</a></li><li>
			<a href="#">Notifications</a></li><li>
			<a href="message.html">Send Message</a></li><li>
			<a href="#">Settings<img src="arrow.png" id="circle" /></a>
				<ul>
				<li><a href="deleteuser.jsp">Delete Account</a></li><li>
				<a href="logout.jsp">Logout</a></li>
				</ul></ul>
			</div>
		</div>
    <div id="paddings">
        
    </div>
<%
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
%>

<div id="paddings">
    
</div>
<center>
<div id="bottom">
				<a href="about.html">About us</a><br>
				LNM Institute of Information Technology
			</div>
</center>
</body>
</html>