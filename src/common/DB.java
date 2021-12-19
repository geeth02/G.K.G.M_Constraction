
package common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


public class DB {

private static Connection connection;

private static void init() throws SQLException,ClassNotFoundException{
Class.forName("com.mysql.cj.jdbc.Driver");
connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3310/constructiondb","root","7878");
  
} 
public static void iud(String sql) throws Exception{
 if(connection==null){
 init();
 }
 connection.createStatement().executeUpdate(sql);
}

public static ResultSet search(String sql) throws Exception{
if(connection==null){
init();
}
return  connection.createStatement().executeQuery(sql);
}

public static Connection getNewConnection() throws Exception{
if(connection== null){
init();
}
return connection;
}
}    

