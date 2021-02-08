/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import bean.LoginBean;
import bean.User;
import controller.DBConnection;

import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProfileDAO {

    DBConnection db=new DBConnection();
    String userNameDB = "";
    String passwordDB = "";

	public String authenticateUser(LoginBean name){
       try {
           
           db.connect();
           db.pstm=db.con.prepareStatement("SELECT EMAIL_ADDRESS, PASSWORD FROM USERS");
           db.rs=db.pstm.executeQuery();
           while(db.rs.next()){
        	   userNameDB = db.rs.getString(1);
        	   passwordDB = db.rs.getString(2);
        	   if(name.getUserName().equals(userNameDB) && name.getPassword().equals(passwordDB))
        	   {
        	   return "SUCCESS"; ////If the user entered values are already present in database, which means user has already registered so I will return SUCCESS message.
        	   }
           }
           db.closeConnection();
       } catch (SQLException ex) {
           ex.printStackTrace();
       }
       return "Invalid user credentials";
    }
	
	public void persist(User o) {
        try {
            db.connect();
            db.pstm=db.con.prepareStatement("INSERT INTO USERS (FULL_NAME,EMAIL_ADDRESS,PASSWORD,MEMBERSINCE) VALUES (?,?,?, CURDATE())");
            db.pstm.setString(2, o.getEmail());
            db.pstm.setString(3, o.getPassword());
            db.pstm.executeUpdate();
            db.closeConnection();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
	
	
	
	public String findName(String name){
        String id="";
       try {
           
           db.connect();
           db.pstm=db.con.prepareStatement("SELECT FULL_NAME FROM USERS WHERE EMAIL_ADDRESS=?");
           db.pstm.setString(1, name);
           db.rs=db.pstm.executeQuery();
           while(db.rs.next()){
               id=db.rs.getString(1);
           }
           db.closeConnection();
       } catch (SQLException ex) {
    	   ex.printStackTrace();
       }
       return id;
    }
	
	
	
	public Date findMembersince(String name){
        Date id = new Date(0);
       try {
           
           db.connect();
           db.pstm=db.con.prepareStatement("SELECT MEMBERSINCE FROM PROFILE WHERE EMAIL=?");
           db.pstm.setString(1, name);
           db.rs=db.pstm.executeQuery();
           while(db.rs.next()){
               id=db.rs.getDate(1);
           }
           db.closeConnection();
       } catch (SQLException ex) {
    	   ex.printStackTrace();
       }
       return id;
    }
}
