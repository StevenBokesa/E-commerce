package model;

import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;

import bean.EventBean;
import bean.ProfilePicture;
import controller.DBConnection;

public class ProfilePictureDAO {
	DBConnection db=new DBConnection();
    String userNameDB = "";
    String passwordDB = "";

	
	public void persistAvatar(ProfilePicture o) throws IOException {
        try {
        	InputStream inputStream = null;

            db.connect();
            db.pstm=db.con.prepareStatement("update users set avatar = ? where Email_Address = ?");
            if (o.getAvatar() != null) {
                // prints out some information for debugging
                System.out.println(o.getAvatar().getName());
                System.out.println(o.getAvatar().getSize());
                System.out.println(o.getAvatar().getContentType());
                 
                // obtains input stream of the upload file
                inputStream = o.getAvatar().getInputStream();
            }
            if (inputStream != null) {
                // fetches input stream of the upload file for the blob column
                db.pstm.setBlob(1, inputStream);
            }
            db.pstm.setString(2, o.getEmail());
            System.out.println(o.getEmail());
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
	
}
