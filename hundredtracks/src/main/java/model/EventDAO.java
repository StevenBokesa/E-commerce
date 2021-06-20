package model;
import bean.EventBean;
import bean.LoginBean;
import bean.Post;
import bean.User;
import controller.DBConnection;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.http.Part;


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
	
	
	public List<EventBean> findAll() {
         List<EventBean> produc=new ArrayList<EventBean>();
        try {

            db.connect();
            db.pstm=db.con.prepareStatement("SELECT * FROM event");
            db.rs=db.pstm.executeQuery();
            while(db.rs.next()){
                EventBean p=new EventBean();
                p.setEvent_id(db.rs.getInt(1));
                p.setTitle(db.rs.getString(2));
                p.setDescription(db.rs.getString(3));
                p.setPrice(db.rs.getString(4));
                p.setCity(db.rs.getString(5));
                p.setDate(db.rs.getString(6));
                p.setEvent_start(db.rs.getString(7));
                p.setEvent_end(db.rs.getString(8));
                p.setVenue(db.rs.getString(9));
                p.setSeats(db.rs.getString(10));
               
                p.setEvent_organizer(db.rs.getString(12));
                produc.add(p);
                
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(EventDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return produc;
    }
	
	
	public String updateMaybeAttending(EventBean event) {
		try {
			db.connect();
			db.pstm=db.con.prepareStatement("UPDATE event SET maybe = ? WHERE event_id = ?;");
			db.pstm.setInt(1, event.getMaybe()+1);
			db.pstm.setInt(2, event.getEvents_id());
			db.pstm.execute();
			return "Event Update Successful.";
		} catch (SQLException e) {
			e.printStackTrace();
			return "Event Update Failed.";
		}
	}


	public EventBean findEventById(int event_id) {
		// TODO Auto-generated method stub
		 EventBean p=new EventBean();

		
		 try {
	            db.connect();
	            db.pstm=db.con.prepareStatement("SELECT * FROM event WHERE id = ?;");
	            db.pstm.setInt(1, event_id);
	            db.rs=db.pstm.executeQuery();
	            if(db.rs.next()){
	                p.setEvents_id(db.rs.getInt(1));
	                p.setTitle(db.rs.getString(2));
	                p.setDescription(db.rs.getString(3));
	                p.setPrice(db.rs.getString(4));
	                p.setCity(db.rs.getString(5));
	                p.setDate(db.rs.getString(6));
	                p.setEvent_start(db.rs.getString(7));
	                p.setEvent_end(db.rs.getString(8));
	                p.setVenue(db.rs.getString(9));
	                p.setSeats(db.rs.getString(10));
	               
	                p.setEvent_organizer(db.rs.getString(12)); 
	                
	                
	            }
	        } catch (SQLException ex) {
	            Logger.getLogger(EventDAO.class.getName()).log(Level.SEVERE, null, ex);
	        }
         return p;

	}
	
	
}
