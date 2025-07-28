

package com.mycompany.villejoenrollmentsystem;
import java.sql.*;

public class VillejoEnrollmentSystem {
        Connection con;
        Statement st;
        ResultSet rs;   
        
        String db;
        String uname;
        String pswd;
        
        public static void main(String[] args){
            StudentsForm stud = new StudentsForm();        
            stud.setVisible (true);
        }
        public void DBConnect(){
       try{
           db = "1stSem_Sy2025_2026";
           uname = "root";
           pswd = "root";
           Class.forName("com.mysql.cj.jdbc.Driver");
           con = DriverManager.getConnection("jdbc:mysql://192.168.1.228:3306/"+ db +"?zeroDateTimeBehavior=CONVERT_TO_NULL",uname,pswd);
           st = con.createStatement();
           System.out.println("Connected");
       }catch(Exception ex){
           System.out.println("Failed to Connect" + ex);
       }     

        }
}