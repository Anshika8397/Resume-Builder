<%@page contentType="text/html" pageEncoding="UTF-8"%>


<%@page import="query.*" %>
<%@page import="java.sql.*" %>
<jsp:include page="header.jsp" ></jsp:include>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <title>LOGIN PAGE</title>
        <style>
             .d{
                font-size:25px;font-style:normal;font-weight:bolder 
            }
            .input{
                height:40px;font-size:14pt;
            }
        </style>
        
    
    </head>
    
    <body>
       <form name="myform" method="get" action="forgotpassword.jsp">
           <center>
               <br>   
               <br>
               <br>   
               <br>
               <br>
               <br>
               <br>
               <br>
               <center>
                   <font size=8px >Confirm your Password</font>
               </center>
               <br>
               <br>
               <font>
            <table cellspacing="20">
                
                 <tr>
                    <td class="d">
                        User ID:
                    </td>
                    <td>
                        <input class="input" type="text" name="uid"  />
                    </td>
                <tr>
                    <td class="d">
                        Security Question
                    </td>
                    
                    <td>
                        <select name="ques" class="input">
                            <option selected> What is your pet name?</option selected>
                            <option>What is your favorite Color?
                            <option>What is  your Hobby?
                            <option>What is your nick name?
                            </option>
                        </select>
                    </td>
                </tr>
                
                <tr>
                    <td class="d">
                        Answer:
                    </td>
                    <td>
                        <input class="input" type="text" name="ans"  />
                    </td>
                </tr>
                <tr>
                    <td>
                        
                        <input class="input" type="submit" value="confirm" name="submit">
                    </td>
                    
                </tr>
                 
 
  </table>
        </font>    </center>
           
               
            
        </form>
</body>

  </html>

