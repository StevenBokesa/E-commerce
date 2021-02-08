package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.Comment;
import bean.Post;
import model.PostDAO;
import model.CommentDAO;

@WebServlet("/CommentServlet")
public class CommentServlet extends HttpServlet {
	
private static final long serialVersionUID = 1L;

/**
* @see HttpServlet#HttpServlet()
*/
public CommentServlet() {
 super();
 // TODO Auto-generated constructor stub
}

/**
* @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
*/
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	HttpSession session = request.getSession(false);
	if (session == null || session.getAttribute("user_id") == null) {
		response.sendRedirect("login");
		return;
	}
	int post_id = Integer.parseInt(request.getParameter("post_id"));
	
	CommentDAO commentDAO = new CommentDAO();
	ArrayList<Comment> comment = new ArrayList<>();
	
	Post post = new Post();
	
	try {
		post = new PostDAO().getPost(post_id);
		comment = commentDAO.getAllCommentsByPost(post_id);
	} catch (Exception e) {
		e.printStackTrace();
	}
	request.setAttribute("comment", comment);
	request.setAttribute("post", post);
	
	request.getRequestDispatcher("WEB-INF/comment.jsp").forward(request, response);
	
}

/**
* @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
*/
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	HttpSession session = request.getSession(false);
	if (session == null || session.getAttribute("user_id") == null) {
		response.sendRedirect("login");
		return;
	}
	
	String comment = request.getParameter("comment").trim();
	int post_id = Integer.parseInt(request.getParameter("post_id"));
	
	if(!comment.equals("")) {
		try {
			CommentDAO commentDAO = new CommentDAO();
			commentDAO.insertComment((int) session.getAttribute("user_id"), post_id, comment);
			response.sendRedirect("home");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
	

}
