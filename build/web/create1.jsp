<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<jsp:include page="header.jsp" ></jsp:include>
<%@page import="java.sql.*" %>
<%@page import="query.*" %>


<html><head>
<%
try
        
 {
    
    
if (request.getParameter("submit") != null)
       {
    String userid=request.getParameter("uid");
String uid1=request.getParameter("uid");
String pwd=request.getParameter("psw");

boolean status=false;
NewClass q=new NewClass();
ResultSet rs=q.get_data("select * from login where uid='"+uid1+"' and pwd='"+pwd+"'");
status=rs.next();
%>

   <script type="text/javascript">
       function func()
      {
 alert("YOU HAVE LOGIN SUCCESSFULLY");
      }  
        //  alert("ID OR PASSWORD IS WRONG");
  </script>
    </head>
    <body onload="func();"></body>
    <form name="myform"></form>
   
</html>
  <%
             
char ch = uid1.charAt(4);

if((status)&&(ch=='D'))
       {
    
session.setAttribute("userid", userid);
           response.sendRedirect("d_frame.jsp");
      }
else if((status)&&(ch=='H'))
{
    session.setAttribute("userid", userid);
    response.sendRedirect("h_frame.jsp");
}
else if((status)&&(ch=='F'))
{
    session.setAttribute("userid", userid);
    response.sendRedirect("f_interface.jsp");
}

    else if ((status)&&(ch=='A'))
{
    session.setAttribute("userid", userid);
    response.sendRedirect("A_frame.jsp");
}
      else if ((status)&&(ch=='L'))
{
    session.setAttribute("userid", userid);
    response.sendRedirect("l_frame.jsp");
}
        else if ((status)&&(ch=='T'))
{
    session.setAttribute("userid", userid);
    response.sendRedirect("T_frame.jsp");
}
          else if ((status)&&(ch=='E'))
{
    session.setAttribute("userid", userid);
    response.sendRedirect("e_frame.jsp");
}
 else if ((status)&&(ch=='O'))
{
    session.setAttribute("userid", userid);
    response.sendRedirect("office_2.jsp");
}          
else
    {
    response.sendRedirect("login.jsp");
    }
      
    }

     }
catch(Exception e)
{e.printStackTrace();
}

%>

