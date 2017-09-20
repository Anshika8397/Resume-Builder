<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>

<%@page import="java.sql.*" %>
<%@page import="query.*" %>
<%
    
    if(request.getParameter("submit") !=null)
    {
            
            
            
         

    out.println("ioi");


String id=request.getParameter("text0");
String a=request.getParameter("text1");
String b=request.getParameter("text2");
String c=request.getParameter("text3");
String d=request.getParameter("text4");
String e=request.getParameter("text5");
String f=request.getParameter("text6");
String g=request.getParameter("text7");
String h=request.getParameter("text8");
String i=request.getParameter("text9");
String j=request.getParameter("text10");
String k=request.getParameter("text11");
String str="insert into resume (id,name,email,phone,obj,profile,project,achievements,activity,language,dob,address) values('"+id+"','"+a+"','"+b+"','"+c+"','"+d+"','"+e+"','"+f+"','"+g+"','"+h+"','"+i+"','"+j+"','"+k+"')";   
NewClass q=new NewClass();
int i1=q.insert_data(str);
if(i1>0)
{
    System.out.print("success");
}


    }
    

%>