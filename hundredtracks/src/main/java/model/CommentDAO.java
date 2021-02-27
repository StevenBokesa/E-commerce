package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bean.Comment;
import util.DBConnection;

public class CommentDAO {
	
	public void insertComment(int user_id, int post_id, String body) throws SQLException {
		Connection conn = DBConnection.getInstance().getConnection();
		PreparedStatement st = conn.prepareStatement("INSERT INTO comment(user_id, post_id, body) VALUES (?,?,?);");
		st.setInt(1, user_id);
		st.setInt(2, post_id);
		st.setString(3, body);
		st.executeUpdate();
	}
	
	public ArrayList<Comment> getAllComments() throws SQLException {
		Connection conn = DBConnection.getInstance().getConnection();
		PreparedStatement st = conn.prepareStatement("SELECT * FROM comment"
				+ " ORDER BY comment_time DESC;");
		ResultSet rs = st.executeQuery();
		ArrayList<Comment> array = new ArrayList<>();
		while(rs.next()) {
			Comment p = new Comment();
			p.setComment_id(rs.getInt("comment_id"));
			p.setPost_id(rs.getInt("post_id"));
			p.setUser_id(rs.getInt("user_id"));
			p.setBody(rs.getString("body"));
			p.setComment_time(rs.getString("comment_time"));
			array.add(p);
		}
		return array; 
	}
	
	public ArrayList<Comment> getUserComment(int user_id) throws SQLException {
		Connection conn = DBConnection.getInstance().getConnection();
		PreparedStatement st = conn.prepareStatement("SELECT * FROM comment WHERE user_id = ? ORDER BY comment_time DESC;");
		st.setInt(1, user_id);
		ResultSet rs = st.executeQuery();
		ArrayList<Comment> array = new ArrayList<>();
		while(rs.next()) {
			Comment p = new Comment();
			p.setComment_id(rs.getInt("comment_id"));
			p.setPost_id(rs.getInt("post_id"));
			p.setUser_id(rs.getInt("user_id"));
			p.setBody(rs.getString("body"));
			p.setComment_time(rs.getString("comment_time"));
			array.add(p);
		}
		return array; 
	}
	
	public void deleteComment(int comment_id) throws SQLException {
		Connection conn = DBConnection.getInstance().getConnection();
		PreparedStatement st = conn.prepareStatement("DELETE FROM comment WHERE comment_id = ?;");
		st.setInt(1, comment_id);
		st.executeUpdate();
	}
	
	public Comment getComment(int comment_id) throws SQLException {
		Connection conn = DBConnection.getInstance().getConnection();
		PreparedStatement st = conn.prepareStatement("SELECT * FROM comment WHERE comment_id = ?;");
		st.setInt(1, comment_id);
		ResultSet rs = st.executeQuery();
		Comment p = new Comment();
		if(rs.next()) {
			p.setComment_id(rs.getInt("comment_id"));
			p.setPost_id(rs.getInt("post_id"));
			p.setUser_id(rs.getInt("user_id"));
			p.setBody(rs.getString("body"));
			p.setComment_time(rs.getString("comment_time"));
		}
		return p; 
	}
	
	public ArrayList<Comment> getAllCommentsByPost(int post_id) throws SQLException {
		Connection conn = DBConnection.getInstance().getConnection();
		PreparedStatement st = conn.prepareStatement("SELECT * FROM comment  WHERE post_id = ?"
				+ " ORDER BY comment_time DESC;");
		st.setInt(1, post_id);
		ResultSet rs = st.executeQuery();
		ArrayList<Comment> array = new ArrayList<>();
		while(rs.next()) {
			Comment p = new Comment();
			p.setComment_id(rs.getInt("comment_id"));
			p.setPost_id(rs.getInt("post_id"));
			p.setUser_id(rs.getInt("user_id"));
			p.setBody(rs.getString("body"));
			p.setComment_time(rs.getString("comment_time"));
			array.add(p);
		}
		return array; 
	}
	
	public String updateComment(Comment comment) {
		try {
			Connection conn = DBConnection.getInstance().getConnection();
			PreparedStatement st = conn.prepareStatement("UPDATE post SET body = ? WHERE comment_id = ?;");
			st.setString(1, comment.getBody());
			st.setInt(2, comment.getComment_id());
			st.execute();
			return "Post Update Successful.";
		} catch (SQLException e) {
			e.printStackTrace();
			return "Post Update Failed.";
		}
	}
	

}
