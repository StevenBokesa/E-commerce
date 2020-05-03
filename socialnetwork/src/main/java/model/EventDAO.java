package model;
import bean.EventBean;
import bean.LoginBean;
import bean.User;
import controller.DBConnection;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EventDAO {

    DBConnection db=new DBConnection();
    String userNameDB = "";
    String passwordDB = "";

	
	public void persist(EventBean o) throws IOException {
        try {
        	InputStream inputStream = null;
            db.connect();
            db.pstm=db.con.prepareStatement("INSERT INTO EVENT (EVENT_TITLE, EVENT_DESCRIPTION, EVENT_PRICE, EVENT_CITY, EVENT_DATE, EVENT_START, EVENT_END, EVENT_VENUE, EVENT_SEATS, IMAGE, EVENT_ORGANIZER) VALUES (?,?,?,?,?,?,?,?,?,?,?)");
            db.pstm.setString(1, o.getTitle());
            db.pstm.setString(2, o.getDescription());
            db.pstm.setString(3, o.getPrice());
            db.pstm.setString(4, o.getCity());
            db.pstm.setString(5, o.getDate());
            db.pstm.setString(6, o.getEvent_start());
            db.pstm.setString(7, o.getEvent_end());
            db.pstm.setString(8, o.getVenue());
            db.pstm.setString(9, o.getSeats());
            if (o.getImage() != null) {
                // prints out some information for debugging
                System.out.println(o.getImage().getName());
                System.out.println(o.getImage().getSize());
                System.out.println(o.getImage().getContentType());
                 
                // obtains input stream of the upload file
                inputStream = o.getImage().getInputStream();
            }
            if (inputStream != null) {
                // fetches input stream of the upload file for the blob column
                db.pstm.setBlob(10, inputStream);
            }
            db.pstm.setString(11, o.getEvent_organizer());
            db.pstm.executeUpdate();
            db.closeConnection();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
	
}
