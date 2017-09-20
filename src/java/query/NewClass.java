/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package query;
import java.sql.*;


/**
 *
 * @author Inspiron_15_5000
 */
public class NewClass {
    
    

    public static void main(String args[])
{
    
    
    
    }

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author admin
 */

    
   
    
    public int insert_data(String query2)
    {
        int s=0;
        try
            {
          
                
           Class.forName("com.mysql.jdbc.Driver");    //driver for MySQL
	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/resume","root","");

           
            PreparedStatement ps=conn.prepareStatement(query2);

          
            s=ps.executeUpdate();
            conn.close();
                

                }
            catch(Exception e)
            {
            System.out.println(e);
            }
        return s;
    }
    
    public int update_data(String query2)
    {
        int s=0;
        try
            {
          
                
           Class.forName("com.mysql.jdbc.Driver");    //driver for MySQL
	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/resume","root","");

           
            PreparedStatement ps=conn.prepareStatement(query2);

          
            s=ps.executeUpdate();
            conn.close();
                

                }
            catch(Exception e)
            {
            System.out.println(e);
            }
        return s;
    }
    

    public int delete_data(String q)
    {
        int s=0;
        Connection conn=null;
        PreparedStatement ps=null;
        
        
        try
        {
             Class.forName("com.mysql.jdbc.Driver");    //driver for MySQL
	 conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/resume","root","");

             ps=conn.prepareStatement(q);

          
            s=ps.executeUpdate();
            conn.close();
            
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
        return s;
    }

    public ResultSet get_data(String q)
    {
        Connection conn=null;
        Statement stat=null;
        ResultSet rs=null;
        try
        {
        
          Class.forName("com.mysql.jdbc.Driver");    //driver for MySQL
	 conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/resume","root","");

       stat=conn.createStatement();
        

        rs=stat.executeQuery(q);
       // conn.close();
	/*while(rs.next())
	{
	System.out.print(rs.getString(1));
	System.out.print(" "+rs.getString(2));
System.out.println();
	}*/
        

}
catch(Exception e)
{
System.out.println(e);
}
return rs;
    
    
    }
}

