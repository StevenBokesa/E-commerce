package controller;

import java.sql.*;

/**
 * A Java MySQL UPDATE example.
 * Demonstrates the use of a SQL UPDATE statement against a
 * MySQL database, called from a Java program.
 * 
 * Created by Alvin Alexander, http://devdaily.com
 *
 */
public class JavaMysqlPreparedStatementUpdateExample
{

  public static void main(String[] args)
  {
    try
    {
      // create a java mysql database connection
      String myDriver = "com.mysql.jdbc.Driver";
      String myUrl = "jdbc:mysql://localhost/sociallinks";
      Class.forName(myDriver);
      Connection conn = DriverManager.getConnection(myUrl, "root", "");
    
      // create the java mysql update preparedstatement
      String query = "update users set password = ? where full_name = ?";
      PreparedStatement preparedStmt = conn.prepareStatement(query);
      preparedStmt.setString   (1, "Bokesa12");
      preparedStmt.setString(2, "fred fox");

      // execute the java preparedstatement
      preparedStmt.executeUpdate();
      
      conn.close();
    }
    catch (Exception e)
    {
      System.err.println("Got an exception! ");
      System.err.println(e.getMessage());
    }
  }
}