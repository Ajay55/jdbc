/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;
import java.sql.*;
import java.io.*;
public class jdbc {

    
    public static void main(String[] args) {
        
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
           Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSDB1","ajay55");
            Statement st=con.createStatement();
            st.executeUpdate("insert into NEW_TABLE values(2,'dinesh','male')");
            System.out.println("success");
            con.close();
            }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}
