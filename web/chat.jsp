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
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>MESSAGING</title>
    <link rel="stylesheet" type="text/css" href="discussion.css">
    <link href='http://fonts.googleapis.com/css?family=Open+Sans+Condensed:300' rel='stylesheet' type='text/css'>
    <link rel="stylesheet" type="text/css" href="main.css">
    <link href="style_1.css" type="text/css" rel="stylesheet"/>
    <style>
        body
        {
            background-image: url('chat.jpg');
        }
        #paddings
        {
            margin-top:100px;
            margin-bottom: 10px;
        }
    </style>
</head>
<body>
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
    <center>
             <div id="paddings">
        
    </div>
<%
    
                DBConnect db1= new DBConnect();
                Chat c= new Chat();
                ArrayList<Message> m1 = new ArrayList<Message>();
                m1 = c.fetch();
                int i;
                Message m = new Message();
                for(i=0;i<m1.size();i++)
                {   
                    m=m1.get(i);
                    out.println("<div id=\"question\">"+"<div id=\"left\">" + "To:"+m.getRID() + "</div >" +m.getMessage() + "<div id=\"left\">" +"From:"+ m.getSID() + "</div ></div>");
                }
                
%>
                        <div id="bottom">
				<a href="about.html">About us</a><br>
				LNM Institute of Information Technology
			</div>
    </center>
                             <div id="paddings">
        
    </div>
</body>
</html>